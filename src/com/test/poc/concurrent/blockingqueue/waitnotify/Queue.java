package com.test.poc.concurrent.blockingqueue.waitnotify;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Queue<E> {
	java.util.Queue<E> queue;
	int max;
	private Lock lock = new ReentrantLock();
	private Condition take = lock.newCondition();
	private Condition fill = lock.newCondition();

	public Queue(int size) {
		this.queue = new LinkedList<>();
		this.max = size;
	}

	public void put(E e) {
		lock.lock();
		if (queue.size() == max) {
			try {
				fill.await(); // if queue is full wait on thread to fetch object from queue 
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		queue.add(e);
		take.signalAll();
		lock.unlock();
		System.out.println("P : "+e);
	}

	public E take() {
		lock.lock();
		E item = null;
		try {
			if (queue.size() == 0) {
				take.await();// if queue is empty wait on thread to fill the queue
			}
			item = queue.remove();
			//return item;
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} finally {
			fill.signalAll();
			lock.unlock();
		}
		return item;
	}

	public int size() {
		return queue.size();
	}

}
