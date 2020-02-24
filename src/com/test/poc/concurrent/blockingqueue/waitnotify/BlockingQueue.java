package com.test.poc.concurrent.blockingqueue.waitnotify;


public class BlockingQueue {
	public static void main(String[] args) {
		Queue<Integer> queue= new Queue<Integer>(1024);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		 new Thread(producer).start();
		 new Thread(consumer).start();		
		
	}
}
