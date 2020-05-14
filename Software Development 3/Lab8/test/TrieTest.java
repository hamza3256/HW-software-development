import static org.junit.Assert.*;

import org.junit.Test;

public class TrieTest {

	/*
	 * Part 1: complete
	 */
	
	private Trie t = new Trie();
		
	@Test
	public void countAllWordsTest() {
		// Empty trie
		assertEquals(0, t.countAllWords());
		
		// Basic insertions
		t.insertString("Hello");
		t.insertString("World");
		assertEquals(2, t.countAllWords());
		
		// Prefix words
		t.insertString("ball");
		t.insertString("balloon");
		assertEquals(4, t.countAllWords());
	}
}
	
