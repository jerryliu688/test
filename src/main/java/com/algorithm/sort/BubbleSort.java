package com.algorithm.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void sort(int data[]) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}

			}
		}
	}
	
	public static void sort_reverse(int array[]) {
//		for( i = 0; a[i] != '\0'; i++){ for( j = i + 1; a[j] != '\0'; j++){ if(a[i] > a[j]){ tmp = a[i]; a[i] = a[j]; a[j] = tmp; } } }
		for (int i = 0; i < array.length; i++) {
			
		}
	}
}
