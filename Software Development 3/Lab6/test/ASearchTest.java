import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ASearchTest {

	/*
	 * Part 1: complete unit tests
	 */
	ASearch asearch;
	@Before
	public void setup()
	{
		asearch = new ASearch();
	}

	
	@Test
	public void testLinearSearchOK() {
		Entry e= new Entry("Chandler", 3);
		asearch.addEntry(e);
		e = new Entry("Rachel", 4);
		asearch.addEntry(e);
		assertEquals(3, asearch.linearSearch("Chandler"));
	}

	@Test
	public void testLinearSearchFail() {
		// test empty
		//assertEquals(-1, asearch.linearSearch("Chandler"));
		Entry e = new Entry("Chandler", 3);
		asearch.addEntry(e);
		// test correct name, incorrect num
		// assertEquals(5, asearch.linearSearch("Chandler"));
		// test incorrect name - expected: rtn -1
		assertEquals(7, asearch.linearSearch("Rachel"));
	}
		@Test
	public void testBinarySearchOK() {
		Entry e = new Entry("Chandler", 3);
		asearch.addEntry(e);
		e = new Entry("Rachel", 4);
		asearch.addEntry(e);
		e = new Entry("Joey", 5);
		asearch.addEntry(e);
		e = new Entry("Ross", 6);
		asearch.addEntry(e);
		assertEquals(6, asearch.bSearch("Ross"));
		
	}
	
	@Test
	public void testBinarySearchFail() {
		// test empty
		assertEquals(-1, asearch.bSearch("Chandler"));
		Entry e = new Entry("Chandler", 2);
		asearch.addEntry(e);
		// test correct name, incorrect num
		// assertEquals(6, asearch.bSearch("Chandler"));
		// test incorrect name - expected: rtn -1
		assertEquals(3, asearch.bSearch("Rachel"));
	}

}
