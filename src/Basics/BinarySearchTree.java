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
		root = createNode(val, root);
	}

	public BinarySearchTree.Node createNode(int val, Node root) {
		if (root == null) {
			root = new Node(val);
			return root;

		}
		if (val < root.value) {
			root.leftChild = createNode(val, root.leftChild);

		} else {
			root.rightChild = createNode(val, root.rightChild);

		}
		return root;

	}

	public void printBT() {
		printBinaryTree(root);
	}

	public void printBinaryTree(Node root) {

		if (root != null) {
			printBinaryTree(root.leftChild);
			System.out.println(root.value);
			printBinaryTree(root.rightChild);
		}

	}

	public int min() {
		return minBinaryTree(root);
	}

	public int minBinaryTree(Node root) {
		Node current = root;
		while (current.leftChild != null) {
			current = current.leftChild;
			
		}
		return current.value;

	}
	
	public int max() {
		return maxBinaryTree(root);
	}

	public int maxBinaryTree(Node current) {
		//Node current = root;
		if (current.rightChild != null) {
			current = current.rightChild;
			return maxBinaryTree(current);			
			
		}
		else {
		return current.value;
		}

	}
	
	public int getHeight() {
		return height(root);
	}
	public int height(Node root) {
		if(root==null) return -1;
		
		return 1+Math.max(height(root.leftChild), height(root.rightChild));
	}
	
	public int searchValue(int value) {
		return searchValue(root, 0, value);
	}
	public int searchValue(Node current, int count, int value) {
		if(current==null) {
			return -1;
		}
		else if(current.value<value) {
			count=count+1;
			return searchValue(current.rightChild, count, value);
		}
		else if(current.value>value) {
			count=count+1;
			return searchValue(current.leftChild, count, value);
		}
		else
			return count;
		
	}
	public static void main(String[] args) {
		int[] a = { 4, 6, 12, 3, 9, 7, 14, 2 };

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		for (int i = 0; i < a.length; i++) {

			binarySearchTree.createNode(a[i]);
		}

		binarySearchTree.printBT();
		System.out.println(binarySearchTree.min());
		System.out.println(binarySearchTree.max());;
		
		System.out.println(binarySearchTree.getHeight());
		
		System.out.println(binarySearchTree.searchValue(14));
	}

}
