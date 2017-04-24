package com.algorithm.sort;

import java.util.Arrays;

public class ShellSort {

	public static void sort(int[] data) {
		int temp,j;
		for (int increment = data.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < data.length; i++) {
				temp = data[i];
				for (j = i; j >= increment; j -= increment) {
					if (temp > data[j - increment])// 如想从小到大排只需修改这里
					{
						data[j] = data[j - increment];
					} else {
						break;
					}

				}
				data[j] = temp;
			}

		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 54, 6, 3, 78, 34, 12, 45, 56, 100,2 };
		sort(a);
		System.out.println(Arrays.toString(a));

	}
}
