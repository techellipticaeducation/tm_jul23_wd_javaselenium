package training;

public class ReverseNumber {
public static void main(String[] args) {
	int i = 1345;
	// 5431
	
	int reverseNumber = 0;
	
//	int reminder = i % 10 ;   // 5
//	reverseNumber =  (reverseNumber*10)+reminder; //   5
//	i = i / 10 ;  // i = 134
//	
//	reminder = i % 10 ;   // 4
//	reverseNumber =  (reverseNumber*10)+reminder; //  54 
//	i = i /10 ;  // 134/10 = 13
//	
//	reminder = i % 10 ; // 3
//	reverseNumber =  (reverseNumber*10)+reminder;  // 543
//	i = i /10 ; // 1
//	
//	reminder = i % 10 ; // 1
//	reverseNumber =  (reverseNumber*10)+reminder; // 5431
//	i = i / 10 ; // 0
	
	while(i != 0) {
		int reminder = i % 10 ;   // 5
		reverseNumber =  (reverseNumber*10)+reminder; //   5
		i = i / 10 ;  // i = 134
	}
	System.out.println(reverseNumber);
	
}
}
