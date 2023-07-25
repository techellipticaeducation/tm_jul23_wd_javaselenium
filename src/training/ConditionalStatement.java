package training;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		// 	Data-type
		//  operator
		//  
		//	if else 
		
		// must have a condition 
		// boolean
		// 10 - even, 11 - odd, 15 - odd 
		
		// Top Down approach - thought process
		// Bottom up approach - implementation process
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int i = scan.nextInt();
		// even and odd number
		if((i%2) == 0) {
			System.out.println("I am in even number");
		}else {
			System.out.println("I am in odd number");
		}
		
	}
}
