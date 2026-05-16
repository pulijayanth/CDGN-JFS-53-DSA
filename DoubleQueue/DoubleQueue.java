package DSA130526;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleQueue {
	public static void main(String[] args)
	{
		Deque<Integer> q = new ArrayDeque<>();
		q.addFirst(1);
		q.addLast(3);
		q.addFirst(56);
		q.addLast(66);
		System.out.println("inserted elements: " +q);
		System.out.println("peek the element: " +q.peekFirst());
		System.out.println("peel the element form last: " +q.peekLast());
		q.removeFirst();
		q.removeLast();
		System.out.println("peek the element 1: " +q.peekFirst());
		System.out.println("peek element from last: " +q.peekLast());
		q.addFirst(88);
		q.addLast(83);
		System.out.println("---dequeue elements---");
		for(int num:q)
		{
			System.out.print(num+" ");
		}
	}

 }
