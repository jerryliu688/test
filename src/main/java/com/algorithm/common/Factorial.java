package com.algorithm.common;

public class Factorial {

	public static void main(String[] args) {
//		System.out.println(factorial(3));
		System.out.println(fibonacci(11));
	}

	public static int factorial(int i) {
		/* Termination Condition */
		if (i <= 1)
			return 1;
		/* Body, Recursive Expansion */
		return i * factorial(i - 1);
	}

	public static int ff(int i) {
		if (i == 1) {
			return 1;
		}
		return i * ff(i - 1);

	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2)//if (n<= 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}