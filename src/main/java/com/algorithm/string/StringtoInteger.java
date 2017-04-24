package com.algorithm.string;

//【函数说明】atoi() 函数会扫描 str 字符串，跳过前面的空白字符（例如空格，tab缩进等），直到遇上数字或正负符号才开始做转换，而再遇到非数字或字符串结束时('\0')才结束转换，并将结果返回。
//【返回值】返回转换后的整型数；如果 str 不能转换成 int 或者 str 为空字符串，那么将返回 0。如果超出Integer的范围，将会返回Integer最大值或者最小值。
//【处理思路】按照函数说明来一步步处理。首先判断输入是否为null。然后使用trim()函数删掉空格。判断是否有正负号，做一个标记。返回的是整形数，可以使用double来暂存结果。按位来计算出结果。如果遇到非数字字符，则返回当前结果。加上前面的正负号。结果若超出了整形范围，则返回最大或最小值。最后返回处理结果。
public class StringtoInteger {

	public static int myAtoi(String str) {
		if (str == null || str.length() < 1) {
			return 0;
		}
		str = str.trim(); // kill add white spaces
		int i = 0; // index of str
		char flag = '+'; // default positive
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		double res = 0;
		// abandon the non-digit char; calculate the result
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			res = res * 10 + str.charAt(i) - '0';
			i++;
		}
		if (flag == '-')
			res = -1 * res;
		if (res > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (res < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" +123";
		System.out.println(myAtoi(str));
	}

}
