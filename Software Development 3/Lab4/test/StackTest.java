import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	Stack st;
	@Before
	public void setup()
	{
		st = new Stack();
	}
	
	/*
	 * Part 3: implement these methods (see your solution to the test your wrote in lab 2)
	 */
	@Test
	public void testPush() {
		st.push(3);
		assertEquals(3, st.top());
	}

	@Test
	public void testPop() {
		st.push(4);
		assertEquals(4, st.pop());
		st.pop();
		assertEquals(-1, st.pop());
	}

	@Test
	public void testTop() {
		st.push(5);
		st.push(6);
		st.push(7);
		st.pop();
		assertEquals(6, st.top());
	}

}
