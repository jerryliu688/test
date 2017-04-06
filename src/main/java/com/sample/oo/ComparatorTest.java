package com.sample.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		ConsumInfo consumInfo1 = new ConsumInfo(100, "consumInfo1", 400.0, new Date());
		ConsumInfo consumInfo2 = new ConsumInfo(200, "consumInfo1", 200.0, new Date());
		ConsumInfo consumInfo3 = new ConsumInfo(300, "consumInfo1", 100.0, new Date());
		ConsumInfo consumInfo4 = new ConsumInfo(400, "consumInfo1", 700.0, new Date());
		ConsumInfo consumInfo5 = new ConsumInfo(500, "consumInfo1", 800.0, new Date());
		ConsumInfo consumInfo6 = new ConsumInfo(600, "consumInfo1", 300.0, new Date());
		ConsumInfo consumInfo7 = new ConsumInfo(700, "consumInfo1", 900.0, new Date());
		ConsumInfo consumInfo8 = new ConsumInfo(800, "consumInfo1", 400.0, new Date());

		List<ConsumInfo> list = new ArrayList<ConsumInfo>();
		list.add(consumInfo1);
		list.add(consumInfo2);
		list.add(consumInfo3);
		list.add(consumInfo4);
		list.add(consumInfo5);
		list.add(consumInfo6);
		list.add(consumInfo7);
		list.add(consumInfo8);

		System.out.println("排序前：");
		// 排序前
		for (ConsumInfo consumInfo : list) {
			System.out.println(consumInfo);
		}
		ComparatorConsunInfo comparatorConsunInfo = new ComparatorConsunInfo();// 比较器
		Collections.sort(list, comparatorConsunInfo);// 排序
		System.out.println("排序后：");
		// 排序后
		for (ConsumInfo consumInfo : list) {
			System.out.println(consumInfo);
		}
	}

}

class ComparatorConsunInfo implements Comparator<ConsumInfo> {
	/**
	 * 顺序（从小到大）： if(price < o.price){ return -1; } if(price > o.price){ return
	 * 1; } 倒序（从大到小）： if(price < o.price){ return 1; } if(price > o.price){
	 * return -1; }
	 */
	public int compare(ConsumInfo o1, ConsumInfo o2) {
		// 首先比较price，如果price相同，则比较uid
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		}

		if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}

		if (o1.getPrice() == o2.getPrice()) {
			if (o1.getUid() > o2.getUid()) {
				return 1;
			}
			if (o1.getUid() < o2.getUid()) {
				return -1;
			}
		}
		return 0;
	}

}

class ConsumInfo {
	private int uid;
	private String name;
	private double price;
	private Date datetime;

	public ConsumInfo() {
		// TODO Auto-generated constructor stub
	}

	public ConsumInfo(int uid, String name, double price, Date datetime) {
		this.uid = uid;
		this.name = name;
		this.price = price;
		this.datetime = datetime;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "ConsumInfo [uid=" + uid + ", name=" + name + ", price=" + price + ", datetime=" + datetime + "]";
	}

}