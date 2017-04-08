package com.algorithm.string;

public class Pow {
	public static void main(String[] args) {
//		Math.pow(a, b)
	}

	int pow(int x, int n) {
		int value;
		if (n == 0)
			return (1);
		else if (n % 2 == 0) {
			value = pow(x, n / 2);
			return (value * value);
		} else {
			value = pow(x, n / 2);
			return (x * value * value);
		}
	}
}
