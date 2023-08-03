package training;

import java.util.Scanner;

public class SumOfDigitDemo {
	public static void main(String[] args) {

		// 134 = 1+3+4 = 8
		while(true) {
			int sum = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your number");
			int number = scan.nextInt() ; // 9
			while(number != 0) {
				sum = sum + number%10 ;
				number =number / 10 ;
			}
			System.out.println("Sum is " + sum);
			if(sum == 0) {
				break;
			}
		}

		// number = 135
		//		sum = sum + number%10 ; // 135 % 10 =  5 , sum = 5
		//		number =number / 10 ;   // 135 / 10 = 13
		//		
		//		// number = 13
		//		sum = sum + number%10 ; // sum = 8
		//		number =number /10 ;    // number = 1
		//		
		//		// number = 1
		//		sum = sum + number%10 ; // sum = 9
		//		number =number /10 ;    // number = 0




	}
}
