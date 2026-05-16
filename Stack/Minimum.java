package min;

import java.util.Stack;
import java.util.Arrays;

public class Minimum{
		Stack<Integer> stack = new Stack();
		Stack<Integer> minStack = new Stack();
		
		public void pushing(int val)
		{
			stack.push(val);
			if(minStack.isEmpty() || val<=minStack.peek())
			{
				minStack.push(val);
			}
		}
		
		public void popping()
		{
			if(stack.peek().equals(minStack.peek()))
			{
				minStack.pop();
			}
			stack.pop();
		}
		
		public int topEle()
		{
			return stack.peek();
		}
		public int getMin()
		{
			return minStack.peek();
		}
		
		public static void main(String[] args)
		{
			Minimum gm = new Minimum();
			gm.pushing(5);
			gm.pushing(-3);
			gm.pushing(0);
			gm.pushing(-2);
			gm.pushing(4);
			
			System.out.println("Top element: " +gm.topEle);
			System.out.println("Minimum element: " +gm.topMin);
			gm.popping();
			System.out.println("Top element: " +gm.topEle);
			System.out.println("Minimum element: " +gm.topMin);
			System.out.println();
		}

}