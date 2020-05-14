import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q4 {

	/*
	 * Part 4: complete method
	 */
	public static void sort(int[] arr){
		PriorityQueue pq = new PriorityQueue(arr.length);
		for (int i : arr) {
			pq.insert(i);
		}
		int i = 0;
		while (!pq.isEmpty()) {
			arr[i] = pq.removeMin();
			i++;
		}
	}
	
	public static void main(String[] args){
		int[] arr = {53,3,5,2,4,67};
		Q4.sort(arr);
		// should be printed in order
		System.out.println(arr[0]);
		System.out.println(arr[1]);	
		System.out.println(arr[2]);
		System.out.println(arr[3]);	
		System.out.println(arr[4]);	
		System.out.println(arr[5]);	
	}
	
}
