package com.sample.string;

public class Format {

	public static void main(String[] args) {
		System.out.println(String.format("asd%sasf%1s", 1, "2"));
		System.out.println(String.format("%1$s.abc, %1$s.cde", "1"));
		System.out.println(String.format("Duke's Birthday: %1$tm %1$te,%1$tY", "1999-9-9"));
	}
}
