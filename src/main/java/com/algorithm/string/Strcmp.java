package com.algorithm.string;

public class Strcmp {

	public static void printResult(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		if (lenA < 1 || lenB < 1)
			return;
		char[] arrayA = A.toCharArray();
		char[] arrayB = B.toCharArray();
		int i = 0, j = 0;
		int judge = 10000;
		while (i < lenA && j < lenB) {
			judge = arrayA[i++] - arrayB[j++];
			if (judge != 0)
				break;
		}
		if (judge > 0 && judge != 10000) {
			System.out.println("1");
		} else if (judge < 0) {
			System.out.println("-1");
		} else {
			int tempi = lenA - i;
			int tempj = lenB - j;
			if (tempi == tempj) {
				System.out.println("0");
			} else if (tempi > tempj) {
				System.out.println("1");
			} else if (tempi < tempj) {
				System.out.println("-1");
			}
		}
		return;
	}

	public static void main(String[] args) {
		String A = "fasdfa";
		String B = "asfd";
		printResult(A, B);
	}
}
