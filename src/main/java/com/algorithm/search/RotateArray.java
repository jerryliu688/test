package com.algorithm.search;

import java.util.Arrays;

public class RotateArray {

	/*
	 * 如果不考虑额外空间复杂度那么就是新创建一个数组，然后指针移动k+1位后将值 复制到新数组中然后拷贝剩下的部分。
	 * 如果要求O(1)空间则需要将数组分为两部分 1, 2, 3, 4 | 5, 6, 7 分别逆转两部分求得 4, 3, 2, 1 | 7, 6, 5
	 * 然后再 逆转整个数组可得最终结果 5, 6, 7, 1, 2, 3, 4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		int n = arr.length;
		// reverseArray(arr, 0, n - k - 1);
		reverseArray(arr, n - k, n - 1);
		reverseArray(arr, 0, n - 1);

		System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] a, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
}
