class StackException extends RuntimeException{    
		public StackException(String err) {
			super(err);
		}
}

public class Stack {
	
	private class Node{
		int element;
		Node next;
		
		public Node(int e, Node n){
			element = e;
			next = n;
		}
	}
	
	private Node top;
	private int size;
	
	private LinkedList ll;
	
	public Stack(){
		top = null;
		size = 0;
		ll = new LinkedList();
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return size; 
	}
	
	// part 3: complete
	public void push(int o){
		ll.addAtHead(o);
	}
	
	// part 3: complete
	public int pop() throws StackException{
		return ll.removeAtHead();
		//returns -1 if empty
	}
	
	// part 3: complete
	public int top() throws StackException{
		//pop and push carried out to get value
		//no way of accessing head node via methods
		int head = pop();
		push(head);
		return head;
	}
	
	
	

}
