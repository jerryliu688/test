package com.algorithm.array;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 5, 6, 7, 8 };
		// removeElement1(arr,5);
		removeDuplicates2(arr);
		System.out.println(Arrays.toString(arr));
	}

	// Given an array and a value, remove all instances of that value in place
	// and return the new length.
	public static int removeDuplicates1(int[] nums) {
		if (nums.length == 0)
			return 0;
		int dup = nums[0];
		int end = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != dup) {
				nums[end] = nums[i];
				dup = nums[i];
				end++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return end;
	}

	// Given a sorted array, remove the duplicates in place such that each
	// element appear only once and return the new length.
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int id = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[id - 1]) {
				nums[id++] = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
		return id;
	}

	public static int removeDuplicates2(int[] nums) {
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}
		return j + 1;
	}

}
