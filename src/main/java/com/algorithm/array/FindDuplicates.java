package com.algorithm.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// printRepeating(new int[] { 1, 2, 3, 4, 15, 6, 7, 8, 15 });

		int[] arr = new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 8 };
		printRepeating(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void printRepeating(int[] arr) { // num must be <10
		// int size = arr.length;
		// int[] count = new int[size];
		// int i;
		// for (i = 0; i < size; i++)
		// count[i] = 0;
		// System.out.println(" Repeating elements are ");
		// for (i = 0; i < size; i++) {
		// if (count[arr[i]] == 1)
		// System.out.println(" " + arr[i]);
		// else
		// count[arr[i]]++;
		// }
		int size = arr.length;
		int[] count = new int[size];
		int i;
		// for (i = 0; i < size; i++)
		// count[i] = 0;
		System.out.println(" Repeating elements are ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				System.out.println(" " + arr[i]);
			else
				count[arr[i]]++;
		}
	}


}
