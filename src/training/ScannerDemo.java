package training;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	// taking input from console
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your number1 : ");
	int i = scan.nextInt();
	System.out.println("Enter your number2 : ");
	int j = scan.nextInt();
	
	System.out.println("sum is : " + (i+j));
	
}
}
