package com.algorithm.search;

public class MaxSubArray {

	public static void main(String[] args) {
		// int[] arr = { 1, -2, 3, 4, -4, 6, -14, 8, 2 };
		int[] arr = { 1, 100, 3, 4, -4, 6, -14, 8, 2 };
		System.out.println("Max sub array sum :" + maxSubArraySum(arr));
	}

	public static int maxSubArraySum(int[] a) {
		int maxSoFar = 0, maxEndingHere = 0;
		int size = a.length;
		for (int i = 0; i < size; i++) {
			maxEndingHere = maxEndingHere + a[i];
			if (maxEndingHere < 0)
				maxEndingHere = 0;
			if (maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
		}
		return maxSoFar;
	}

	public static int maxSubArraySum0(int[] arr) {
		int max = 0;
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			int tempmax = arr[i];
			for (int j = i + 1; j < size; j++) {
				tempmax = tempmax + arr[j];
				if (tempmax > max) {
					max = tempmax;
				}
			}
		}
		return max;
	}
}
