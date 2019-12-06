package com.example.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		/*
		 * SORTING USING COLLECTION SORT
		 */
		System.out.println("/* SORTING USING Collections.sort() */");

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(empArr[0]);
		employees.add(empArr[1]);
		employees.add(empArr[2]);
		employees.add(empArr[3]);

		System.out.println("Before sorting");

		employees.forEach(emp -> {
			System.out.print(emp);
		});
		System.out.println("\nAfter sorting");
		Collections.sort(employees);

		employees.forEach(emp -> {
			System.out.print(emp);
		});
		
		System.out.println("\n/* SORTING USING Arrays.sort() */");

		Arrays.sort(empArr);

		System.out.println("\nDefault Sorting of Employees list:\n" + Arrays.toString(empArr));

	}

}
