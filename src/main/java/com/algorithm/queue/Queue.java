package com.algorithm.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
	private int size;
	private int Capacity = 100;
	private int[] data;
	int front = 0;
	int back = 0;

	public Queue() {
		size = 0;
		data = new int[100];
	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	public boolean offer(int value) {
		if (size >= Capacity) {
			System.out.println("Queue is full.");
			return false;
		} else {
			size++;
			data[back] = value;
			back = (++back) % (Capacity - 1);
		}
		return true;
	}

	public int poll() {
		int value;
		if (size <= 0) {
			System.out.println("Queue is empty.");
			return -999;
		} else {
			size--;
			value = data[front];
			front = (++front) % (Capacity - 1);
		}
		return value;
	}

	public static void main(String[] args) {
		Queue que = new Queue();
		for (int i = 0; i < 10; i++) {
			que.offer(i);
		}
		for (int i = 0; i < 12; i++) {
			System.out.println(que.poll());
		}

		Deque<Integer> queue = new ArrayDeque<Integer>();
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		for (int i = 0; i < 12; i++) {
			System.out.println(queue.poll());
		}
	}
}