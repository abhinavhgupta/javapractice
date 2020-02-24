package com.test.poc.threading.intercomm;

public class Q {
	int num;
	boolean valueSet = false;

	public void getNum() {
		synchronized (this) {
		/*	while (!valueSet) {
				try {
					System.out.println("wait get " + Thread.currentThread().getName());
					wait();
					System.out.println("wait get break");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			System.out.print("GetNum " + num);
			System.out.print(", Thread " + Thread.currentThread().getName());
			System.out.println();
			valueSet = false;
			notify();
		}
	}

	public void setNum(int num) {
		synchronized (this) {
			while (valueSet) {
				try {
					System.out.println("wait set " + Thread.currentThread().getName());
					wait();
					System.out.println("wait set break");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("SetNum " + num);
			System.out.print(", Thread " + Thread.currentThread().getName());
			System.out.println();
			this.num = num;
			valueSet = true;
			notify();
		}
	}
}
