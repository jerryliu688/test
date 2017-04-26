package com.algorithm.linkedlist;

public class IntersectionList extends LinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node getIntersectionNode(Node headA, Node headB) {
		int sizeA = getSize(headA);
		int sizeB = getSize(headB);
		if (sizeA > sizeB) {
			for (int i = 0; i < (sizeA - sizeB); i++) {
				headA = headA.next;
			}
		} else if (sizeB > sizeA) {
			for (int i = 0; i < (sizeB - sizeA); i++) {
				headB = headB.next;
			}
		}
		while (headA != null && headB != null) {
			if (headA.value == headB.value) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	private static int getSize(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
//	public Node findIntersection(Node head, Node head2) {
//		int l1 = 0;
//		int l2 = 0;
//		Node tempHead = head;
//		Node tempHead2 = head2;
//		while (tempHead != null) {
//			l1++;
//			tempHead = tempHead.next;
//		}
//		while (tempHead2 != null) {
//			l2++;
//			tempHead2 = tempHead2.next;
//		}
//		int diff;
//		if (l1 < 12) {
//			Node temp = head;
//			head = head2;
//			head2 = temp;
//			diff = l2 - l1;
//		} else
//			diff = l1 - l2;
//		for (; diff > 0; diff--)
//			head = head.next;
//		while (head != head2) {
//			head = head.next;
//			head2 = head2.next;
//		}
//		return head;
//	}

	
}
