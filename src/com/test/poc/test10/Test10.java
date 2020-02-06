package com.test.poc.test10;

public class Test10 {
	private static int num = 10;

	private  int num2 = 10;

	public Test10() {
		num += 10;
		num2 += 10;
	}

	public void m() {
		System.out.println("num in m() - " + num);
		System.out.println("num2 in m() - " + num2);
	}

	public static void main(String[] args) {
		Test10 test1 = new Test10();
		test1.m();
		Test10 test2 = new Test10();
		test2.m();
	}
}
