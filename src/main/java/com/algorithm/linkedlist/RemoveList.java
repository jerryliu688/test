package com.algorithm.linkedlist;

public class RemoveList extends LinkedList {

	// The linked list is sorted and it contains some duplicate values
	public void removeDuplicate() {
		Node curr = head;
		while (curr != null) {
			if (curr.next != null && curr.value == curr.next.value)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}
	}

	public Node removeElements(Node head, int val) {
		if (head == null)
			return null;
		Node pointer = head;
		while (pointer.next != null) {
			if (pointer.next.value == val)
				pointer.next = pointer.next.next;
			else
				pointer = pointer.next;
		}
		return head.value == val ? head.next : head;
	}

}
