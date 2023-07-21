package training;

public class BitwiseAndLogicalOperator {
	public static void main(String[] args) {
		// AND (Ziddi)
		// true & true = true
		// true & false = false
		// false & true = false
		// false & false = false

		//		int i = 10;
		//		int j = 15;

		//System.out.println( (i>j) & (i>j));
		//                   true & true



		System.out.println( returnFalse() && returnFalse());
		//                   false & false	
		
		// Logical operator = && , ||
		// Bitwise operator = & , | 
		
		// OR (Ziddi)
		// true | true = true
		// true | false = true
		// false | true = true
		// false | false = false
		
	}

	public static boolean returnTrue() {
		System.out.println("executing returnTrue");
		return true;
	}

	public static boolean returnFalse() {
		System.out.println("executing returnFalse");
		return false;
	}


}
