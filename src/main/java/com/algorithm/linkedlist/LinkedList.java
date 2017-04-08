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

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addHead(1);
		linkedList.addHead(2);
		linkedList.addHead(3);
		linkedList.addTail(5);
		linkedList.addTail(6);
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
