public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	/*
	 * Part 2: complete implementation
	 */
	public int linearSearch(String name){
		if (catalogue[0] == null) {
			return -1;
		}
		for (int i=0; i<catalogue.length; i++) {
			// break out if null started to loop on null elements
			if (catalogue[i] == null) { break; }
			if (catalogue[i].getName().equals(name)) {
				return catalogue[i].getNumber();
			}
		}
		return -1;
	}

	/*
	 * Part 4: complete implementation
	 */
	public int binarySearch(int first,int last,String name){
		if (catalogue[0] == null) {
			return -1;
		}
		while (first<=last) {
			// find mid point
			int mid = first + (last-first)/2;
			// break out if null started to loop on null elements
			if (catalogue[mid] == null) { break; }
			if (catalogue[mid].getName().equals(name)) {
				return catalogue[mid].getNumber();
			// compare lexicographically [cat name before name rtns neg]
			} else if (catalogue[mid].getName().compareTo(name) < 0) {
				first = mid+1;
			} else {
				last = mid-1;
			}
		}
		return -1;
	}
	

	// helper method
	public int bSearch(String name){
		return binarySearch(0,current,name);
	}
	
	
}
