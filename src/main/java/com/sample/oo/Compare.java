package com.sample.oo;

import java.util.TreeSet;

public class Compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Parent> set = new TreeSet<Parent>();
		set.add(new Parent(3));
		set.add(new Child());
		set.add(new Parent(4));
		System.out.println(set.size());
	}

	public static class Parent implements Comparable<Object> {
		private int age = 0;

		public Parent(int age) {
			this.age = age;
		}

		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			System.out.println("method of parent");
			Parent o1 = (Parent) o;
			return age > o1.age ? 1 : age < o1.age ? -1 : 0;
		}

	}

	public static class Child extends Parent {

		public Child() {
			super(3);
		}

		public int compareTo(Object o) {

			// TODO Auto-generated method stub
			System.out.println("method of child");
			// Child o1 = (Child)o;
			return 1;

		}
	}
}