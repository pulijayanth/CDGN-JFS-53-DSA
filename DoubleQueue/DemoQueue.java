package DSA130526;

import java.util.ArrayDeque;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		System.out.print("Enqueue the element: ");
		q.offer(45);
		q.offer(74);
		q.offer(19);
		q.offer(37);
		q.offer(90);
		
		System.out.println("Peek the element: " + q.peek());
		System.out.println("Remove the element: " + q.poll());
		System.out.println("Peek the element: " + q.peek());
		System.out.println("Size of the Queue: " + q.size());
		System.out.println("Check is empty: " + q.isEmpty());

	}

}
