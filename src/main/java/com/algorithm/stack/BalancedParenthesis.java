package com.algorithm.stack;

import java.util.ArrayDeque;

//Stacks can be used to check a program for balanced symbols (such as {}, (), []).
//The closing symbol should be matched with the most recently seen opening symbol.
//Example: {()} is legal, {() ({})} is legal, but {((} and {(}) are not legal
	
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
