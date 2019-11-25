package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		/*
		 * List<Integer> number = Arrays.asList(2,3,4,5);
		 * 
		 * // demonstration of map method List<Integer> square = number.stream().map(x
		 * -> x*x). collect(Collectors.toList()); System.out.println(square);
		 * 
		 * IntStream.range(1, 10).forEach(System.out::println);
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(Arrays.stream(new int[] {2,3,4,5}) .map(x->x) .average());
		 */

		/*
		 * Stream<Date> stream = Stream.generate(() -> { return new Date(); });
		 * stream.forEach(p -> System.out.println(p));
		 */

		/*
		 * IntStream stream = "12345_abcdefg".chars(); stream.forEach(p ->
		 * System.out.println(p));
		 */

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		/*
		 * memberNames.stream().filter((s) -> s.startsWith("A"))
		 * .map(String::toUpperCase).sorted() .forEach(System.out::println);
		 */

		/*
		 * memberNames.stream().sorted() .map(String::toUpperCase)
		 * .forEach(System.out::println);
		 */
		
		/*memberNames.stream()
		.sorted()
		.map(String::toUpperCase)
		.collect(Collectors.toList())
		.stream()
		.filter((s) -> s.startsWith("A"))
		.forEach(System.out::println);*/
		
		memberNames.stream().count();
	}

}
