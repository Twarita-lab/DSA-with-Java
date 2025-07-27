package basics;

public class QueueWithArray {

	int rear = -1;
	int[] a;
	int size;
	int front;

	public QueueWithArray(int size) {
		this.size = size;
		a = new int[size];
	}

	public void enque(int x) {
		rear++;
		a[rear] = x;
	}

	public int deque() {
		front = a[0];

		for (int i = 0; i < rear; i++) {
			a[i] = a[i + 1];
		}
		rear--;

		return front;
	}
	
	public void printQueue() {
		for(int i=0; i<=rear; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		QueueWithArray qa = new QueueWithArray(3);
		qa.enque(10);
		qa.enque(20);
		qa.enque(30);
		
		qa.printQueue();
		
		System.out.println("-----------------------------------");
		qa.deque();
		qa.printQueue();
	}

}
