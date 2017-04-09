package com.algorithm.stack;

import java.util.ArrayDeque;

public class ReverseStack {

	public static <T> void reverseStack(ArrayDeque<T> stk) {
		if (stk.isEmpty()) {
			return;
		} else {
			T value = stk.pop();
			reverseStack(stk);
			insertAtBottom(stk, value);
		}
	}

	public static <T> void insertAtBottom(ArrayDeque<T> stk, T value) {
		if (stk.isEmpty()) {
			stk.push(value);
		} else {
			T out = stk.pop();
			insertAtBottom(stk, value);
			stk.push(out);
		}
	}
}
