package com.algorithm.linkedlist;

public class CopyList extends LinkedList {

	public LinkedList CopyListReversed() {
		Node tempNode = null;
		Node tempNode2 = null;
		Node curr = head;
		while (curr != null) {
			tempNode2 = new Node(curr.value, tempNode);
			curr = curr.next;
			tempNode = tempNode2;
		}
		LinkedList ll2 = new LinkedList();
		ll2.head = tempNode;
		return ll2;
	}

	public LinkedList copyList() {
		Node headNode = null;
		Node tailNode = null;
		Node tempNode = null;
		Node curr = head;
		if (curr == null)
			return null;
		headNode = new Node(curr.value, null);
		tailNode = headNode;
		curr = curr.next;
		while (curr != null) {
			tempNode = new Node(curr.value, null);
			tailNode.next = tempNode;
			tailNode = tempNode;
			curr = curr.next;
		}
		LinkedList ll2 = new LinkedList();
		ll2.head = headNode;
		return ll2;
	}

	
	public static void main(String[] args) {
		CopyList linkedList = new CopyList();
		linkedList.sortedInsert(5);
		linkedList.sortedInsert(6);
		linkedList.sortedInsert(1);
		LinkedList copylinkedList = linkedList.CopyListReversed();
		LinkedList copylinkedList1 = linkedList.copyList();
		// copylinkedList.addTail(2);
		linkedList.print();
		copylinkedList.print();
		copylinkedList1.print();
	}

}
