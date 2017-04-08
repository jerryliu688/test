package com.sample.common;

public class StringTest {

	public static void main(String[] args) {
		String text = "Hello, World!";
		char[] array = text.toCharArray();

		String first = "Hello, ";
		String second = "World!";
		String helloworld = first + second;
		helloworld = first.concat(second);

		System.out.println(text.charAt(7));

		String str1 = "hello";
		String str2 = "Hello";
		System.out.println("str1 equals str2 :" + str1.equalsIgnoreCase(str2));

		System.out.println(7 + '0');
		// 7+'0'= int 55 => to char '7' so '0' is base char number
		char digit = (char) (7 + '0');// =>'7'
		
	
	}
}
