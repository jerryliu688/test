package com.algorithm.linkedlist;

public class ReverseList extends LinkedList {

	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public Node reverseRecurseUtil(Node currentNode, Node nextNode) {
		Node ret;
		if (currentNode == null)
			return null;
		if (currentNode.next == null) {
			currentNode.next = nextNode;
			return currentNode;
		}
		ret = reverseRecurseUtil(currentNode.next, currentNode);
		currentNode.next = nextNode;
		return ret;
	}

	public void reverseRecurse() {
		head = reverseRecurseUtil(head, null);
	}

	public static void main(String[] args) {
		ReverseList linkedList = new ReverseList();
		// linkedList.addHead(1);
		// linkedList.addHead(2);
		// linkedList.addHead(3);
		// linkedList.addTail(5);
		// linkedList.addTail(6);
		linkedList.sortedInsert(5);
		linkedList.sortedInsert(6);
		linkedList.sortedInsert(1);
		linkedList.reverse();
	}

}
