package question03;

public class LinearQueue {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {		 	 
		arr[rear++] = value;
	}
	
	public int pop() {
		int temp = arr[front];	 
		front++;
		return temp;
	}
	
	public int peek() {		 
		return arr[front];
	}

	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}	
}













