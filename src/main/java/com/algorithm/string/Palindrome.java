package com.algorithm.string;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
//		isPalindrome("aba");
		findhuifen("aaabcdbaaa");
		 
	}

	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j && str.charAt(i) == str.charAt(j)) {
			i++;
			j--;
		}
		if (i < j) {
			System.out.println("String is not a Palindrome");
			return false;
		} else {
			System.out.println("String is a Palindrome");
			return true;
		}
	}

	static void findhuifen(String string) {
		int length = string.length();
		for (int i = 0, j = length - 1; i < j; i++, j--) {
			if (string.charAt(i) !=string.charAt(j)) {
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
}
