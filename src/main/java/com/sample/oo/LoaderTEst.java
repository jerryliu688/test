package com.sample.oo;

public class LoaderTEst {

	public static void main(String[] args) {
		// try {
		// Class<?> c = Class.forName("java.lang.String");
		// String str=(String) c.newInstance();
		// System.out.println(str);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Class clazz = Class.forName("com.sanmao10.Person");
		// Class c=Class.forName("Person");
		// // Person p=(Person)clazz.newInstance(); //通过无参构造创建对象
		// // p.say();
		// Constructor c = clazz.getConstructor(String.class, int.class);//
		// 获取有参构造
		// Person p = (Person) c.newInstance("sanmao", 12); // 通过有参构造创建对象
		//
		ClassLoader loader = LoaderTEst.class.getClassLoader();
		System.out.println(loader);
		// 使用ClassLoader.loadClass()来加载类，不会执行初始化块
		try {
			loader.loadClass("com.algorithm.sample.oo.Person");
			// 使用Class.forName()来加载类，默认会执行初始化块
//			Class.forName("com.algorithm.sample.oo.Person");
			// 使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块
			Class c=Class.forName("com.algorithm.sample.oo.Person", false, loader);
//			Person p=(Person) c.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Person {
	static {
		System.out.println("静态初始化块执行了！");
	}
	private String name;
	private int age;

	 public Person() {
	 }

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
