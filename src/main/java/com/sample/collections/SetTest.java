package com.sample.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add(null);
		set.add(StringUtils.EMPTY);
		set.add(StringUtils.EMPTY);
		set.add(null);
		System.out.println(set);
//		set.addAll(arg0)
		 
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
