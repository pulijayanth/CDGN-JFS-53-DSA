package DSA130526;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class CircularQueueWithArrays {
	int[] data;
	int front;
	int rear;
	int capacity;
	int size;
	public CircularQueueWithArrays(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==capacity;
	}
	public void enqueue(int x) {
		if(isFull()) {
			throw new RuntimeException("Queue is Full.");
		}
		data[rear] = x;
		rear = (rear+1)%capacity;
		size++;
	}
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		int removed = data[front];
		front = (front+1)%capacity;
		size--;
		return removed;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		return data[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		for(int i=0;i<size;i++) {
			System.out.print(data[(front+1)%capacity]+" ");
		}
	}
	
	public void internalOp() {
		System.out.println("display the array: ");
		for(int val:data) {
			System.out.print(val+" ");
		}
		System.out.println("-----------------------");
		System.out.println("front: "+front);
		System.out.println("rear: "+rear);
		System.out.println("size: "+size);
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		CircularQueueWithArrays cd = new CircularQueueWithArrays(6);
		cd.enqueue(12);
		cd.enqueue(23);
		cd.enqueue(34);
		cd.dequeue();
		cd.dequeue();
		System.out.println("is empty: "+cd.isEmpty());
		System.out.println("is Full: "+cd.isFull());
		cd.internalOp();
	}
}

