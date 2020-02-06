package com.test.poc.test11;

public class Test11 {
	private int num;
	private static int num2;

	{
		num += 10;
		num2 += 10;
	}

	public void m() {
		System.out.println("num in m() - " + num);
		System.out.println("num2 in m() - " + num2);
	}

	public static void main(String[] args) {
		Test11 test1 = new Test11();
		test1.m();
		Test11 test2 = new Test11();
		test2.m();
	}
}
