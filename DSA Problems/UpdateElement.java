import java.util.*;
class UpdateElement{
	public static void updateEle
	(int[] arr, int size, int position, int newVal)
	{
		if(position<0 || position>=size)
		{
			System.out.println("invalid position");
		}
		else
		{
			arr[position]=newVal;
			System.out.println("updated element: " +position+" " +newVal);
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {12,89,45};
		UpdateElement.updateEle(arr, 3, 1, 22);
		System.out.println(Arrays.toString(arr));
}
}