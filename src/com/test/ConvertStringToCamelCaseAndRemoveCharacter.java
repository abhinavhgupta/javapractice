package com.test;

/**
 * Input this_is_my_varibale output thisIsMyVaribale
 */
public class ConvertStringToCamelCaseAndRemoveCharacter {

	public static void main(String[] args) {
		String input = "thits_iiis_my_varibale";

		String[]  strings = input.split("_");
		String newString = strings[0];

		for (int index = 1; index < strings.length; index++) {
			String indexedString = strings[index];
			String smallCharacter = String.valueOf(indexedString.charAt(0));			
			indexedString = indexedString.replaceFirst(smallCharacter, smallCharacter.toUpperCase());
			smallCharacter = null;
			newString = newString.concat(indexedString);
			indexedString = null;
		}
		System.out.println(newString);

	}

}
