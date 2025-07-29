package basics;

public class LinkedList_Example {

	// Creating Linked List
	// The values will come from main class
	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static Node head = null;
	Node tail = null;

	//Create new Node with value
	//O(1) -> time complexity
	public void createNode(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}

	// Printing List values
	//O(n) -> time complexity
	public void getList(Node headNode) {
		Node current = headNode;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	// Replacing head
	//O(1) -> time complexity
	public void addNodesAtTheBeginning(int i) {
		Node newNode = new Node(i);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}
	
	//Replace node.next for index-1
	//add original index node as node.next at Index
	//O(n) -> time complexity
	public void addNodeAtGivenIndex(int index, int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} 
		else if(index ==1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			int count = 1;
			Node currentNode = head;
			while(currentNode!=null && count<index-1) {
				currentNode = currentNode.next;
				//System.out.println(currentNode.val+ " At index "+index +" and count "+count);
				count++;
				
			
		};
			Node temp = currentNode.next;			
			currentNode.next = newNode;
			newNode.next = temp;
	}
	}
	
	
	//Delete last node
	//O(n) -> time complexity
	public void deleteLastNode(Node headNode) {
		Node currentNode = headNode;
		do {
			currentNode = currentNode.next;
		}while(currentNode.next.next != null);
		currentNode.next=null;
		tail = currentNode;
	
	}
	
	//Removing head from List
	//O(1) -> time complexity
	public void deleteFirstNode(Node headNode) {
		head = headNode.next;
	
	}
	
	//Removing node at specific index
	//O(n) -> time complexity
	public void deleteIndexNode(int index, Node headNode) {
		Node currentNode = headNode;
		//Node temp = headNode;
		int count = 1;
		while(currentNode!=null && count<index-1) {
			//temp = currentNode;
			currentNode = currentNode.next;
			count++;
		}
		currentNode.next = currentNode.next.next;
	}
	
	//Reversing Linked List
	//O(n) -> time complexity
	public void reverseNode(Node headNode) {
		Node current = headNode;
		Node prev = null;
		Node after;
		
		while(current!=null) {
			after = current.next;			
			current.next = prev;
			prev = current;
			current = after;
		}
		head = prev;
	}

		
	public static void main(String[] args) {
		LinkedList_Example l = new LinkedList_Example();

		l.createNode(10);
		l.createNode(20);

		l.getList(head);
		System.out.println("------------------------------------------");
		l.addNodesAtTheBeginning(40);
		l.getList(head);
		System.out.println("------------------------------------------");
		
		l.addNodeAtGivenIndex(2, 30);
		l.getList(head);
		System.out.println("------------------------------------------");
		
		l.deleteLastNode(head);
		l.getList(head);
		System.out.println("------------------------------------------");
		
		l.deleteFirstNode(head);
		l.getList(head);
		System.out.println("------------------------------------------");
		
		l.createNode(1);
		l.createNode(2);
		l.getList(head);
		System.out.println("------------------------------------------");
		
		l.deleteIndexNode(2, head);
		l.getList(head);
		System.out.println("------------------------------------------");
		
		l.reverseNode(head);
		l.getList(head);
		System.out.println("------------------------------------------");
		

		
	}

}
