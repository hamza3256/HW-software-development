public class Lab3 {

	// Part 1: complete
	public static int sum(int n){
		if (n==0) 
		return 0;
		else return n + sum(n-1);
	}

	// Part 1 complete
	public static int multiply(int m, int n){
		if (m==0 || n==0) {
			return 0;
		}else
			return n + multiply(n, m-1);
	}
	
	// Part 1: complete
	public static int Fibonacci(int n){
		if (n==0) {
	        return 0;
	    } 
		if (n<=2) {
	    	return 1;
	    }
	    int f =Fibonacci(n-1) + Fibonacci(n-2);
	    return f;
	}


}