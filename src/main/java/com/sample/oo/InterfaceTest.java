package com.sample.oo;

public class InterfaceTest implements InFace{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest iTest=new InterfaceTest();
		iTest.testMethod();
				
	}

	public void testMethod() {
		// TODO Auto-generated method stub
		System.out.println(teString);
	}

}

interface InFace {
	String teString = "test";
    void testMethod();
}