package com.sample.common;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class StringEquals {

	public static void swap(List<String> x) {
		x.add("a");
		x.add("n");
		System.out.println(x.indexOf("n"));
		String[] sa = x.toArray(new String[0]);
		System.out.println(sa);
	}

	public static void main(String[] args) {
		String str = new String("hello");
		str = str.intern();
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.equals(str1));
		String s1 = new StringBuilder("go").append("od").toString();
		System.out.println(s1.intern() == s1);
		int[] array = new int[20];
		System.out.println(array.length);
		List<String> ll = new ArrayList<String>();
		swap(ll);
		System.out.println(ll);
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("v");
		System.out.println(sBuilder.toString());
		char[] cr = str.toCharArray();
		if ("zxx".equals(null)) {
		}
		int a = 10;
		int b = 20;
		System.out.println(a == b ? 10 : 20);
		String orgStr = "a,b,c,d,e,f";
		String[] arr=orgStr.split(",");
	
	}

}
