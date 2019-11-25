package com.test;

import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {
		System.out.println(isParenthesisBalanced("()"));
		System.out.println(isParenthesisBalanced("{+1(23+34)}"));
		System.out.println(isParenthesisBalanced("{()}"));
		System.out.println(isParenthesisBalanced("{(()}"));
	}

	public static boolean isParenthesisBalanced(String value) {
		Stack<Character> charStack = new Stack<>();
		for (Character ch : value.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				charStack.push(ch);
			} else if (ch == '}') {
				if (charStack.isEmpty() || charStack.peek() != '{') {
					return false;
				} else {
					charStack.pop();
				}
			} else if (ch == ')') {
				if (charStack.isEmpty() || charStack.peek() != '(') {
					return false;
				} else {
					charStack.pop();
				}
			} else if (ch == ']') {
				if (charStack.isEmpty() || charStack.peek() != '[') {
					return false;
				} else {
					charStack.pop();
				}
			}
		}
		return charStack.isEmpty();
	}
}
