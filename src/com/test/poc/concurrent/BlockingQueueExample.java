package com.test.poc.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * we don't need synchronize in Blocking Queue as it take car of itself.
 * 
 * @author abhinav.h.gupta
 *
 */
public class BlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer, "producer 1").start();
		//new Thread(producer, "producer 2").start();
		
		new Thread(consumer, "Consumer 1").start();
		Thread.sleep(40);
		new Thread(consumer, "Consumer 2").start();
		Thread.sleep(40);
		new Thread(consumer, "Consumer 3").start();Thread.sleep(40);
		new Thread(consumer, "Consumer 4").start();

		/*
		 * try { Thread.sleep(4000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
	}

}
