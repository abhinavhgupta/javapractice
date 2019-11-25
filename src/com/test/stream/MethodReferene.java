package com.test.stream;

import java.util.ArrayList;
import java.util.List;

public class MethodReferene {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
        list.add("Geeks"); 
        list.add("For"); 
        list.add("GEEKS"); 
        
        list.forEach(new Test()::printTest);

	}

}
