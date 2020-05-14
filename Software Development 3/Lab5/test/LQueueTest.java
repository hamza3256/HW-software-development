import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}
	
	/*
	 * 2: complete the following test methods as specified. 
	 */
	
	@Test
	public void testIsEmpty() {
		assertEquals(true,q.isEmpty());
	}
	
	@Test
	public void testIsEmptyFalse() {
		q.enqueue(new Object());
		assertEquals(false,q.isEmpty());
	}

	@Test
	public void testSize() {
		q.enqueue(new Object());
		q.enqueue(new Object());
		assertEquals(2,q.size());
	}

	@Test
	public void testEnqueue() {
		Object x = new Object();
		Object y = new Object();
		q.enqueue(x);
		assertEquals(x,q.front());
		q.enqueue(y);
		assertEquals(x,q.front());
	}
	
	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {  
		q.dequeue();
	}
	
	@Test
	public void testDequeue() {
		Object o = new Object();
		q.enqueue(o);
		assertEquals(o,q.dequeue());
	}




	



}
