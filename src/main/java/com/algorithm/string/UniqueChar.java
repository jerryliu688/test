package com.algorithm.string;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// isUniqueChar("abc");
		System.out.println(ToUpper('n'));
	}

	static boolean isUniqueChar(String str) {
		int[] bitarr = new int[26];
		for (int i = 0; i < 26; i++) {
			bitarr[i] = 0;
		}
		int size = str.length();
		for (int i = 0; i < size; i++) {
			char c = str.charAt(i);
			int index = 0;
			if ('A' <= c && 'Z' >= c) {
				index = c - 'A';
			} else if ('a' <= c && 'z' >= c) {
				index = c - 'a';
			} else {
				System.out.println("Unknown Char!\n");
				return false;
			}
			if (bitarr[index] != 0) {
				System.out.println("Duplicate detected!\n");
				return false;
			} else {
				bitarr[index]++;
			}
		}
		System.out.println("No duplicate detected!\n");
		return true;
	}

	static char ToUpper(char s) {
		// if (s >= 97 && s <= (97 + 25))
		// s = (char) (s - 32);
		// return s;
		// String string="aa";
		// if ('A' > 50) {
		// System.out.println(string);
		// }
		 return (char)(s-'a'+'A')  ;
	}
}
