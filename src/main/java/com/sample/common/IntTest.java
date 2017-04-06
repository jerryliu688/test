package com.sample.common;

public class IntTest {
	public static void name(Integer ii) {
		ii++;
	}

	public static void main(String[] args) {
		Integer i = 0;
		name(i);
		System.out.println(i);
//		int i = 128;
//		         Integer i2 = 128;
//		         Integer i3 = new Integer(128);
//		16         //Integer会自动拆箱为int，所以为true
//		17         System.out.println(i == i2);
//		18         System.out.println(i == i3);
//		19         System.out.println("**************");
//		20         Integer i5 = 127;//java在编译的时候,被翻译成-> Integer i5 = Integer.valueOf(127);
//		21         Integer i6 = 127;
//		22         System.out.println(i5 == i6);//true
//		23         /*Integer i5 = 128;
//		24         Integer i6 = 128;
//		25         System.out.println(i5 == i6);//false
//		26 */        Integer ii5 = new Integer(127);
//		27         System.out.println(i5 == ii5); //false
//		28         Integer i7 = new Integer(128);
//		29         Integer i8 = new Integer(123);
//		30         System.out.println(i7 == i8);  //false
	}
}
