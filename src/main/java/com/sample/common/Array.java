package com.sample.common;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		String[] stringArray = { "a", "b", "c", "d", "e" };
		boolean b = Arrays.asList(stringArray).contains("a");
		System.out.println(b);
		// String[] stringArray = { "a", "b", "f", "d", "e" };
		Integer[] aa = { 1, 2 };
		List<Integer> ll = Arrays.asList(aa);
		System.out.println(ll);

		Person[] persons = new Person[5];
		persons[0] = new Person("tom", 45);
		persons[1] = new Person("jack", 12);
		persons[2] = new Person("bill", 21);
		persons[3] = new Person("kandy", 34);
		persons[4] = new Person();
		Arrays.sort(persons);
		for (Person person : persons) {
			System.out.println(person);
		}
//		// 对数组部分排序
//		int[] a = { 9, 8, 7, 2, 3, 4, 1, 0, 6, 5 };
//		Arrays.sort(a, 0, 3);
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " ");
//		}

		Integer[] arr = { 9, 8, 7, 2, 3, 4, 1, 0, 6, 5 };
		MyComparator cmp = new MyComparator();
		Arrays.sort(arr, cmp);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
		this("unknown", 0);
	}

	// 重写该类的compareTo()方法，使其按照从小到大顺序排序
	public int compareTo(Person o) {
		return age - o.age;
	}

	// 重写Student类的toString()方法，在输入对象时按照以下方式输出
	@Override
	public String toString() {
		return "Person[name:" + name + ",age:" + age + "]";
	}
}

class MyComparator implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		}
		return 0;
	}
}
