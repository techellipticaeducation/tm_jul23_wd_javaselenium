package training;

import java.util.Scanner;

public class JumpStatementDemo {
	public static void main(String[] args) {
		// if i == 5, then stop this loop
		// break and continue (skip)
//		for(int i = 0 ; i < 10 ; i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("Enter your Number ");
			int i = scan.nextInt();
			sum = sum + i ;
			System.out.println("Sum :"+sum);
			if(sum > 100) {
				continue;
			}	
		}
		
		//System.out.println("Thank you for using calculator");
		
	}
}
