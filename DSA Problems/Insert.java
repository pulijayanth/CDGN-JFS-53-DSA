import java.util.*;
class Insert{
	public static void main(String[] args)
	{
		//creating array
		int num[] = {34,56,12,58,45};
		//insert the element and position
		int position = 2;
		int element = 77;
		
		//create new array with extra space
		int newArr[] = new int[num.length+1]; 
		
		//send before index values into new array
		for(int i=0;i<position;i++)
		{
			newArr[i] = num[i];
		}
		
		//inserting element in specific position
		newArr[position]= element;
		
		//inser remaining values from old to new
		for(int i= position; i<num.length;i++)
		{
			newArr[i+1]=[i];
		}
		//traverse elements newarray
		for(int el:newArr)
		{
			System.out.print(el+" ");
		}
	}
}
