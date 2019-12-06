package com.example.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return (int) (e1.getSalary() - e2.getSalary());
		}
	};

	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getAge() - e2.getAge();
		}
	};

	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		

		/*
		 * SORTING USING COLLECTION SORT
		 */
		System.out.println("/* SORTING USING Collections.sort(List<T> list, Comparator<? super T> c) */");

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(empArr[0]);
		employees.add(empArr[1]);
		employees.add(empArr[2]);
		employees.add(empArr[3]);

		System.out.println("Before sorting");

		employees.forEach(emp -> {
			System.out.print(emp);
		});
		
		System.out.println("\n After sorting on NAME");
		Collections.sort(employees, NameComparator);
		
		employees.forEach(emp -> {
			System.out.print(emp);
		});
		
		System.out.println("\n After sorting on AGE");
		Collections.sort(employees, AgeComparator);
		
		employees.forEach(emp -> {
			System.out.print(emp);
		});
		
		System.out.println("\n After sorting on Salary");
		Collections.sort(employees, SalaryComparator);
		
		employees.forEach(emp -> {
			System.out.print(emp);
		});
		
		
		System.out.println("\n/* SORTING USING Arrays.sort(T[] a, Comparator<? super T> c) */");

		Arrays.sort(empArr, SalaryComparator);

		System.out.println("\n After sorting on Salary:\n" + Arrays.toString(empArr));
		

		Arrays.sort(empArr,AgeComparator);

		System.out.println("\nAfter sorting on AGE:\n" + Arrays.toString(empArr));
		

		Arrays.sort(empArr,NameComparator);

		System.out.println("\nAfter sorting on NAME:\n" + Arrays.toString(empArr));
	}

}
