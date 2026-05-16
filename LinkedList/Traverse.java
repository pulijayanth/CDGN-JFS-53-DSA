package DSA130526;

public class Traverse {
	public static class ListNode {
		   //createing value and next 
			int val;
			ListNode next;
			public ListNode(int x) {
				this.val=x;
			}
	}

	public void traverseList(ListNode head)
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		ListNode l1= new ListNode(90);
		ListNode l2= new ListNode(71);
		ListNode l3= new ListNode(18);
		//linking
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		//create head is main
		ListNode head=l1;
		Traverse t= new Traverse();
		t.traverseList(head);
	}
}

