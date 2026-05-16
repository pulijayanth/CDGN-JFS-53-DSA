import java.util.*;
class ListNode{
	public ListNode insertAtBeg(ListNode head, int valToInsert)
	{
		//newNode creation
		ListNode newNode = new ListNode(valToInsert);
		
		newNode.next = head;
		
		head = newNode;
		return head;
	}
	
	//traverse
	public void traverse(ListNode head)
	{
		ListNode temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	public static void main(Stirng[] args)
	{
		ListNode l1 = new ListNode(34);
		ListNode l2 = new ListNode(23);
		ListNode l3 = new ListNode(67);
		ListNode l4 = new ListNode(89);
		
		//linking
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		InsertingCase ic = new InsertingCase();
		System.out.println("Inserting elements before insertion");
		ListNode head = l1;
		ic.traverse(head);
		
		System.out.println();
		head = ic.insertAtBeg(head, l1);
		System.out.println("after inserting value at beg");
		ic.traverse(head);
	}
}
		
		
		