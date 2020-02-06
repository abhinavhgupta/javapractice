package com.test.poc.threading.intercomm;

public class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread thread= new Thread(this, "Consumer");
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			q.getNum();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}