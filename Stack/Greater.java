package stack;

import java.util.Stack;
import java.util.Arrays;
class Greater{
	
	public static int[] nextGreater(int[] arr)
	{
		int n = arr.length;
		//NEW ARRAY TO STORE REUSLT
		
		int res[] = new int[n];
		//TO HELP THE ELEMENTS TO FINDOUT WHICH IS GREATER
		//CREATE A STACK
		
		Stack<Integer> stack = new Stack();
		
		for(int i = n-1; i>=0; i--)
		{
			while(!stack.isEmpty() && stack.peek()<arr[i])
			{
				stack.pop();
			}
			if(stack.isEmpty())
			{
				res[i] =-1;
			}else{
				res[i] = stack.peek();
			}
			stack.push(arr[i]);
		}
		return res;
	}
	public static void main(String[] args)
	{
		int arr[] = {4 ,5, 8,12,3,2,9,1};
		System.out.println("Original Array: " +Arrays.toString(arr));
		int result[] = nextGreater(arr);
		System.out.println("Result Array: " +Arrays.toString(result));
	}
}
		
	

