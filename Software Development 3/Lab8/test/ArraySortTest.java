import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArraySortTest {

	
	@Test
	public void testIsSortedEmpty() {
		int[] arr = {};
		assertTrue(ArraySort.isSorted(arr));
	}
	
	@Test
	public void testIsSortedTrue() {
		int[] arr = {1,2,3,67,78};
		assertTrue(ArraySort.isSorted(arr));
	}
	
	@Test
	public void testIsSortedFalse() {
		int[] arr = {1,2,3,7,5};
		assertFalse(ArraySort.isSorted(arr));
	}	
	
	@Test
	public void testIsSortedArrayListEmpty() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertTrue(ArraySort.isSorted(arr));
	}
	
	@Test
	public void testIsSortedArrayListTrue() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		assertTrue(ArraySort.isSorted(arr));
	}
	
	@Test
	public void testIsSortedArrayListFalse() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(4);
		assertFalse(ArraySort.isSorted(arr));
	}		
	
	/*
	 * Part 2: complete
	 */
	
	@Test
	public void testBubbleSortEmpty() {
		int[] arr = {};
		assertEquals(0, arr.length);
	}

	@Test
	public void testBubbleSortRandom() {
		int[] arr = {7,3,7,2,6,9,8,1,5};
		ArraySort.bubbleSort(arr);
		assertTrue(ArraySort.isSorted(arr));
	}
	
	@Test
	public void testBubbleSortOrdered() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		assertTrue(ArraySort.isSorted(arr));
	}

	@Test
	public void testQuickSortSorted() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		assertTrue(ArraySort.isSorted(arr));	
	}

	@Test
	public void testQuickSortRandom() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(6);
		arr.add(4);
		arr.add(7);
		arr.add(3);
		arr.add(5);
		ArraySort.quickSort(arr);
		assertTrue(ArraySort.isSorted(arr));	
	}
	
	@Test
	public void testQuickSortEmpty() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		assertTrue(arr.isEmpty());
	}
}
