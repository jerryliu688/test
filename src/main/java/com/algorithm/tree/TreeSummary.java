package com.algorithm.tree;
 

public class TreeSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int maxDeath(Node node) {
		if (node == null) {
			return 0;
		}
		int left = maxDeath(node.left);
		int right = maxDeath(node.right);
		return Math.max(left, right) + 1;
	}
}
