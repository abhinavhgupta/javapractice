package com.test.poc.threading.intercomm;

public class Producer implements Runnable {

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread thread= new Thread(this, "Producer");
		thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.setNum(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}