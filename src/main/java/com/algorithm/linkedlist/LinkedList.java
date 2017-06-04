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

	// 查找单链表的中间结点
	/**
	 * 此题可应用于上一题类似的思想。也是设置两个指针，只不过这里是，两个指针同时向前走，前面的指针每次走两步，后面的指针每次走一步，
	 * 前面的指针走到最后一个结点时，后面的指针所指结点就是中间结点，即第（n/2+1）个结点。注意链表为空，链表结点个数为1和2的情况。时间复杂度O（n
	 */
	public static Node getMiddleNode(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node q = head; // p---q
		Node p = head;

		// 前面指针每次走两步，直到指向最后一个结点，后面指针每次走一步
		while (q.next != null) {
			q = q.next;
			p = p.next;
			if (q.next != null) {
				q = q.next;
			}
		}
		return p;
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

		linkedList.print();
	}
}

class Node {

	public int value;
	public Node next;

	public Node(int v, Node n) {
		this.value = v;
		next = n;
	}

	public Node(int v) {
		this.value = v;
		next = null;
	}

	public Node() {

	}
}
