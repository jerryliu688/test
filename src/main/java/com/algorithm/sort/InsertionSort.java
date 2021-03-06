package com.algorithm.sort;

import java.util.Arrays;

import org.xbill.DNS.AAAARecord;

import com.thoughtworks.xstream.security.ForbiddenClassException;

public class InsertionSort {

	public static void sort(int arr[]) {
		int size = arr.length;
		int temp, j;
		for (int i = 1; i < size; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
//		for (int i = 1; i < size; i++) {
//			temp = arr[i];
//			for (j = i - 1; j > 0 && arr[j] > temp; j--) {
//				arr[j + 1] = arr[j];
//			}
//			arr[j + 1] = temp;
//		}

	}


	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
