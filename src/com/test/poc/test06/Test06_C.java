package com.test.poc.test06;

public class Test06_C extends Test06_B {

	public void display() {
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		Test06_C c = new Test06_C();
		Test06_B b = c;
		b.display();

	}

}
