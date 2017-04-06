package com.algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {
		// BinarySearch
		int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
		// int[] sortedData = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 10 };
		int findValue = 108;
		System.out.println("循环查找：" + BinarySearch0(arr, findValue));
		// System.out.println("递归查找" + binarySearch(arr, 3, 87, arr.length -
		// 1));
	}

	public static int BinarySearch0(int arr[], int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == value) {
				return mid;
			} else if (arr[mid] > value) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;

	}

	public static int sort(int[] array, int a, int lo, int hi) {
		if (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (a == array[mid]) {
				return mid + 1;
			} else if (a > array[mid]) {
				return sort(array, a, mid + 1, hi);
			} else {
				return sort(array, a, lo, mid - 1);
			}
		}
		return -1;
	}

	public static int BinarySearchRecursive(int arr[], int low, int high, int value) {
		int mid = low + (high - low) / 2; // To avoid the overflow
		if (arr[mid] == value)
			return mid;
		else if (arr[mid] < value)
			return BinarySearchRecursive(arr, mid + 1, high, value);
		else
			return BinarySearchRecursive(arr, low, mid - 1, value);
	}

}
