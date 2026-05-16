package DSA130526;

import java.util.Stack;

public class QueueWithStack {
	Stack<Integer> input = new Stack();
	Stack<Integer> output = new Stack();
	int size;
 	public boolean isEmpty() {
		return input.empty() && output.empty();
	}
 	public void enqueue(int value) {
 		input.push(value);
 		size++ ; 
 	}
 	public int peek() {
 		if(output.isEmpty()) {
 			while(!input.isEmpty()) {
 				output.push(input.pop());
 			}
 		}
 		return output.peek();
 	}
 	
 	public int dequeue() {
 		peek();
 		int val = output.pop();
 		size--;
 		return val;
 	}
 	
 	
 	public static void main(String[] args) {
		QueueWithStack qs = new QueueWithStack();
		
		qs.enqueue(12);
		qs.enqueue(22);
		qs.enqueue(32);
		qs.enqueue(42);
		qs.enqueue(52);
		qs.enqueue(62);
		
		System.out.println("peek the element: "+qs.peek());
		System.out.println("pop the element: "+qs.dequeue());
		System.out.println("pop the element: "+qs.dequeue());
		System.out.println("peek the element: "+qs.peek());
		System.out.println("is queue empty: "+qs.isEmpty());
		System.out.println("size of  the queue: "+qs.size);
	}	
}

