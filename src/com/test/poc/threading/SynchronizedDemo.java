package com.test.poc.threading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Counter counter = new Counter();

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});
		thread.start();

		System.out.println("Count " + counter.counter);
	}

}

class Counter {
	int counter;

	public void increment() {
		counter++;
	}
}