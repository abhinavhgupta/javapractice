package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Input : adfsdfasdfsadfsa
 * 
 * output: a4d4f4s4, Sorted and counted.
 * 
 * @author abhinav.h.gupta
 *
 */
public class CalculateLetters {

	public static void main(String[] args) {
		
		String input = "adfsdfasdfsadfsa";
		char[] chars = input.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		List<String>  strings= new ArrayList<String>();
		Integer in;
		
		for (int index = 0; index < chars.length; index++) {
			in = map.get(chars[index]);
			if(in==null) {
				map.put(chars[index], 1);
			}else {
				in++;
				map.put(chars[index], in);
			}
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    strings.add(entry.getKey()+""+ entry.getValue());
		}
		
		Collections.sort(strings);
		
		strings.forEach(s->System.out.print(s));

	}

}
