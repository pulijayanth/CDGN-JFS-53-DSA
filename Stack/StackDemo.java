import java.util.Stack;

class StackDemo{
public static void main(String[] args)
{
	//ArrayList al = new ArrayList();
	Stack st = new Stack();
	
	st.add(67);
	st.push(57);
	st.push(69);
	st.push(63);
	st.push(17);
	st.push(45);
	st.push(78);
	
	System.out.println(st);
	System.out.println(st.peek());
	System.out.println(st.search(17));
	System.out.println(st.isEmpty());
	st.pop();
	System.out.println(st.peek());
	
}
}
	