package com.test;

import java.sql.Time;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CompareTriplets {

	public static void main(String[] args) {
		int[] arr = { 10000000, 20000000, 3, 0, 0, -1, -2, -1, -1, -1 };

//		plusMinus(arr);
//		printHash(6);
//		calculateMin();
//		calculateCandels();
//		gcd();
//		timeConversion();
//		calculateGrades();
//		hotelLifts();
//		packNumbers();
//		bonAptit();
//		migratoryBirds();
//		countApplesAndOranges();
//		sumOfHourGlass();
//		stringCheck();
//		streams();
//		calculateMultiples();
//		calculateSmallestNumberDoesNotOccurInArray();
//		convertToBinary();
//		binaryToDecimal();
		streamOnArrayList();

	}

	private static void streamOnArrayList() {
		List<Integer> integers = new ArrayList<>();

		for (int i = 0; i < 25; i++) {
			integers.add(i);
		}

		//Predicate<Integer> byNum = in -> in > 30;

		List<Integer> result = integers.stream().filter(in -> in > 5).collect(Collectors.toList());

		result.forEach(in -> System.out.print(in + ", "));

	}

	private static void binaryToDecimal() {
		String binaryString = "10100001";
		int decimal = Integer.parseInt(binaryString, 2);
		System.out.println(decimal);
	}

	private static void convertToBinary() {
		int given = 161;
		int mod;
		String s = "";
		int count = 0;
		List<Integer> gap = new ArrayList<>();
		while (given > 0) {
			mod = given % 2;
			s = mod + "" + s;
			given = given / 2;

			if (mod == 1) {
				if (count > 0) {
					gap.add(count);
				}
				count = 0;
			} else {
				if (s.contains("1"))
					count++;
			}
		}
		System.out.print(s);
		System.out.println();
		System.out.println("Size ->" + gap.size());
		List<Integer> sortedList = gap.stream().sorted().collect(Collectors.toList());
		if (gap.size() > 0)
			System.out.println("Largest gap->" + sortedList.get(sortedList.size() - 1));
	}

	private static void calculateSmallestNumberDoesNotOccurInArray() {
		int[] A = { -1, -3, -6, -4, -1, -2, -8, 1, 3, 2, 4, 6, 7, 8, 9, 5 };
		int temp = 1;

		List<Integer> num = Arrays.stream(A).sorted() // IntStream
				.boxed() // Stream<Integer>
				.collect(Collectors.toList());

		for (int integer : num) {
			if (integer == temp) {
				temp++;
			}
		}

		System.out.println();
		System.out.println(temp);

	}

	private static void streams() {
		/*
		 * Stream.of(1,2,3,4,5,6).sorted() .findFirst() .ifPresent(System.out::println);
		 */
//		Arrays.stream(new int[]{1,2,3,4,5,6}).map(x->x*x).average().ifPresent(System.out::println);

		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6 }).forEach(System.out::print);

	}

	private static void calculateMultiples() {
		int x = 3;
		int y = 5;
		int z = 10;
		int n = 12;
		for (int i = 1; i <= n; i++) {
			if (i % x == 0 && i % z != 0) {
				System.out.println(i);

			} else if (i % y == 0 && i % z != 0) {
				System.out.println(i);
			}
		}
	}

	private static void stringCheck() {
		List<Integer> hotel_ids = Arrays.asList(1, 2, 1, 1, 2, 1);

		Map<Integer, Integer> hotelcount = new HashMap<>();
		String keywords = "breakfast beach citycenter location metro view staff price";
		String test = "This hotel has a nice view of the citycenter. The location is perfect., This hotel has a nice view of the citycenter. The location is perfect., This hotel has a nice view of the citycenter. The location is perfect.,This hotel has a nice view of the citycenter. The location is perfect.,This hotel has a nice view of the citycenter. The location is perfect.,This hotel has a nice view of the citycenter. The location is perfect.";
		List<String> reviews = Arrays.asList(test.split(","));
		List<String> strings = Arrays.asList(keywords.split(" "));
		// hotelcount.put(1, 1);
		String review = "";
		for (int i = 0; i < hotel_ids.size(); i++) {
			int t = hotel_ids.get(i);
			int count = hotelcount.get(t) == null ? 0 : hotelcount.get(t);
			review = reviews.get(i);
			for (String s : strings) {
				if (review.contains(s)) {
					count++;
				}
			}
			hotelcount.put(t, count);
		}

		Set<Entry<Integer, Integer>> set = hotelcount.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		for (Entry<Integer, Integer> entry : list) {
			System.out.println(entry.getValue());
			// output.add(entry.getValue());
		}

		List<Integer> output = new ArrayList<>();
		int index = 0;
		int max = 0;
		for (Entry<Integer, Integer> entry : hotelcount.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
			max = entry.getValue();
			output.add(entry.getValue());
		}

	}

	private static void sumOfHourGlass() {
		int daas[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int sum = 0;
		int index = 0;
		int count = 0;
		while (true) {
			for (int i = 0; i < 6; i++) {
				count = 0;
				for (int j = 0; j < 6; j++) {
//		    	  if(count<3) {
//		    	  count++;
					System.out.print(daas[i][j] + " ");
//		    	  sum = sum+daas[i][j];
//		    	  }
				}
				System.out.println(sum);
			}
		}

	}

	private static void bonAptit() {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
		int k = 3;
		int b = 7;

		int notEat = arr.get(k);
		int sum = arr.stream().mapToInt(Integer::intValue).sum() - notEat;
//		if(sum == b)

	}

	private static void hotelLifts() {
//		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
//				23, 24, 25, 26, 27, 28, 29, 30, 113, 104);

		List<Integer> arr = Arrays.asList(4, 13, 14, 24, 113, 104);
		List<Integer> integers = new ArrayList<>();
		int count = 1;

	/*	for (Integer in : arr) {
			int newValue = in;
			char[] chars = ("" + newValue).toCharArray();
			String las = "";
			if (chars.length >= 2) {
				las = new String(chars);
			}
			if (String.valueOf(chars[chars.length - 1]).equals(String.valueOf(4)) || las.contains("13")
					|| las.equals("13")) {
				newValue = ++in;
			}
			integers.add(newValue);
		}*/

		while (integers.size() < arr.size()) {

			char[] chars = ("" + count).toCharArray();
			String las = "";
			if (chars.length >= 2) {
				las = new String(chars);
			}
			if (String.valueOf(chars[chars.length - 1]).equals(String.valueOf(4)) || las.contains("13")
					|| las.equals("13")) {
				count++;
				continue;
			}
			integers.add(count);
			count++;

		}

		System.out.println(integers.size());
		System.out.println(arr.size());

		integers.forEach(a -> System.out.print(a + ","));
		System.out.println();
		arr.forEach(a -> System.out.print(a + ","));
		System.out.println();
		System.out.println(10 % 4);

	}

	private static void countApplesAndOranges() {
		int start = 7, end = 12, atree = 4, btree = 20;
		int[] apples = { 1, 4, 6, -10, 10 };
		int[] oranges = { -3, -15, 5 };
		int count = 0;

		for (int i = 0; i < apples.length; i++) {

			if (atree + apples[i] >= start) {
				count++;
			}

		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < oranges.length; i++) {

			if (btree + oranges[i] <= end && btree + oranges[i] >= start) {
				count++;
			}

		}
		System.out.println(count);
	}

	private static void migratoryBirds() {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		Map<Integer, Integer> birds = new HashMap<>();
		int count = 1;

		for (Integer b : arr) {
			if (birds.get(b) == null) {
				count = 1;
			} else {
				count = birds.get(b) + 1;
			}
			birds.put(b, count);
		}
		int bird = 0;
		int max = 0;
		for (Entry<Integer, Integer> entry : birds.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				bird = entry.getKey();
			}
			if (entry.getValue() == max) {
				if (bird > entry.getKey()) {
					bird = entry.getKey();
				}

			}
		}
		System.out.println(bird);
		System.out.println(max);

	}

	static List<String> packNumbers() {

		List<Integer> arr = Arrays.asList(8, 5, 5, 5, 7, 7, 3, 4, 7, 7, 7, 12, 12, 12, 12, 12, 1, 5, 6, 7, 7, 7, 7, 8,
				9, 9, 9, 9, 9);

		List<String> gen = new ArrayList<String>();
		List<Integer> temp = new ArrayList<Integer>();
		int indx;
		int currentNumber = 0;
		int previousNumber = 0;
		int count = 1;
		String newNumber;

		for (int index = 0; index < arr.size(); index++) {

			indx = temp.size();
			currentNumber = arr.get(index);
			if (previousNumber == currentNumber) {
				count++;
			} else {
				temp.add(currentNumber);
				count = 1;
			}

			if (count > 1) {
				newNumber = String.valueOf(previousNumber) + ":" + String.valueOf(count);
				gen.set(indx - 1, newNumber);
			} else {
				newNumber = String.valueOf(currentNumber);
				gen.add(newNumber);
			}

			previousNumber = currentNumber;

		}

		gen.forEach(a -> System.out.println(a));
		return gen;
	}

	private static void calculateGrades() {
		List<Integer> list = Arrays.asList(4, 73, 67, 38, 33);
		List<Integer> li = new ArrayList<Integer>();
		for (int index = 1; index < list.size(); index++) {
			int grade = list.get(index);
			int mod = grade % 5;
			if (mod >= 3) {
				int round = 5 - mod;
				int temp = grade + round;
				if (temp > 40) {
					grade = temp;
				}
			}
			System.out.println(grade);
			li.add(grade);

		}

	}

	private static void gcd() {
		int a = 25, b = 10;
		while (b > 0) {
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		System.out.println(a);

	}

	private static void timeConversion() {

		String givenTime = "07:05:45PM";
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssa");

		try {
			Time time;
			time = new Time(dateFormat.parse(givenTime).getTime());
			System.out.println(time.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static int calculateCandels() {

		String[] arItems = { "1", "2", "3", "3" };
		int[] ar = new int[4];
		for (int i = 0; i < 4; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int max = 0;
		int count = 0;

		for (int i : ar) {
			if (ar[i] > max) {
				max = ar[i];
			}

		}

		for (int i : ar) {
			if (ar[i] == max) {
				count++;
			}
		}

		return count;

	}

	/**
	 * Sum of 1st 4 smallest numbers & sum of last 4 numbers
	 */
	@SuppressWarnings("unchecked")
	private static void calculateMin() {
		long[] arr = { 256741038, 623958417, 467905213, 714532089, 938071625 };

		Arrays.sort(arr);

//		 List<Integer> art= Arrays.stream(arr).boxed().collect(Collectors.toList());
		// Collections.sort(art);

		LongStream.of(arr).forEach(a -> System.out.print(a + ","));
		System.out.println();
		long[] first = Arrays.copyOfRange(arr, 0, 4);
		long[] last = Arrays.copyOfRange(arr, arr.length - 4, arr.length);
		System.out.println();
		System.out.print(LongStream.of(first).sum());
		System.out.print(" " + LongStream.of(last).sum());

	}

	private static void printHash(int in) {
		for (int i = 0; i < in; i++) {

			for (int j = 1; j < in - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}

			System.out.println("");
		}
	}

	static void plusMinus(int[] arr) {
		int len = arr.length;
		DecimalFormat dec = new DecimalFormat("#0.0000");
		long positive = 0;
		long negative = 0;
		long zero = 0;

		for (int i = 0; i < len; i++) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}

		}

		Double ratio = new Double((float) positive / len);

		System.out.println(dec.format((float) positive / len));

	}
}
