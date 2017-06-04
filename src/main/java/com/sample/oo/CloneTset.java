package com.sample.oo;

import java.util.ArrayList;
import java.util.HashMap;

class Professor0 implements Cloneable {
	String name;
	int age;

	Professor0(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student0 implements Cloneable {
	String name;// 常量对象。
	int age;
	Professor0 p;// 学生1和学生2的引用值都是一样的。

	Student0(String name, int age, Professor0 p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

	public Object clone() {
		Student0 o = null;
		try {
			o = (Student0) super.clone();
//			o.p = (Professor0) p.clone();     + this deepcopy
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		} 
		return o;
	}
}

public class CloneTset {

	public static void ShallowCopy() {
		Professor0 p = new Professor0("wangwu", 50);
		Student0 s1 = new Student0("zhangsan", 18, p);
		Student0 s2 = (Student0) s1.clone();
		s2.p.name = "lisi";
		s2.p.age = 30;
		s2.name = "z";
		s2.age = 45;
		System.out.println("学生s1的姓名：" + s1.name + "\n学生s1教授的姓名：" + s1.p.name + "," + "\n学生s1教授的年纪" + s1.p.age);// 学生1的教授
		// s2变了，但s1也变了，证明s1的p和s2的p指向的是同一个对象。这在我们有的实际需求中，却不是这样，因而我们需要深拷贝：
	}

	public static void main(String[] args) {
		ShallowCopy();
		
	}

}
