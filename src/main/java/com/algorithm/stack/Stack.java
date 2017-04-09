package com.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Stack {
	private static final int CAPACITY = 1000;
	public int[] data;
	public int top = -1;

	public Stack() {
		this(CAPACITY);
	}

	public Stack(int capacity) {
		data = new int[capacity];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int size() {
		return (top + 1);
	}

	public void print() {
		for (int i = top; i > -1; i--)
			System.out.print(" " + data[i]);
		System.out.println();
	}

	public void push(int value) throws IllegalStateException {
		if (size() == data.length)
			throw new IllegalStateException("StackOvarflowException");
		top++;
		data[top] = value;
	}

	public int pop() {
		if (isEmpty())
			throw new IllegalStateException("StackEmptyException");
		int topVal = data[top];
		top--;
		return topVal;
	}

	public int peek() throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException("StackEmptyException");
		return data[top];
	}

	public static void main(String[] args) {
		Stack s = new Stack(1000);
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		s.print();
		System.out.println(s.peek());
		for (int i = 1; i <= 5; i++) {
			s.pop();
		}
		s.print();

		Deque<Integer> ss = new ArrayDeque<Integer>();
		for (int i = 1; i <= 10; i++) {
			ss.push(i);
		}
		System.out.println(ss);
		System.out.println(s.peek());
		for (int i = 1; i <= 5; i++) {
			ss.pop();
		}
		for (Integer integer : ss.toArray(new Integer[0])) {
			System.out.print(integer);
		}

		for (Iterator<Integer> itr = ss.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

	}
}
