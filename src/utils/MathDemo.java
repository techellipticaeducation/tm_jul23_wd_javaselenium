package utils;

public class MathDemo {
public static void main(String[] args) {
	// static method
//	double db = Math.pow(9, 0.5); // 10 power 2
//	System.out.println(db);
//	
//	int k = -10;
//	int m  = Math.abs(k);
//	System.out.println(m);
	
	
//	range =  100 to 500
	
	// range = 500-100 = 400
	// 6 char random string
	// 
	String rn = "abcdefghijklmnopqrstuvwxyz";
	
	int startRange = 1;
	int endRange = rn.length();
	for(int i = 1 ; i <= 6; i++) {	
	    double random1 = Math.random(); // 0 to 1
	     int n = startRange + (int)(random1*(endRange-startRange));
		System.out.print(rn.charAt(n));
	}
	
	
	
// 	100 to 500 , // 2+100, 300+100, 220+100, 110+100, 70+100
	             // 102, 400, 320, 210, 170
	
	
}

public static String getRandomName(int numOfChar) {
	String rn = "abcdefghijklmnopqrstuvwxyz";
	
	int startRange = 1;
	int endRange = rn.length();
	String randomName = "";
	for(int i = 1 ; i <= numOfChar; i++) {	
	    double random1 = Math.random(); // 0 to 1
	     int n = startRange + (int)(random1*(endRange-startRange));
	     randomName = randomName + rn.charAt(n);
	}
	return randomName;
}


}
