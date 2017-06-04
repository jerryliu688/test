package com.algorithm.string;

//Given two strings s and t, write a function to determine if t is an anagram of s.
//For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
//return false.
//Note: You may assume the string contains only lowercase alphabets.

public class Anagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] map = new int[256];
		for (int i = 0; i < s.length(); i++) {
			map[s.charAt(i)]++;
			map[t.charAt(i)]--;
		}
		for (int i : map) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
