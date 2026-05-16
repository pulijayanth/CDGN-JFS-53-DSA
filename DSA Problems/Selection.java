import java.util.*;
class Selection{
	public static void main(String[] args)
	{
		int arr[] = {2,4,5,67,8};
		for(int i=0; i<arr.length-1;i++)
		{
			int min_index = 1;
			for(int j=i+1; i<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		 System.out.println(Arrays.toString(arr));
    }
		
			
}