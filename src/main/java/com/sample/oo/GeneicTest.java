package com.sample.oo;

public class GeneicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name("a");
		Box<Integer> bb=new Box<Integer>();
		bb.set(11);
		System.out.println(bb.get());
	}

	public static <T> void name(T elem) {
		System.out.println(elem);
	}
}

class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
