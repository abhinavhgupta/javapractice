package com.test.poc.threading.intercomm;

public class Q {
	int num;
	boolean valueSet = false;

	public void getNum() {
		System.out.println("GetNum " + num);
	}

	public void setNum(int num) {
		System.out.println("SetNum " + num);
		this.num = num;
	}
}
