package com.test.poc.threading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread.start();
		Thread.sleep(10);
		thread2.start();
		
		thread.join();
		thread2.join();
		
		System.out.println("Bye");

	}
}
