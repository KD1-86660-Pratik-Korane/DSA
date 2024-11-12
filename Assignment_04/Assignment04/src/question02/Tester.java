package question02;
public class Tester{

	public static void main(String[] args) {
		
		
		Stack stack=new Stack();
		
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.pop();
		stack.peek();	
		
		
		Queue queue=new Queue();
		
		
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		
		queue.front();
		queue.dequeue();
		queue.front();
		

	}

}