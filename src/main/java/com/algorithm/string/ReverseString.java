package com.algorithm.string;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse3("abcdef"));

	}

	public static String reverse1(String s) {
		int length = s.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + s.charAt(i);
		return reverse;
	}

	public static String reverse2(String s) {
		int length = s.length();
		String reverse = "";
		for (int i = 0; i < length; i++)
			reverse = s.charAt(i) + reverse;
		return reverse;
	}

	public static String reverse3(String s) {
		char[] array = s.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for (int i = array.length - 1; i >= 0; i--)
			reverse.append(array[i]);

		return reverse.toString();
	}

	public static String reverse4(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
