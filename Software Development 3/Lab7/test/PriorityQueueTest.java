import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PriorityQueueTest {

	/*
	 * Part 3: complete
	 */
	
	private PriorityQueue pq = new PriorityQueue(10);
	
	@Rule
	public final ExpectedException pqe = ExpectedException.none();
	
	@Test
	public void insertTest() {
		// No elements exception
		pqe.expect(PriorityQueueException.class);
		pq.min();
		
		// SIngle element
		pq.insert(7);
		assertEquals(7, pq.min());
		
		// Correct insertion
		pq.insert(8);
		pq.insert(4);
		pq.insert(5);
		assertEquals(4, pq.min());
		
		// Size
		assertEquals(5, pq.size());
		
		// Max size reached exception
		pq.insert(9);
		pq.insert(6);
		pq.insert(6);
		pq.insert(3); // Smallest element
		pq.insert(7); // Last element before exception
		pq.insert(2);
		pq.insert(1);
		assertEquals(3, pq.min());
	}

	@Test
	public void removeMinTest() {
		// Remove from empty queue
		pqe.expect(PriorityQueueException.class);
		pq.removeMin();
		
		// Min element removed and returned
		pq.insert(16);
		pq.insert(5);
		pq.insert(2);
		pq.insert(7);
		assertEquals(2, pq.removeMin());
		
		// New root created from smallest element
		assertEquals(5, pq.min());
		
		// Size is correct after removal
		assertEquals(3, pq.size());
	}
	
}
