import java.util.ArrayList;
import java.util.Iterator;

public class ArraySort {
	
	// Part 3: complete implementation
	public static void bubbleSort(int[] arr){
		boolean swaps = true;
		while (swaps) {
			swaps = false;
			for (int i=0; i<arr.length-1; i++) {
				if (arr[i+1] < arr[i]) {
					int j = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = j;
					swaps = true;
				}
			}
		}
	}
	
	// Part 5 : complete implementation
	public static void quickSort(ArrayList<Integer> S){
		if (S.size() <= 1) {
			return;
		} else {
			int pivot = S.get(0);
			ArrayList<Integer> L = new ArrayList<Integer>();
			ArrayList<Integer> E = new ArrayList<Integer>();
			ArrayList<Integer> G = new ArrayList<Integer>();
			while (!S.isEmpty()) {
				if (S.get(0) < pivot) {
					L.add(S.remove(0));
				} else if (S.get(0) == pivot) {
					E.add(S.remove(0));
				} else {
					G.add(S.remove(0));
				}
			}
			quickSort(L);
			quickSort(G);
			S.addAll(L);
			S.addAll(E);
			S.addAll(G);
		}
	}
	
	// predicate to check if array is sorted
	public static boolean isSorted(int[] arr){
		for(int i = 0; i < arr.length-1;i++)
			if(arr[i] > arr[i+1])
				return false;
		return true;
	}
	
	// predicate to check if arrayList is sorted
	public static boolean isSorted(ArrayList<Integer> ar){
		Iterator i = ar.iterator();
		int val;
		if(i.hasNext())
			val = (int) i.next();
		else
			return true;
		while(i.hasNext()){
			int nv = (int) i.next();
			if(val > nv)
				return false;
			val = nv;
		}
		return true;
	}
	
	
	/*
	 * Helper printing methods for testing
	 */
	private static void printIntArray(int[] arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}

	private static void printIntArrayList(ArrayList<Integer> arr){
		System.out.print("[ ");
		for(Integer i : arr){
			System.out.print(i + " ");
		}
		System.out.println(" ]");
	}
	

	public static void main(String[] args){
		// testing part1
		int[] arr1 = {5,4,3,2,1};
		bubbleSort(arr1);
		printIntArray(arr1);
		
		// testing part2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(3);
		arr2.add(1);
		arr2.add(6);
		arr2.add(5);
		quickSort(arr2);		
		printIntArrayList(arr2);
		// {5,4,3,5,1};
				
	}
	
}
