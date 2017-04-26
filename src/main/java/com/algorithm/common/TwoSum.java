package com.algorithm.common;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {

	}

	public static int[] twoSum(int[] nums, int target) {
		int index1, index2;
		int[] index = new int[] { 0, 1 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == (nums[i] + nums[j])) {
					index[0] = i + 1;
					index[1] = j + 1;
					return index;
				}
			}
		}
		return index;
	}

//	用HashMap来做，道理相同，不过跟二还是有点区别。1、HashMap要需要为每个元素创建key和value两个内存空间，辅助空间翻倍。本例子就是用value来放index；2、由于用value来放index，找到一个后，另外一个就马上可以得到其index。二跟三，一个省点空间、一个省点点时间，都差别不大。
	public static int[] twoSum1(int[] nums, int target) {
		int[] index = new int[] { 0, 1 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(target - nums[i])) {
				index[1] = i + 1;
				index[0] = hm.get(target - nums[i]) + 1;
				return index;
			} else {
				hm.put(nums[i], i);
			}
		}
		return index;
	}
}
