package com.algorithm.linkedlist;

public class NthNode extends LinkedList {

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
		// TODO Auto-generated method stub

	}

}
