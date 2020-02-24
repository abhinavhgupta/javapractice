package com.test.poc.concurrent.blockingqueue.waitnotify;

public class Consumer implements Runnable {

	Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(queue.take());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
