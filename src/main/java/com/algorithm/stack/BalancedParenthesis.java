package com.algorithm.stack;

import java.util.ArrayDeque;

public class BalancedParenthesis {

	public static boolean isBalancedParenthesis(String expn) {
		ArrayDeque<Character> stk = new ArrayDeque<Character>();
		for (char ch : expn.toCharArray()) {
			switch (ch) {
			case '{':
			case '[':
			case '(':
				stk.push(ch);
				break;
			case '}':
				if (stk.pop() != '{')
					return false;
				break;
			case ']':
				if (stk.pop() != '[')
					return false;
				break;
			case ')':
				if (stk.pop() != '(')
					return false;
				break;
			}
		}
		return stk.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
