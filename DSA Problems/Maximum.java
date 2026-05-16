import java.util.*;
class Maximum{
		
	public static void main(String[] args){
		int arr[] = {43,55,79,90};
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<arr.lenght;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];//UPDATED MAXIMUM VALUE
			}else{
				min = arr[i];
		}
	}
		System.out.print("Min element: " + min);
		System.out.print("Max element: " + max);
		
	}
}