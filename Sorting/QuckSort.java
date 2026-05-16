package DSA130526;

import java.util.Arrays;

public class QuckSort {
	public static void quickSort(int arr[],int begin,int end)
	{
		if(begin<end)
		{
			int partietion=findPartition(arr,begin,end);
			
			quickSort(arr, begin, partietion-1);
			quickSort(arr, partietion+1, end);
		}
	}
	public static int findPartition(int [] arr,int begin,int end)
	{
		int pivote=arr[end];
		//smallest index
		int i=begin-1; //
		
		for(int j=begin;j<end;j++)
		{
			//current element is smaller than the pivote element
			if(arr[j]<pivote)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, end);
		return i+1;
	}
private static void swap(int[] arr, int i, int j) {
            int temp=arr[i];
            arr[i]=arr[j];
           arr[ j]=temp;
	}
public static void main(String[] args) {
	
	int arr[]= {7,2,5,8,3,9,1,4};
	quickSort(arr, 0, 7);
	System.out.println(Arrays.toString(arr));
}


}
