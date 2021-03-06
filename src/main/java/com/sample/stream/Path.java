package com.sample.stream;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Path {

	public static void main(String[] args) {
		 //第一种方式，我的工程目录是JavaTest  
        System.out.println("第一种方式");  
        String path = System.getProperty("user.dir");// 获得项目根目录的绝对路径  
        System.out.println(path);  
        Properties properties = System.getProperties();  
        System.out.println(properties.getProperty("user.dir"));  
        //第二种方式，这里我的文件目录是这样的：JavaTest（工程目录）\resources\武汉大学.kml  
        System.out.println("第二种方式");  
        File file = new File("resources/武汉大学.kml");  
        if (file.exists()) {  
            System.out.println(file.getAbsolutePath());//获取绝对路径  
            try {
				System.out.println(file.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//获取标准路径  
        }  
        //第三种方式，这里我的文件目录是这样的：JavaTest（工程目录）\src\images\me.jpg  
        System.out.println("第三种方式");  
        System.out.println(Path.class.getResource("/"));//得到当前类文件的URL目录  
        System.out.println(Path.class.getResource(""));//得到当前类的classpath目录  
        System.out.println(Path.class.getResource("./"));  
                //这里访问文件的时候目录前面要加/  
        System.out.println(Path.class.getResource("/images/me.jpg"));  
        //第四种方式，这里我的文件目录是这样的：JavaTest（工程目录）\src\images\me.jpg     
        System.out.println("第四种方式");  
        System.out.println(Path.class.getClassLoader().getResource(""));  
                //这里访问文件的时候目录前面不能加/  
        System.out.println(Path.class.getClassLoader().getResource("images/me.jpg"));  
	}

}
