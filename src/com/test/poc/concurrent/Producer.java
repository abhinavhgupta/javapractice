package com.test.poc.concurrent;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	int i = 0;

	@Override
	public void run() {
		
		while (i<=20) {
			try {
				queue.put(i);
				/*queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);
				queue.put(i++);*/
				System.out.println("Msg, "+i+", Produced");
				i++;
				//System.out.println("----");
				
				//Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
