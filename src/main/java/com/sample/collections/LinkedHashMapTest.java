package com.sample.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
 

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>();
		linkedHashMap.put("name", "louis");
		linkedHashMap.put("age", "24");
		linkedHashMap.put("sex", "male");
		for (Entry<String, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}

	}

}
