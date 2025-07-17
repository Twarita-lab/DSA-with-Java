package Basics;

import org.w3c.dom.Node;

public class LinkedList_Example {

	//Creating Linked List
	//The values will come from main class
	class Node {
		int val;
		Node next;
		public Node(int val) {
			this.val = val;
		}
	}
	static Node head = null;
	Node tail = null;
	
	public void createNode(int val){
		Node newNode = new Node(val);
		if(head==null) {
			head=newNode;
			tail = newNode;
			
		}
		else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
	}
	
	//Printing List values
	public void getList(Node headNode) {
		Node current = headNode;
		while(current!=null) {
			System.out.println(current.val);
			current = current.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList_Example l = new LinkedList_Example();
		l.createNode(10);
		l.createNode(20);
		
		l.getList(head);
		
		
	}

}
