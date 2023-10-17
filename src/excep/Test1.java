package excep;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("Devide Value :");
			int i = scan.nextInt();
			System.out.println("Devident Value :");
			int j = scan.nextInt();
			int[]  ath = new int[4];
			try {
				
				ath[5] = 20;
				int k = i/j;
				System.out.println("Answer is " + k);
			}catch(ArithmeticException e1) {
				System.out.println("You are trying enter some invalid data");
			}catch(ArrayIndexOutOfBoundsException hj) {
				System.out.println("some issue in array");
			}catch(Exception e) {
				
			}
			
			//  Parent  
			//  Child 
			// Exception - which can be handled 
			// try catch
			// Error - which cannot handle (heapOutOfmemory)
		}

	}
}
