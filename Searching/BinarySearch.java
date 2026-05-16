public class BinarySearch{
	public static void main(String[] args)
	{
		String names[] = {"bahu","deva","soma","tarun"};
		String target = "soma";
		int left = 0;?  
		
		while(left<right)
		{
			//finding mid element
			int mid = (left + right)/2;
			int cmp = names[mid].compareTo(target);
			if(cmp == 0)
			{
				System.out.println("fonund at: " + mid);
				return;
			}
			else if(cmp <0)
			{
				left = mid+1;
			}
			else{
				right = mid-1;
			}
		}
		System.out.println("element not found..");

		
	}
	

}