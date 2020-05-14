import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	
	/*
	 * Part 1: implement these methods
	 */
	@Test
	public void testSizeEmpty() {
		assertEquals(0, l.size());
	}

	@Test
	public void testSizeAny() {
		l.addAtTail(15);
		l.addAtHead(24);
		l.addAtHead(22);
		assertEquals(3, l.size());
	}
		

	@Test
	public void testTotalEmpty() {
		assertEquals(0, l.total());
	}

	@Test
	public void testTotalMany() {
		l.addAtHead(3);
		l.addAtHead(9);
		l.addAtHead(11);
		// total should be 23
		assertEquals(23, l.total());
	}
	
}
