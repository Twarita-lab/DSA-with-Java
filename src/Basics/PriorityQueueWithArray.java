package basics;

public class PriorityQueueWithArray {

	int rear = -1;
	int[] a;
	int size;
	int front;

	public PriorityQueueWithArray(int size) {
		this.size = size;
		a = new int[size];
	}

	public void enque(int x) {
		if(rear==-1) {
			rear++;
			a[rear] = x;
		}
		else {
			for(int i=rear; i>=0; i--) {
				if(a[i]>x) {
					a[i+1]=a[i];
					if(i==0) {
						a[i]=x;
					}
					
				}
				else {
					a[i+1]=x;
					break;
				}
				
			}
			rear++;
		}
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
		for (int i = 0; i <= rear; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		PriorityQueueWithArray qa = new PriorityQueueWithArray(3);
		qa.enque(10);
		qa.enque(30);
		qa.enque(20);

		qa.printQueue();

		System.out.println("-----------------------------------");
		qa.deque();
		qa.printQueue();
	}

}
