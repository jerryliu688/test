package com.algorithm.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LastRemaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalNum=10,cycleNum=3;
		yuesefu(totalNum, cycleNum);  
	}
	
	public static void yuesefu(int totalNum, int countNum) {  
        // 初始化人数  
        List<Integer> start = new ArrayList<Integer>();  
        for (int i = 1; i <= totalNum; i++) {  
            start.add(i);  
        }  
        //从第K个开始计数  
        int k = 0;  
        while (start.size() >0) {  
            k = k + countNum;  
            //第m人的索引位置  
            k = k % (start.size()) - 1;  
           // 判断是否到队尾  
            if (k < 0) {  
                System.out.println(start.get(start.size()-1));  
                start.remove(start.size() - 1);  
                k = 0;  
            } else {  
                System.out.println(start.get(k));  
                start.remove(k);  
            }  
        }  
    }  
}

class YueSeFuHuan {

    static final int nums = 41;// 总共多少人
    static final int killMan = 3;// 数到3则被杀

    public static void main(String[] args) {

        jufehus(2);

    }

    public static void jufehus(int alive) {

        int[] man = new int[nums];// 未被杀的都被标记为0
        int pos = -1;// 数组角标
        int i = 0;
        int count = 1;// 杀到第几个记录值

        while (count <= nums) {

            do {
                pos = (pos + 1) % nums;// 循环标记
                if (man[pos] == 0)
                    i++;

                if (i == killMan) {
                    i = 0; // 重置
                    break;// 找到了被杀的位置，跳出循环，进行标记
                }

            } while (true);

            man[pos] = count;
            count++;
        }

        // 显示不被杀的位置
        alive = count - alive;
        for (int j = 0; j < man.length; j++) {

            if (man[j] >= alive)
                System.out.println("不被杀的位置是->" + (j + 1));

        }

    }
}
