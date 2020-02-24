package com.test;

public class D {

	public static int num = 20;

	public static void m1() {
		try {
			throw new IllegalArgumentException("exce");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		C c = new C();
		c.add();

		D d = null;
		System.out.println(d.num);
		m1();

	}

}
