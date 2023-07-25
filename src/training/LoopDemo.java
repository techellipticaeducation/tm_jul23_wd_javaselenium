package training;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String[] args) {
		// operation again and again
		
		// while - when don't know how many times we are going to run
		// do.while - execute atleast once
		// for - when you know about iteration count
		
		
		// Scenario , 1 to 100 values print
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your range :");
		int range = scan.nextInt();
		
		
//		int i = 1;
//		while(i <= range) {
//			System.out.println(i);
//			i++;
//		}
		
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= range);
//		
//		System.out.println("Post while");
		
		// initialization 
		// conditioncheck
		// increment/decrement
		
		for( int j = 1 ; j <= range ; j++) {
			System.out.println(j);
		}
		
	}
}
