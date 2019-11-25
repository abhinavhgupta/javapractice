package com.test;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*
		 * Date currentDate = new Date(); Calendar calendar = Calendar.getInstance();
		 * calendar.setTime(currentDate); calendar.add(Calendar.DAY_OF_MONTH, 180); Date
		 * currentDatePlus180 = calendar.getTime();
		 * System.out.println(currentDatePlus180);
		 * 
		 * 
		 * String salesOrderUrl = String.format("ABC/%s", "DEF/ADAS");
		 * System.out.println(salesOrderUrl);
		 */
		Test test = new Test();
		System.out.println(test.test());
		String a =null;
		System.out.println("TRUE".equalsIgnoreCase(a));
		
		boolean b;
		  try {
		   b = true;
		   throw new ArithmeticException("arithmetic exception");
		 
		  } catch (Exception e) {
		   b = false;
		  } finally {
		   b = true;
		  }
		System.out.println(b);

	}

	public int test() {
		try {

			// List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8, 6, 9);

			// integers.forEach(i->System.out.println(i));
			//System.out.println(1);
			return 1;
		} catch (Exception e) {
			//System.out.println(2);
			return 2;
		} finally {
			//System.out.println(3);
			return 3;
		}
	}

}
