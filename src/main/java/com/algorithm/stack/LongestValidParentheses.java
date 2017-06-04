package com.algorithm.stack;

//Given a string containing just the characters '(' and ')', find the length of the longest valid
//(well-formed) parentheses substring.
//For "(()", the longest valid parentheses substring is "()", which has length = 2.
//Another example is ")()())", where the longest valid parentheses substring is "()()", which has
//length = 4.

public class LongestValidParentheses {

	public static int longestValidParentheses(String s) {
		if (s.length() == 0) {
			return 0;
		}
		char[] chars = s.toCharArray();
		Stack stack = new Stack();
		int maxLen = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				stack.push(i);
			} else if (!stack.isEmpty() && chars[stack.peek()] == '(') {
				stack.pop();
				int curLen = 0;
				if (!stack.isEmpty()) {
					curLen = i - stack.peek();
				} else {
					curLen = i + 1;
				}
				maxLen = Math.max(maxLen, curLen);
			} else {
				stack.push(i);
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		String string="(()";
		System.out.println(longestValidParentheses(string));
	}
}
