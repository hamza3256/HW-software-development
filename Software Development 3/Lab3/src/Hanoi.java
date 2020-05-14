

public class Hanoi {

	/*
	 * Part4: Tower of Hanoi
	 */
	public static void moveOneRing(String from,String to){
		System.out.println("Ring moved from " + from + " to " + to);
	}	
	
	// To do: complete the following method
	public static void movePile(int n,String from,String to,String via){
		if (n != 0) {
			//moves a to c via b
			movePile(n-1, from, via, to);
			//moves a to b
			moveOneRing(from, to);
			//moves c to b via a
			movePile(n-1, via, to, from);
		}
	}	
	
	public static void main(String[] args){
		movePile(3,"A","B","C");
	}

}
