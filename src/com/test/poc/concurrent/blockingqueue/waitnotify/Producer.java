package com.test.poc.concurrent.blockingqueue.waitnotify;

public class Producer implements Runnable {
	Queue<Integer> queue;
	int i = 0;
	public Producer(Queue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
	
		while (true) {
			queue.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
