package com.sample.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		// 依次将三个元素push入“栈”，先进后出
		stack.push("疯狂Java讲义");
		stack.push("轻量级Java EE企业应用实战");
		stack.push("疯狂Android讲义");
		System.out.println(stack); // [疯狂Android讲义, 轻量级Java EE企业应用实战, 疯狂Java讲义]
		System.out.println(stack.peek()); // 疯狂Android讲义
		System.out.println(stack); // [疯狂Android讲义, 轻量级Java EE企业应用实战, 疯狂Java讲义]
		System.out.println(stack.pop()); // 疯狂Android讲义
		System.out.println(stack);// [轻量级Java EE企业应用实战, 疯狂Java讲义]

		// 当做队列来使用,先进先出
		Queue<String> queue = new ArrayDeque<String>();
		queue.offer("疯狂Java讲义");
		queue.offer("轻量级JavaEE企业应用实践");
		queue.offer("疯狂Android讲义");
		System.out.println(queue); // [疯狂Java讲义, 轻量级JavaEE企业应用实践, 疯狂Android讲义]
		// 访问队列头部元素，但不将其poll出队列
		System.out.println(queue.peek());
		System.out.println(queue);
		// poll出第一个元素
		System.out.println(queue.poll());
		System.out.println(queue);// [轻量级JavaEE企业应用实践, 疯狂Android讲义]

	}

}
