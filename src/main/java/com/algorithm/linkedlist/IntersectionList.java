package com.algorithm.linkedlist;

public class IntersectionList extends LinkedList {
	public Node findIntersection(Node head, Node head2) {
		int l1 = 0;
		int l2 = 0;
		Node tempHead = head;
		Node tempHead2 = head2;
		while (tempHead != null) {
			l1++;
			tempHead = tempHead.next;
		}
		while (tempHead2 != null) {
			l2++;
			tempHead2 = tempHead2.next;
		}
		int diff;
		if (l1 < 12) {
			Node temp = head;
			head = head2;
			head2 = temp;
			diff = l2 - l1;
		} else
			diff = l1 - l2;
		for (; diff > 0; diff--)
			head = head.next;
		while (head != head2) {
			head = head.next;
			head2 = head2.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
