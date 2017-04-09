package com.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			int k = i;
			// for (int j = size - 1; j > i; j--) {
			// if (arr[j] < arr[max])
			// max = j;
			// }
			for (int j = i + 1; j < size; j++) {// 找到最小值下标
				if (arr[j] < arr[k])
					k = j;
			}
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
}
