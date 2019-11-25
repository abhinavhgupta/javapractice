package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] integers = { 10, 2, 3, 4, 40, 5, 55, 56, 78,1,0 };

		 Integer[] arr2 = doSelectionSort(integers);

		 List<Integer> list = Arrays.asList(arr2);
		list.forEach(i->System.out.print(i+", "));

	}

	private static Integer[] doSelectionSort(Integer[] integers) {
		int length = integers.length;
		for (int i = 0; i < length; i++) {
			int index = i;
			for (int j = i + 1; j < length; j++) {
				System.out.println("integers["+j+"] "+integers[j]);
				System.out.println("integers["+i+"] "+integers[i]);
				if (integers[j] < integers[i]) {
					index = j;
				
				int smallerNumber = integers[index];

				integers[index] = integers[i];
				integers[i] = smallerNumber;}
				
				List<Integer> list = new ArrayList<Integer>(Arrays.asList(integers));
				list.forEach(k -> System.out.print(k + ", "));
				System.out.println("");
			}
			System.out.println("----------------------------------");
		}
		return integers;
	}

}
