package com.test.poc.test02;

public class Test02_Thread extends Thread {

	public void run() {
		System.out.print(" run");
	}

	public static void main(String[] args) {
		Test02_Thread a = new Test02_Thread();
		a.start();
		System.out.print(" main");
		
		System.out.println(String.valueOf(12));
	}

}
