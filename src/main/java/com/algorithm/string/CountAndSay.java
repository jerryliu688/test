package com.algorithm.string;

//The count-and-say sequence is the sequence of integers beginning as
//follows: 1, 11, 21, 1211, 111221, ...
//1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read off as
//"one 2, then one 1" or 1211. Given an integer n, generate the nth sequence.
//Note: The sequence of integers will be represented as a string.

public class CountAndSay {

	public static String countAndSay(int n) {
		String str = "1";
		if (n <= 0) {
			return null;
		}
		for (int i = 1; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(str.charAt(j - 1));
					count = 1;
				}
			}
			sb.append(count);
			sb.append(str.charAt(str.length() - 1));
			str = sb.toString();
		}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}
}
