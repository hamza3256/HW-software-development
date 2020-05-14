// exception used for Q5
class CalculateException extends RuntimeException{    
	public CalculateException(String err) {
		super(err);
	}
}

public class Lab2 {

	// Part 2
	public static void reverse(String[] arr){ 
		Stack stack = new Stack();
		for(int i = 0; i < arr.length; i++) {           
	        stack.push(arr[i]);
	    }
	    for(int i = 0; i <arr.length; i++) {
	        arr[i] = (String) stack.pop();    
	    }
	} 

	/*
	 *  Methods for Part 3
	 */
	public static int calculate(String [] cmds){
		Stack pstack = new Stack(100);
		reverse(cmds);
		for (String numOrOp: cmds) {
			if (isNumber(numOrOp)) {
				pstack.push(numOrOp);
			} else {
				String s1 = (String) pstack.pop();
				String s2 = (String) pstack.pop();
				int res = applyOp(s1, numOrOp, s2);
				pstack.push((Integer.toString(res)));
			}
		}
		return Integer.parseInt((String)pstack.pop());
	}	

	public static int convert(String s) throws NumberFormatException{
		return Integer.parseInt(s);
	}

	public static boolean isNumber(String s){
		if (s.matches("\\+|\\-|\\/|\\*")) {
			return false;
		} else {
			return true;
		}
	}

	// apply the operator after converting the numbers
	public static int applyOp(String fst,String op,String snd){
		int x = convert(fst);
		int y = convert(snd);
		int result = 0;
		switch (op) {
			case "+":
				result = x+y;
				break;
			case "-":
				result = x-y;
				break;
			case "/":
				result = x/y;
				break;
			case "*":
				result = x*y;
				break;
		}
		return result;
	}



}
