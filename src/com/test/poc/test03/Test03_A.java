package com.test.poc.test03;

public class Test03_A  {

	public void display() {
		try {
			throw new IllegalArgumentException("IllegalArgumentException");
		}catch(Exception e) {
			throw new Exception("Exception");
		}
		finally {
			throw new NullPointerException("Null");
		}
	}

	public static void main(String[] args) {
		Test03_A a= new Test03_A();
		a.display();
	}

}
