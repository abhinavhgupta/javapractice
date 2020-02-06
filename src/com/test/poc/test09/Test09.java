package com.test.poc.test09;

import java.util.TreeMap;

public class Test09 {

	public static TreeMap<Integer, Integer> tMap = new TreeMap<>();

	public static void main(String[] args) {
		tMap.put(3, 3);
		tMap.put(9, 9);
		tMap.put(5, 5);
		tMap.put(2, 2);
		tMap.put(87, 89);
		tMap.put(25, 25);

		System.out.println(tMap);
	}

}
