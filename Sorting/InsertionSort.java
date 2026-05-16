package DSA130526;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(int arr[])
	{
		int n=arr.length; //length of the array
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			//move elemenets
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {7,3,9,6,1,5};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}


}
