package basics;

public class BinarySearchTree {

	public class Node {
		private int value;
		private Node leftChild;
		private Node rightChild;

		public Node(int value) {
			this.value = value;
		}

	}

	Node root;

	public void createNode(int val) {
		createNode(val, root);
	}

	public BinarySearchTree.Node createNode(int val, Node root) {
		if (root == null) {
			root = new Node(val);
			return root;

		} else {
			if (val < root.value) {
				root.leftChild = createNode(val, root.leftChild);
				return root.leftChild;
			} else {
				root.rightChild = createNode(val, root.rightChild);
				return root.rightChild;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 4, 6, 12, 3, 9, 7, 14, 2 };

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		for (int i = 1; i < a.length; i++) {

			binarySearchTree.createNode(a[i]);
		}

	}

}
