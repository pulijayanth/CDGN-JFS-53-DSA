import java.util.*;
class Traverse{
	public static void main(String[] args){
		
		//creating am array
		String names[] = {"bahubali","devasena","kattapa","rajamatha"};
		
		//traerse with noraml for loop
		for(int i=0; i<names.length; i++)
		{
			System.out.print(names[i]+ " ");
		}
		System.out.println();
		//enhanced for loop
		for(String st: names)
		{
			System.out.print(st+ " ");
		}
	}
}