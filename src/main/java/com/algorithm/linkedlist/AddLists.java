package com.algorithm.linkedlist;

public class AddLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node addLists(Node l1, Node l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		Node head = new Node();
		Node point = head;
		int carry = 0;
		while (l1 != null && l2 != null) {
			int sum = carry + l1.value + l2.value;
			point.next = new Node(sum % 10);
			carry = sum / 10;
			l1 = l1.next;
			l2 = l2.next;
			point = point.next;
		}
		while (l1 != null) {
			int sum = carry + l1.value;
			point.next = new Node(sum % 10);
			carry = sum / 10;
			l1 = l1.next;
			point = point.next;
		}
		while (l2 != null) {
			int sum = carry + l2.value;
			point.next = new Node(sum % 10);
			carry = sum / 10;
			l2 = l2.next;
			point = point.next;
		}
		if (carry != 0) {
			point.next = new Node(carry);

		}
		return head.next;
	}
}
