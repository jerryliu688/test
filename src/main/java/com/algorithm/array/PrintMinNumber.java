package com.algorithm.array;

import java.util.Arrays;

//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。

public class PrintMinNumber {

	 public void printMin(int[] arr){  
	        int[] clone = arr.clone();  
	        printMinNumber(clone,0,clone.length-1);  
	        for(int i : clone)  
	            System.out.print(i);  
	    }  
	    //核心+快排  
	    public void printMinNumber(int[] arr,int left,int right){  
	        if(left < right){  
	            int main_number = arr[right];  
	            int small_cur = left;  
	            for(int j = left;j<right;j++){  
	                if(isSmall(String.valueOf(arr[j]),String.valueOf(main_number))){  
	                    int temp = arr[j];  
	                    arr[j] = arr[small_cur];  
	                    arr[small_cur] = temp;  
	                    small_cur++;  
	                }  
	            }  
	            arr[right]= arr[small_cur];  
	            arr[small_cur] = main_number;  
	            printMinNumber(arr,0,small_cur-1);  
	            printMinNumber(arr,small_cur+1,right);  
	        }  
	    }  
	    public boolean isSmall(String m,String n){  
	        String left = m+n;  
	        String right = n+m;  
	        boolean result = false;  
	        for(int i = 0;i<left.length();i++){  
	            if(left.charAt(i)<right.charAt(i))  
	                return true;  
	            else  
	                if(left.charAt(i)>right.charAt(i))  
	                    return false;  
	        }  
	        return result;  
	    }  
	    public static void main(String[] args){  
	        int arr[] = {3,32,321};  
	        PrintMinNumber test = new PrintMinNumber();  
	        test.printMin(arr);  
	    }  

}
