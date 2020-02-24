package com.test.poc.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		while (true) {
			try {
//				System.out.println("Size: "+queue.size());
				//System.out.println(Thread.currentThread().getName()+", "+queue.take());
				System.out.println("Msg, "+queue.take()+", Consumed by "+ Thread.currentThread().getName());
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
