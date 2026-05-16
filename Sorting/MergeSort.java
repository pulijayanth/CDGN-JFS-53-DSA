package DSA130526;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int arr[],int nofOfEle)
	{
		//edge case
		if(nofOfEle<2)
		{
			return;
		}
		
		//find the middle element to partion the array
		int mid=nofOfEle/2;
		//divide the array two parts
		int[] leftArr=new int[mid];
		int[] rightArr=new int[nofOfEle-mid];
		//fill the elements in the empty arrays
		
		for(int i=0;i<mid;i++)
		{
			leftArr[i]=arr[i];
		}
		
		for(int i=mid;i<nofOfEle;i++)
		{
			rightArr[i-mid]=arr[i];
		}
		
		//apply merge sort on left side part
		mergeSort(leftArr, mid);
		
		//apply mergesort on rightsode array
		mergeSort(rightArr, nofOfEle-mid);
		
		//merge all the data and arrange in sorting order
		merge(arr,leftArr,rightArr,mid,nofOfEle-mid);
	}
	//merging for sorted order
	public static void merge(int arr[],int leftArr[],int rightArr[],int left,int right)
	{
		//definie initilizae values for comaprisiion
		int i=0,j=0,k=0;
		while(i<left && j<right) //until reach all elements in both ends
		{
			
			if(leftArr[i]<=rightArr[j]) {
				arr[k++]=leftArr[i++];
			}else {
				arr[k++]=rightArr[j++];
			}
		}
		
		//remaing elements
		while(i<left)
		{
			arr[k++]=leftArr[i++];
		}
		
		while(j<right)
		{
			arr[k++]=rightArr[j++];
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {6,2,3,8,9,1,5};
		mergeSort(arr, 7);
		System.out.println(Arrays.toString(arr));
	}
}



