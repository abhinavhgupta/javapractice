package com.test.poc.functionalinterface;

import java.util.function.Function;

public class TestComposeFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> multiply = (value) -> value * 2;
		Function<Integer, Integer> add = (value) -> value + 3;

		Function<Integer, Integer> addThenMultiply = multiply.compose(add);
		Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);

		/**
		 * Compose 1st it i will do argument function then called function
		 * 1st it will do add then multiply
		 *  (5+3)2
		 */

		Integer result1 = addThenMultiply.apply(5);
		System.out.println(result1);

		/**
		 * Compose 1st it i will do called function then argument function
		 * 1st it will do multiply then add
		 *  (5*2) + 3
		 */
		result1 = multiplyThenAdd.apply(5);
		System.out.println(result1);
	}

}
