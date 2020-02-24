package com.test.poc.functionalinterface;

import java.util.function.Predicate;

public class TestPredicateFunction {

	public static void main(String[] args) {
		/**
		 * (text) -> text.startsWith("A") is implementation of test function from
		 * Predicate interface
		 */
		Predicate<String> startsWithA = (text) -> text.startsWith("A");
		Predicate<String> endsWithX = (text) -> text.endsWith("x");

		Predicate<String> composed = startsWithA.and(endsWithX);
		System.out.println(composed);
		String input = "A hardworking person must relax";
		boolean result = composed.test(input);
		System.out.println(result);
	}

}
