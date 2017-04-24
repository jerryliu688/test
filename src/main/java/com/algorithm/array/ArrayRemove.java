package com.algorithm.array;
 
public class ArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 5 };
	}

	// Given an array and a value, remove all instances of that value in place
	// and return the new length.

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

	// Given a sorted array, remove the duplicates in place such that each
	// element
	// appear only once and return the new length.
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int id = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[id - 1]) {
				nums[id++] = nums[i];
			}
		}
		return id;
		// nums[0]=10;
		// return 0;
	}

	public int removeDuplicates(int[] nums,int n) {
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}
		return j + 1;
	}
}
