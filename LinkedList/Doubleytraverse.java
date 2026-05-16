import java.util.*;
class DoubleListNode{
	int val;
	DoubleListNode prev;
	DoubleListNode next;
	
	public DoubleListNode(int data)
	{
		this.val = data;
		prev = null;
		next = null;

}
class Doubleytraverse{
	public void traverseAtBeg(DoubleListNode node)
	{
		//check the null value
		while(node.prev!=null)
		{
			node=node.prev;
		}
		
		//print the vlaues from the begining
		while(node!=null)
		{
			System.out.print(node.val+" ");
			node = node.next;
		}
		System.out.println();
	}
	
	//traverse from end
	public void traverseAtEnd(DoubleListNode node)
	{
		//ending conditon null check
		while(node.next!==null)
		{
			node = node.next;
		}
		
		//printing all the values reverse dir unitl reach null
		while(node!=null)
		{
			System.out.print(node.val+" ");
			node =node.prev;
		}
			System.out.println();
	}
	public static void main(String[] args)
	{
		DoubleListNode d1 = new DoubleListNode(8);
		DoubleListNode d2 = new DoubleListNode(20);
		DoubleListNode d3 = new DoubleListNode(563);
		
		//linking
		d1.next = d2;
		d2.prev = d1;
		
		d2.next = d3;
		d3.prev = d2;
		
		DoubleTraverse dt = new DoubleTraverse();
		System.out.println("-----printing values forward direction-----");
		dt.traverseAtBeg(d2);
		System.out.println("-----printing values forward direction-----");
		
		
	}
 
}