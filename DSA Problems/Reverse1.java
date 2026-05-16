import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Reverse1{
	public ListNode rever(ListNode head)
	{
		//edge cases
		if(head == null)
		{
			return null;
		}
		if(head.next == null)
		{
			return head;
		}
		
		//take two pointers to iterate
		ListNode preNode = null;
		ListNode curNode = head;
		
		//condition to iterate
		while(curNode != null)
		{
			ListNode nextNode = curNode.next; 
			preNode = curNode;
			curNode = nextNode;
		}
		
		head  = preNode;
		return head;
	}
	 //traverse logic
	 public void traverse(ListNode head)
	 {
		 ListNode ptr = head;
		 while(ptr != null)
		 {
			 System.out.print(ptr.val+" ");
			 ptr = ptr.next;
		 }
	 }
	 public static void main(String[] args)
	 {
		 ListNode l1 = new ListNode(67);
		 ListNode l2 = new ListNode(83);
		 ListNode l3 = new ListNode(36);
		 ListNode l4 = new ListNode(47);
		
		
		//linking 
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		Reverse1 r = new Reverse1();
		ListNode head = l1;
		System.out.println("=======Before reverse=======");
		r.traverse(head);
		System.out.println();
		head = r.rever(head);
		System.out.println("=======After reverse=======");
		r.traverse(head);
 		
}
}