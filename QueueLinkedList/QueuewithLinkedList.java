package DSA130526;

public class QueuewithLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
	}
	
    ListNode head;
    ListNode tail;
    int size;

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void enqueue(int value){
        ListNode newNode=new ListNode(value);
        if(tail==null){
            head=tail=newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    public int dequeue(){
        if (head==null){
            throw new RuntimeException("Queue is empty");
        }
        int value=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public int peek(){
        return head.val;
    }

    public static void main(String[] args){
        QueuewithLinkedList q=new QueuewithLinkedList();

        System.out.println("Enqueue the elements:");
        q.enqueue(45);
        q.enqueue(74);
        q.enqueue(19);
        q.enqueue(37);
        q.enqueue(90);

        System.out.println("Peek of the front element: "+q.peek());
        System.out.println("Size of the queue: "+q.size());
        System.out.println("Remove the elements:"+q.dequeue());
        System.out.println("Remove the elements:"+q.dequeue());
        System.out.println("Peek of the elements: "+q.peek());
        System.out.println("size of the queue: "+q.size());
        System.out.println("Check if the queue is empty: "+q.isEmpty());
    }
}

