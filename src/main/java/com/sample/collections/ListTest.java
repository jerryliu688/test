package com.sample.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.apache.commons.lang3.StringUtils;

import com.sun.xml.internal.ws.api.message.StreamingSOAP;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lStrings = new ArrayList<String>();
		lStrings.add("a");
		lStrings.add("b");
		System.out.println(lStrings.get(0));
		System.out.println(StringUtils.join(lStrings, ","));
		System.out.println("max"+Collections.max(lStrings));
		System.out.println(lStrings.subList(0, 1));

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		List<String> alist=list.subList(3,list.size());
		System.out.println("sub"+alist);
//		alist.contains(arg0)
		
		List<String> result = new ArrayList<String>();
		result.add("otherlist");
		result.add("otherlist");
		list.addAll(1,result);
		System.out.println(list);
		
		String[] sa= list.toArray(new String[0]);

		System.out.println("\n例子1 - 计算'a'出现的次数");
		System.out.println("a : " + Collections.frequency(list, "a"));

		System.out.println("\n例子2 - 计算所有对象出现的次数");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}

		System.out.println("\n例子3 -用Map来计算对象出现的次数");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);

		

	}

	public static void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key-value : " + entry.getKey() + "- " + entry.getValue());
		}
	}

}
