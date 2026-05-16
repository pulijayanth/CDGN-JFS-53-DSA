public class InserCase{
	
	//TRAVERSING NODES
	public void traverse(CircularLinkedList head)
	{
		CircularLinkedList temp = head;
		do{
			System.out.print(temp.val+" ");
			temp= temp.next;
		} while(temp!=head);
	}
	
	//INSERTING AT THE BEGGINING
	public CircularLinkedList insertBeg(CircularLinkedList head, int val)
	{
		CircularLinkedList newNode = new CircularLinkedList(val); //NEWNODE
		
		CircularLinkedList ptr = head;
		
		while(ptr.next != head)
		{
			ptr = ptr.next;
		}
		
		newNode.next = head;
		ptr.next = newNode;
		head = newNode; //UPDATED NEW NODE AS HEAD
		return head;
	}
	
	//INSERT AT THE END
	public CircularLinkedList insertEnd(CircularLinkedList head, int val)
	{
		CircularLinkedList newNode = new CircularLinkedList(val);
		
		//TEMPRORY VARIABLE TO TRAVERSE
		CircularLinkedList ptr = head;
		while(ptr.next!=head)
		{
			ptr = ptr.head;
			

}