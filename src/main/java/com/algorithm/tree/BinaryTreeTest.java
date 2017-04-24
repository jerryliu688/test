package com.algorithm.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// 初始化5个结点,值分别为: 1,2,3,4,5
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(); // 值默认为0
		Node n7 = null;

		System.out.println("n6 = " + n6);
		System.out.println("n7 = " + n7); // null

		// 构建二叉树, 以n1为根结点
		n1.left = n2;
		n1.right = n5;
		n2.left = n3;
		n2.right = n4;
		n5.left = n6;
		n5.right = n7;

		System.out.print("前序遍历结果为: ");
		preTraversal(n1);
		System.out.println();
		System.out.print("中序遍历结果为: ");
		midTraversal(n1);
		System.out.println();
		System.out.print("后序遍历结果为: ");
		behTraversal(n1);
	}

	public static void preTraversal(Node node) {
		if (node != null) {
			System.out.print(node.value + " "); // 输出当前结点值
		}
		if (node.left != null) {
			preTraversal(node.left); // 读左结点
		}
		if (node.right != null) {
			preTraversal(node.right); // 读右结点
		}
	}

	// 中序遍历
	public static void midTraversal(Node node) {
		if (node.left != null) {
			midTraversal(node.left);
		}
		if (node != null) {
			System.out.print(node.value + " ");
		}
		if (node.right != null) {
			midTraversal(node.right);
		}
	}

	// 后序遍历
	public static void behTraversal(Node node) {
		if (node.left != null) {
			behTraversal(node.left);
		}
		if (node != null) {
			System.out.print(node.value + " ");
		}
		if (node.right != null) {
			behTraversal(node.right);
		}
	}
}

class Node {
	public Node left; // 左子结点
	public Node right; // 右子结点
	public int value; // 结点值

	public Node(int value) {
		this.value = value;
	}

	public Node() {
	}

	// 前序遍历

}