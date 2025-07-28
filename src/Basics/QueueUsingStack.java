package basics;

import java.util.Stack;

public class QueueUsingStack {
	//int rear = -1;
	int front;
	Stack<Integer> a = new Stack<>();
	
	public void enque(int x) {
		//rear++;
		a.push(x);
	}

	public int deque() {
		Stack<Integer> temp = new Stack<>();
		while(!a.isEmpty()) {
			temp.push(a.pop());
		}
		front = temp.pop();
		while(!temp.isEmpty()) {
			a.push(temp.pop());
		}
		return front;
	}
	
	public void printQueue() {
		System.out.println(a);
	}
	

	

	public static void main(String[] args) {
		
		QueueUsingStack qa = new QueueUsingStack();
		qa.enque(10);
		qa.enque(20);
		qa.enque(30);
		
		qa.printQueue();
		
		System.out.println("-----------------------------------");
		qa.deque();
		qa.printQueue();
	}

}
