package com.test.poc.test05;

public class Test05_C extends Test05_B {

	public void display() {
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		Test05_C c = new Test05_C();
		Test05_B b = new Test05_B();
		Test05_A a = new Test05_A();
		b = (Test05_B) a;
		c.display();
		b.display();

	}

}
