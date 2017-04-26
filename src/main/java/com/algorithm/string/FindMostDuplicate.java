package com.algorithm.string;

public class FindMostDuplicate {

	public static void main(String[] args) {
		String s = "adfoweyirlkbasgxalueralsdhg"; // 待统计字符串
		int max = 0; // 记录最大出现次数
		int[] arr = new int[256]; // 临时计数用的数组
		for (int i = 0; i < s.length(); i++) { // 循环字符以做统计
			char c = s.charAt(i); // 取出单个字母
			max = (++arr[c] > max) ? arr[(int)c] : max; // 计数并检测最大出现次数
		}
		System.out.println(max);
//		if (true) System.out.println((char)97);
		
	}

}
