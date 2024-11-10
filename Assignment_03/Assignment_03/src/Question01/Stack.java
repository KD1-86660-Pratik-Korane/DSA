 package Question01;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int value) {		 
		top++;	 
		arr[top] = value;
	}

	public int pop() {
		int temp = arr[top];	 
		top--;
		return temp;	 
	}
	
	public int peek() {	 
	  return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}
}











