import java.util.*;
class Count{
	public static void main(String[] args)
	{
		int count = 0;
		int arr[] = {56,82,3,84,75,6};
		boolean swapped;
		for(int i=0;i<arr.length-1;i++)
		{
			swapped = false;
			for(int j=0;j<arr.length-i-1;j++)
			{
			
			//swapping
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swapped = true;
				count++;
			}
		
			}
			if(!swapped)
			{
				break;
			}
		}
		System.out.print(count);
	}
				
}