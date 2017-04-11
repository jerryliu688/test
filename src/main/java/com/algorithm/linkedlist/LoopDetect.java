package com.algorithm.linkedlist;

public class LoopDetect extends ReverseList {

	public boolean loopDetect() {
		Node slowPtr;
		Node fastPtr;
		slowPtr = fastPtr = head;
		while (fastPtr.next != null && fastPtr.next.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				System.out.println("loop found");
				return true;
			}
		}
		System.out.println("loop not found");
		return false;
	}

	public boolean reverseListLoopDetect() {
		Node tempHead = head;
		reverse();
		if (tempHead == head) {
			reverse();
			System.out.println("loop found");
			return true;
		} else {
			reverse();
			System.out.println("loop not found");
			return false;
		}
	}

	public int loopTypeDetect() {
		Node slowPtr;
		Node fastPtr;
		slowPtr = fastPtr = head;
		while (fastPtr.next != null && fastPtr.next.next != null) {
			if (head == fastPtr.next || head == fastPtr.next.next) {
				System.out.println("circular list loop found");
				return 2;
			}
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				System.out.println("loop found");
				return 1;
			}
		}
		System.out.println("loop not found");
		return 0;
	}

	public Node loopPointDetect() {
		Node slowPtr;
		Node fastPtr;
		slowPtr = fastPtr = head;
		while (fastPtr.next != null && fastPtr.next.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return slowPtr;
			}
		}
		return null;
	}

	public void removeLoop() {
		Node loopPoint = loopPointDetect();
		if (loopPoint == null)
			return;
		Node firstPtr = head;
		if (loopPoint == head) // circular list case.
		{
			while (firstPtr.next != head)
				firstPtr = firstPtr.next;
			firstPtr.next = null;
			return;
		}
		Node secondPtr = loopPoint;
		while (firstPtr.next != secondPtr.next) // general loop case.
		{
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}
		secondPtr.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
