package com.sample.oo;

public class ExtendTest {
	public String aString;
	public String bString="willback";
	public ExtendTest() {
		aString = "aa";
	}

	public ExtendTest(String aa) {
		aString = aa;
	}

	public static void main(String[] args) {
		Example example=new Example();
				
	}

}

class Example extends ExtendTest {
	public Example() {
		System.out.println(aString);
		System.out.println(super.bString);
	}
	
	

}