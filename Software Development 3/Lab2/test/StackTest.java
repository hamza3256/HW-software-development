import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StackTest {

	Stack st;
	@Before
	public void setup()
	{
		st = new Stack(2);
	}
	
	/*
	 * Part1: complete the following test methods as specified. 
	 * 
	 * Note that you will need to add new methods in order to test that exceptions 
	 * are thrown for the special cases
	 */
	
	@Test
	public void testPush() {
		Object o1 = new Object();
		Object o2 = new Object();
		st.push(o1);
		assertEquals(o1,st.top());
		st.push(o2);
		assertEquals(2,st.size());
		assertEquals(o2,st.top());
	}
	
	@Test
	public void testPop() {
		st.push(new Object());
		st.pop();
		assertEquals(0,st.size());
	}
	
	@Test(expected=StackException.class)
	public void testPushToFullStack() throws StackException {
		st.push(new Object());
		st.push(new Object());
		st.push(new Object()); // fail here as max = 2
	}
	
	@Test(expected=StackException.class)
	public void testPopFromEmptyStack() throws StackException {
		st.pop();
	}

}
