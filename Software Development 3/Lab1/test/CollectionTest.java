import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CollectionTest {

	Collection c;
	@Before
	public void setup(){
		c = new Collection();
	}
	
	
	@Test
	public void testEmptyMaxAge() {
		assertEquals(-1,c.maxAge());
	}

	@Test
	public void testOneElementMaxAge() {
		c.addPerson("Floyd", "Mayweather", 41);
		assertEquals(41,c.maxAge());
	}
	
	@Test
	public void testThreeElementsMaxAge() {
		c.addPerson("Tyrion", "Lannister", 24);
		c.addPerson("Cersei", "Lannister", 33);
		c.addPerson("Jamie", "Lannister", 31);
		assertEquals(33,c.maxAge());
	}
	
		 
	}
	


