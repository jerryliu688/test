package com.sample.oo;

public class Block {
	 public static int a = 0;
	    static {// Step 1
	        a = 10;
	        System.out.println("静态代码块在执行a=" + a);
	    }

	    {// Step 4
	        a = 8;
	        System.out.println("非静态代码块（构造代码块）在执行a=" + a);
	    }

	    public Block() {
	        this("调用带参构造方法1，a=" + a); // Step 2
	        System.out.println("无参构造方法在执行a=" + a);// Step 7
	    }

	    public Block(String n) {
	        this(n, "调用带参构造方法2，a=" + a); // Step 3
	        System.out.println("带参构造方法1在执行a=" + a); // Step 6
	    }

	    public Block(String s1, String s2) {
	        System.out.println(s1 + "；" + s2);// Step 5
	    }

	    public static void main(String[] args) {
//	    	Block t = null;// JVM加载Test类，静态代码块执行
//	        System.out.println("下面new一个Test实例：");
//	        Block t = new Block();
//	        Block t1 = new Block();
//	        double f=3.4;
//	        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
//
//	        System.out.println(f1 == f2);
//	        System.out.println(f3 == f4);
	    	
	    }

}
