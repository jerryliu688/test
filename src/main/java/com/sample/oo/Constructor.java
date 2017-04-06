package com.sample.oo;

class A {
	protected A() {
		System.out.println("调用了无参的构造函数");
	}

	public A(String mess) {
		System.out.println("调用了有参的构造函数\n" + "参数内容为：" + mess);
	}

}

class B extends A {
	public B() {
		System.out.println("调用了B的无参构造函数");
	}

	public B(String mess) {
		super(mess);
		System.out.println("调用了B的有参构造函数\n" + "参数内容为：" + mess);
	}
}

class C {
	public C() {
		System.out.println("C no arg");
	}

	public C(String arg) {
		System.out.println("Has args");
	}

}

class D extends C {
	public int P = 0;
	String value = null;
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	Integer integer=null;
	
	 D() {
		System.out.println("D no arg");
	}

	public D(String arg) {
		this();
//		super();
	
		value=arg;
		System.out.println("D has arg");
	}

	public void test() {
		System.out.println(value);
		
	}
}

public class Constructor {

	public static void main(String[] args) {
		// B b_01=new B();
		// B b_02=new B("你好");
		D d = new D("a");
		d.P = 10;
		d.test();
	}

}
