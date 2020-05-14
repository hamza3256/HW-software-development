public class LQueue {
	
	private class Node{
		Object element;
		Node next;
		
		public Node(Object e, Node n){
			element = e;
			next = n;
		}
		
		public Node(Object e){
			element = e;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LQueue(){
		head = null;
		tail = null;	
	}
	
	/*
	 * Part 3: complete the following methods
	 */
	
	// Part 3: complete	
	public boolean isEmpty(){
		return head == null;
	}
	
	// Part 3: complete
	public int size(){
		return size; 
	}
	
	// Part 3: complete
	public void enqueue(Object o){
		Node prevTail = tail;
		tail = new Node(o);
		if (isEmpty()) {
			head = tail;
		} else {
			prevTail.next = tail;
		}
		size++;
	}

	// Part 3: complete	
	public Object dequeue() throws QueueException{
		if (isEmpty()) throw new QueueException("Empty Queue");
		Object o = head.element;
		head = head.next;
		size--;
		if (isEmpty()) tail = null; // Avoid loitering
		return o;
	}
	
	// Part 3: complete
	public Object front() throws QueueException{
		if (isEmpty()) throw new QueueException("Empty Queue");
		return head.element;
	}
	
}
