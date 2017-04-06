package com.sample.collections;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.sun.xml.internal.ws.api.message.StreamingSOAP;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> lStrings =new ArrayList<String>();
		 lStrings.add("a");
		 lStrings.add("b");
		 System.out.println(lStrings.get(0));
		 System.out.println(StringUtils.join(lStrings,","));
	}

}
