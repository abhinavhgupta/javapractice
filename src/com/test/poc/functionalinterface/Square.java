package com.test.poc.functionalinterface;


@FunctionalInterface
public interface Square {
	default int calculate(int x) {
		return x;

	}

	 abstract int calculate6(int x);
	// int calculate1(int x);
	/*
	default int calculate1(int x) {
		return x;

	}

	default int calculate2(int x) {
		return x;

	}

	default int calculate3(int x) {
		return x;

	}

	default int calculate4(int x) {
		return x;

	}

	default int calculate5(int x) {
		return x;

	}*/
}
