package com.sample.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	//
	//

	public static void main(String[] args) {
		Map<String, String> maptest = new HashMap<String, String>();
		maptest.put("1", "day1");
		maptest.put("5", "day5");
		maptest.put("4", "day4");
		maptest.put("2", "day2");
		maptest.put("3", "day3"); 
		maptest.put(null, "day3"); 
		maptest.put("3", "day33"); 
		Collection<String> keyset = maptest.keySet();
		List<String> list = new ArrayList<String>(keyset);
		System.out.println("get"+maptest.get("2"));
		// 对key键值按字典升序排序
//		Collections.sort(list);
////	
//		for (int i = 0; i < list.size(); i++) {  
//	         System.out.println("key键---值: "+list.get(i)+","+maptest.get(list.get(i)));  
//	     } 
		for (Entry<String, String> entry  : maptest.entrySet()) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		for (String key : maptest.keySet()){
			System.out.println(key);
		}
		for (String v : maptest.values()) {
			System.out.println(v);
		}
			
		System.out.println(maptest.containsKey("2"));
		System.out.println(maptest.containsValue("day5"));
	
	}
}
