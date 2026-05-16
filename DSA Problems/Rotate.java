import java.util.*;
class Rotate{
	public static void rotationleftbyk(int arr[], int k)
	{
		//logic if k is greater than the length
		k = k % arr.length; //remainder
		
		//reverse the complete array
		reverse(arr, 0, arr.length-1);
		
		//reverse the remaining values
		reverse(arr, 0, arr.length-k-1);
		
		//reverse the remaining values for rotations
		reverse(arr, arr.length-k, arr.length-1);
	}
	public static void reverse(int arr[], int start, int end)
	{
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5};
		rotationleftbyk(arr, 3);
		System.out.println(Arrays.toString(arr));
	}


}