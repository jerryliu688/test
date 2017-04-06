package com.sample.common;

public class Try {
	public static void main(String[] args) {
		try {
			throw new RuntimeException("aa");
		} catch (RuntimeException e) {

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		finally {
			System.out.println("Still run");
		}

		try {
			int a = 1 / 5;
		} finally {
			System.out.println("finally!");
		}
	}
}
