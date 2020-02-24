package com.test.poc.functionalinterface;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		int a = 5;
		Square s = (int x) -> x * x;
		int ans = s.calculate(a);
		System.out.println(ans);
		System.out.println(s.calculate6(a));

	}

}
