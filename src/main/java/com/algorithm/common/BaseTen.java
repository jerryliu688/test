package com.algorithm.common;

public class BaseTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i2c();
		char c = (char) (2 + '0');
		System.out.println(c);
		String str = String.valueOf('2');
		System.out.println(str.charAt(0));

		// printInt1(837);
		// c2i();
		// c2i('a');
	}

	public static void printInt1(int number) {
		char digit = (char) (number % 10 + '0');
		number = number / 10;
		if (number != 0)
			printInt1(number);
		System.out.print(" " + digit);
	}

	public static void printInt2(int number, final int base) {
		String conversion = "0123456789ABCDEF";
		char digit = (char) (number % base);
		number = number / base;
		if (number != 0)
			printInt2(number, base);
		System.out.print(" " + conversion.charAt(digit));
	}

	public static void i2c() {
		for (int i = 0; i < 255; i++) {
			char a = (char) i;
			System.out.println(a + "........." + i);
		}
		// String str = String.valueOf(c);
		// System.out.println(str.charAt(0));
	}

	public static void c2i(char c) {
		int intNum = (int) c;
		System.out.println(intNum);
	}

}
