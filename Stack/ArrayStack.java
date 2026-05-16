import java.util.Stack;
class ArrayStack{
	
		//array declaration
		int[] data;
		//top most element
		int top;
		
		public ArrayStack(int capacity)
		{
			data = new int[capacity]; //array init
			top = -1; //initial value top most element
		}
		
		//is stack is full
		public boolean isFull()
		{
			return top == data.length-1;
		}
		
 
		public boolean isEmpty()
		{
			return top == -1;
		}
		//insert element into the stack
		public void push(int value)
		{
			if(isFull())
			{
				throw new RuntimeException("stack is over flow");
			}
			data[++top] = value; //top = top+value
		}
		//returns the top most element
		public int peek()
		{
			if(isEmpty())
			{
				throw new RuntimeException("stack is under flow");
			}
			return data[top];
		}
		//remove the top element
		public int pop()
		{
			if(isEmpty())
			{
				System.out.print("stack is empty");
			}
			return data[top--];
		}
		
		//size of the stack
		public int size()
		{
			return top+1;
		}
		//dispaly all the element in the stack
		public void dispaly()
		{
			if(isEmpty())
			{
				System.out.println("stack is empty");
				return;
			}
			System.out.println("bottom----->top");
			for(int i = 0;i <= top; i++)
			{
				System.out.print(data[i]+" ");
			}
			System.out.println();
		}
		public static void main(String[] args)
		{
			ArrayStack stack = new ArrayStack(5);
			stack.push(56);
			stack.push(22);
			stack.push(88);
			stack.push(11);
			
			stack.dispaly();
			System.out.println("top element: " +stack.peek());
			stack.pop();
			System.out.println("top element: " +stack.peek());
			System.out.println("size : " +stack.size());
			System.out.println("is stack is empty : " +stack.isEmpty());
		}
}