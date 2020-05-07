package com.test.poc.test02;

public class Testm {

	public static void main(String[] args) {
		Testm testm = new Testm();
		System.out.println(testm.test());
		
		int a = 0;
		int b= 6;
		int fraction =a/b;
		System.out.println(fraction);

	}

	private int test() {
		try {
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}

	

}
