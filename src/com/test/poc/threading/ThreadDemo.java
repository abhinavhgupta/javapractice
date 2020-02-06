package com.test.poc.threading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread");
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread2");
			}
		});

		thread.start();
		Thread.sleep(10);
		thread2.start();

	}
}
