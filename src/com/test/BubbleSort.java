package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {

		Integer[] integers = { 10, 2, 3, 4, 40, 5, 55, 56, 78, 1, 0 ,-1 };

		BubbleSort aPeak = new BubbleSort();
		aPeak.bubbleSort(integers);
		// aPeak.printArray(integers);

	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void bubbleSort(Integer integers[]) {
		int n = integers.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.println("integers["+j+"] "+integers[j]);
				System.out.println("integers["+(j+1)+"] "+integers[j+1]);
				if (integers[j] > integers[j + 1]) {
					// swap temp and arr[i]
					int temp = integers[j];
					integers[j] = integers[j + 1];
					integers[j + 1] = temp;
				}
				// System.out.println(arr.);
				List<Integer> list = new ArrayList<Integer>(Arrays.asList(integers));
				list.forEach(k -> System.out.print(k + ", "));
				System.out.println(" ");
			}
		System.out.println("---------------------------------------");
		}
	}

}
