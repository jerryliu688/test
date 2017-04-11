package com.algorithm.linkedlist;

public class LinkedList {
	public Node head;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addHead(int value) {
		Node newhead = new Node(value, head);
		if (head != null) {
			newhead.next = head;
			head = newhead;
		} else {
			head = newhead;
		}
		size++;
	}

	public void addTail(int value) {
		Node newNode = new Node(value, null);
		Node curr = head;
		if (head == null)
			head = newNode;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}

	public boolean isPresent(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.value == data)
				return true;
			temp = temp.next;
		}
		return false;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void sortedInsert(int value) {
		Node newNode = new Node(value, null);
		Node curr = head;
		if (curr == null || curr.value > value) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (curr.next != null && curr.next.value < value) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
	}

	public boolean deleteNode(int delValue) {
		Node temp = head;
		if (isEmpty())
			return false;
		if (delValue == head.value) {
			head = head.next;
			size--;
			return true;
		}
		while (temp.next != null) {
			if (temp.next.value == delValue) {
				temp.next = temp.next.next;
				size--;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	
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

	public void freeList() {
		head = null;
		size = 0;
	}

	public boolean compareList(LinkedList ll) {
		return compareList(head, ll.head);
	}

	public boolean compareList(Node head1, Node head2) {
		if (head1 == null && head2 == null)
			return true;
		else if ((head1 == null) || (head2 == null) || (head1.value != head2.value))
			return false;
		else
			return compareList(head1.next, head2.next);
	}

	public int findLength() {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	public int nthNodeFromBegining(int index) {
		if (index > size() || index < 1)
			return Integer.MAX_VALUE;
		int count = 0;
		Node curr = head;
		while (curr != null && count < index - 1) {
			count++;
			curr = curr.next;
		}
		return curr.value;
	}

	public int nthNodeFromEnd(int index) {
		int size = findLength();
		int startIndex;
		if (size != 0 && size < index) {
			return Integer.MAX_VALUE;
		}
		startIndex = size - index + 1;
		return nthNodeFromBegining(startIndex);
	}

	public int nthNodeFromEnd2(int index) {
		int count = 1;
		Node forward = head;
		Node curr = head;
		while (forward != null && count <= index) {
			count++;
			forward = forward.next;
		}
		if (forward == null)
			return Integer.MAX_VALUE;
		while (forward != null) {
			forward = forward.next;
			curr = curr.next;
		}
		return curr.value;
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		// linkedList.addHead(1);
		// linkedList.addHead(2);
		// linkedList.addHead(3);
		// linkedList.addTail(5);
		// linkedList.addTail(6);
		linkedList.sortedInsert(5);
		linkedList.sortedInsert(6);
		linkedList.sortedInsert(1);
		linkedList.reverse();
		linkedList.print();
	}
}

class Node {

	public int value;
	public Node next;

	public Node(int v, Node n) {
		value = v;
		next = n;
	}

	public Node(int v) {
		value = v;
		next = null;
	}

}
