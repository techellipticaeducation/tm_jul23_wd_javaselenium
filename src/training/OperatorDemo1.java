package training;

public class OperatorDemo1 {
public static void main(String[] args) {
	// Unary operator - one operand required
	// Increment and decrement operator
	
	// increment operator
	// pre increment - first increase then assign ++i
	// post increment - first assign then increase i++
	
	int i = 10;
	
	int j = ++i + i++ + i++ + i++ + i++;
	
	System.out.println("i : " + i); // 11 
	System.out.println("j : " + j); // 11
	
	
//	!

	boolean bol = true;
	System.out.println(bol);
	System.out.println(!bol);
	
	int m = -10;
	System.out.println(m);
	
	// + add
	// + append
	// + positive
	
}
}
