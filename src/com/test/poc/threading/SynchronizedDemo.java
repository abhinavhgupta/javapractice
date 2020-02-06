package com.test.poc.threading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.increment();
		System.out.println("Count " + counter.counter);
	}

}

class Counter {
	int counter;

	public void increment() {
		counter++;
	}
}