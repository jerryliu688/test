package com.algorithm.array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5,5, 6, 7, 8 };
//		removeElement1(arr,5);
		removeElement(arr,2);
		System.out.println(Arrays.toString(arr));
	}

	public static int removeElement(int[] nums, int val) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				continue;
			}
			nums[j++] = nums[i];
		}
		return j;

	}

	public static int removeElement1(int[] A, int elem) {
		int len = 0;

		for (int i = 0; i < A.length; i++)
			if (A[i] != elem && i != len++)
				A[len - 1] = A[i];

		return len;
	}
}
