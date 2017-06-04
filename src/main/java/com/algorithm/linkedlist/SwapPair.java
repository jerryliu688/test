package com.algorithm.linkedlist;

public class SwapPair extends LinkedList {

	public Node swapPairs(Node head) {
		Node dummy = new Node(-1);
		dummy.next = head;
		Node prev = dummy;
		Node first = dummy.next;
		while (first != null && first.next != null) {
			prev.next = first.next;
			first.next = first.next.next;
			prev.next.next = first;
			prev = first;
			first = first.next;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		SwapPair linkedList = new SwapPair();

		linkedList.sortedInsert(5);
		linkedList.sortedInsert(6);
		linkedList.sortedInsert(1);
		// linkedList.reverse();
	}

}
