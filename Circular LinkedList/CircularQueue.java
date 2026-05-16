package DSA130526;

public class CircularQueue {
	int[] data;
	int capacity;
	int rear;
	int size;
	int front;
	
	public CircularQueue(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
		this.front = 0;
		this.rear = 0;
		this.size = 0;
		
	}
	
	//queue is empty
	public boolean isEmpty()
	{
		return size == 0;
		
	}
	
	//queue is full
	public boolean isFull()
	{
		return size == capacity;
		
	}
	
	//enqueue operations
	public void enqueue(int val)
	{
		if(isFull())
		{
			throw new RuntimeException("Queue is full");
		}
		
		data[rear] = val;
		rear = (rear+1)%capacity;
		size++;
	}
	
	//dequeue
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Queue is empty");
		}
		int remove = data[front];
		front = (front + 1 )% capacity;
		size--;
		return remove;
	}
	
	//peek operations
	public int peek()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Queue is Empty");
		}
		return data[front];
	}
	
	//display operation
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
		
		for(int i = 0; i < size; i++)
		{
			System.out.print(data[(front+i) % capacity]+ " ");
		}
		System.out.println();
	}
	
	//internal operations
	public void internalOp()
	{
		System.out.println("display the array: ");
		for(int val:data)
		{
			System.out.print(val+" ");
		}
			System.out.println();
			System.out.println("-----------");
			System.out.println("rear: " +rear);
			System.out.println("front: " +front );
			System.out.println("size: " +size);
			System.out.println("-----------");
			
		}
	

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(10);
		cq.enqueue(22);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		
		cq.display();
		cq.internalOp();
		
		cq.dequeue();
		cq.dequeue();
		
		cq.display();
		cq.internalOp();
		
		cq.enqueue(18);
		cq.display();
		cq.internalOp();

	}

}
