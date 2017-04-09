package com.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8 };
		// sort(a);
		sort_wrongbubble(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int data[]) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	public static void improved_sort(int arr[]) {
		 int n=arr.length;
         boolean NeedNextPass=true;
         for(int i=1;i<n&&NeedNextPass;i++){//总共比较n-1趟，如果某趟遍历中没有交换，那么不需要下次遍历，因为元素以排好
             NeedNextPass=false;
             for(int j=0;j<n-i;j++){//第i趟比较n-i次
                 if(arr[j]>arr[j+1]){
                     int temp;
                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;     
                     NeedNextPass=true;
                 }
             }
         }
	}

	// this is a selection sort but not efficient way
	public static void sort_wrongbubble(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
