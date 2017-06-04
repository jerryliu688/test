package com.algorithm.array;

import java.util.Arrays;
import java.util.Comparator;

//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。

//这道题其实希望我们能够找到一个排序规则，数组根据这个规则排序之后能排成一个最小的数字。要确定排序的规则，就要比较两个数字，也就是给出两个数字m和n，我们需要确定一个规则判断m和n哪个应该排在前面，而不是仅仅比较这两个数字的值哪个更大。
//根据题目的要求，两个数字m和n能拼接称数字mn和nm。如果mn<nm，那么我们应该打印出mn，也就是m应该拍在N的前面，我们定义此时m小于n；反之，如果nm<mn，我们定义n小于m。如果mn=nm,m等于n。
//接下来考虑怎么去拼接数字，即给出数字m和n，怎么得到数字mn和nm并比较他们的大小。直接用数值去计算不难办到，但需要考虑一个潜在的问题就是m和n都在int能表达的范围内，把他们拼起来的数字mn和nm用int表示就有可能溢出了，所以这还是一个隐形的大数问题。
//一个非常直观的解决大数问题的办法就是把数字转换成字符串。另外，由于把数字m和n拼接起来得到mn和nm，他们的位数肯定是相同的，因此比较它们的大小只需要按照字符串的大小的比较规则就可以了。

public class PrintMinNumber {

	public void printMin(int[] arr) {
		int[] clone = arr.clone();
		printMinNumber(clone, 0, clone.length - 1);
		for (int i : clone)
			System.out.print(i);
	}

	// 核心+快排
	public void printMinNumber(int[] arr, int left, int right) {
		if (left < right) {
			int main_number = arr[right];
			int small_cur = left;
			for (int j = left; j < right; j++) {
				if (isSmall(String.valueOf(arr[j]), String.valueOf(main_number))) {
					int temp = arr[j];
					arr[j] = arr[small_cur];
					arr[small_cur] = temp;
					small_cur++;
				}
			}
			arr[right] = arr[small_cur];
			arr[small_cur] = main_number;
			printMinNumber(arr, 0, small_cur - 1);
			printMinNumber(arr, small_cur + 1, right);
		}
	}

	public boolean isSmall(String m, String n) {
		String left = m + n;
		String right = n + m;
		boolean result = false;
		for (int i = 0; i < left.length(); i++) {
			if (left.charAt(i) < right.charAt(i))
				return true;
			else if (left.charAt(i) > right.charAt(i))
				return false;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 32, 321 };
		PrintMinNumber test = new PrintMinNumber();
		test.printMin(arr);
	}

	// 方法一：用comparable接口实现
	public String PrintMinNumber(int[] numbers) {
		String res = "";
		if (numbers == null || numbers.length == 0) {
			return res;
		}
		MString m[] = new MString[numbers.length];
		String st[] = Int2String(numbers);
		int k = 0;
		for (String i : st) {
			m[k] = new MString();// ！必须先赋值才能对它的成员变量进行访问
			m[k++].s = i;
		}
		Arrays.sort(m);
		for (int i = 0; i < m.length; i++) {
			res += m[i].s;
		}
		return res;
	}

	// 方法一 ：必须要对进行比较的类T内部进行改造。首先实现接口
	// Comparable<T>，（必须是T因为后面比较内部都是对对象进行的，否则出现类型转换错误）
	// 然后重写方法 compare(T t)即可。然后Arrays.sort(T[])自动回调用这个比较器
	class MString implements Comparable<MString> {
		public String s;

	 
		public int compareTo(MString o) {
			String s1 = s + o.s;
			String s2 = o.s + s;
			if (s1.compareTo(s2) > 0) {
				return 1;
			} else if (s1.compareTo(s2) < 0)
				return -1;
			else
				return 0;
		}

		public String toString() {
			return s;// "MString [s=" + s + "]";
		}
	}

	public String[] Int2String(int[] a) {
		String b[] = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = String.valueOf(a[i]);
		}
		// System.out.println(Arrays.toString(b));
		return b;
	}

	// 方法二：用comparator接口实现
	public String PrintMinNumber1(int[] numbers) {
		String res = "";
		if (numbers == null || numbers.length == 0) {
			return res;
		}
		MString1 m[] = new MString1[numbers.length];
		String st[] = Int2String(numbers);
		int k = 0;
		for (String i : st) {
			m[k] = new MString1();
			m[k++].s = i;
		}
		MString1Comparator m1c = new MString1Comparator();
		Arrays.sort(m, m1c);
		for (int i = 0; i < m.length; i++) {
			res += m[i].s;
		}
		return res;
	}

	class MString1 {
		public String s;
	}

	// 方法二：无需修改要比较的类T。只需要写一个新的比较器类x，实现Comparator<T>接口，重写compareTo(T t1，T t2)方法。
	// 然后Arrays.sort(T[],x)自动会对这个T[]数组采用x比较器方法，调用这个比较器。可实现复用。以后更改比较器方法方便了。
	class MString1Comparator implements Comparator<MString1> {
	 
		public int compare(MString1 o1, MString1 o2) {
			String s1 = o1.s + o2.s;
			String s2 = o2.s + o1.s;
			if (s1.compareTo(s2) > 0) {
				return 1;
			} else if (s1.compareTo(s2) < 0)
				return -1;
			else
				return 0;
		}
	}
}
