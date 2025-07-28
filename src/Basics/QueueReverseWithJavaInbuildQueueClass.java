package basics;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverseWithJavaInbuildQueueClass {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayDeque<>();
		q.add(10);
		q.add(20);
		q.add(30);

		System.out.println("Original Queue "+q);
		System.out.println("Reversed Queue "+reverseQueue(q));

	}

	private static Queue<Integer> reverseQueue(Queue<Integer> q) {
		Stack<Integer> temp = new Stack<Integer>();
		while (q.peek() != null) {
			//temp.push(q.poll());
			temp.push(q.remove());
		}
		while (!temp.isEmpty()) {
			q.add(temp.pop());
		}
		return q;
	}

}
