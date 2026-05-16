package DSA130526;

import java.util.List;

import DSA130526.Traverse.ListNode;

public class ReverseLink {
	public static class ListNode {
		   //createing value and next 
			int val;
			ListNode next;
			public ListNode(int x) {
				this.val=x;
			}
	}
	public ListNode reverseWithsp(ListNode head)
	{
		if(head==null)
		{
			return null;
		}
		if(head.next==null)
		{
			return head;
		}
		
		ListNode preNode=null;
		ListNode currNode=head;
		
		while(currNode!=null)
		{
			ListNode nextNode=currNode.next;
			currNode.next=preNode;
			preNode=currNode;
			currNode=nextNode;
		}
		head=preNode;
		return head;
	}
	public void traversing(ListNode head)
	{
		ListNode temp=head;  //assigning temp variable to head to traverse
		
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		//listnodes
		ListNode l1= new ListNode(4);
		ListNode l2= new ListNode(6);
		ListNode l3= new ListNode(8);
		ListNode l4= new ListNode(10);
		
		//link
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		ListNode head=l1;
		ReverseLink rl= new ReverseLink();
		System.out.println("before reveres");
		rl.traversing(head);
		
		head=rl.reverseWithsp(head);
		System.out.println();
		System.out.println("after reveres");
		rl.traversing(head);
	}
}



