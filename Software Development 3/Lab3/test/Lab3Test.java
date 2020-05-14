import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lab3Test {
	private int n; 
	private int m;
	
	@Test
	public void testsum() {
		n=3;
		assertEquals(6, Lab3.sum(n));
	}
	
	@Test
	public void testmultiply() {
		n=4;
		m=5;
		assertEquals(20,Lab3.multiply(m, n));
	}
	
	@Test
	public void testFibonacci() {
		n=9;
		assertEquals(34, Lab3.Fibonacci(n));
	}

}
