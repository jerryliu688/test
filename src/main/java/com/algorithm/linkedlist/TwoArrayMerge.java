package com.algorithm.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//有两个长度分别为m,n的非降序整型数组，其中n>m*m,求这两个数组的交集，要求复杂度尽可能低。
//
//如数组a:-1,4,5
//数组b:-15，1，3，4，5，7，8，9，10，15
//结果应该是：4，5

public class TwoArrayMerge {
	public static void getreslut() {

		Integer[] aa = { -1, 4, 5 };
		Integer[] ab = { -15, 1, 3, 4, 5, 7, 8, 9, 10, 15 };
		List<Integer> lista = Arrays.asList(aa);
		List<Integer> listb = Arrays.asList(ab);
		List<Integer> listc = new ArrayList<Integer>();
		listc.addAll(listb);
		listc.retainAll(lista);
		System.out.println(listc);
		// return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getreslut();
	}

}
