package training;

import java.util.Scanner;

public class SumOfDigitDemo {
	public static void main(String[] args) {

		SumOfDigitDemo s1 = new SumOfDigitDemo();
		// 134 = 1+3+4 = 8
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your number");
			int number = scan.nextInt() ; // 9
			int sum = s1.sumOfValue(number);
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

	public int sumOfValue(int number) {
		int sum = 0;
		while(number != 0) {
			sum = sum + number%10 ;
			number =number / 10 ;
		}
		return sum;
	}


}
