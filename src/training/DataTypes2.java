package training;

public class DataTypes2 {
	public static void main(String[] args) {
		
		// default - decimal
		// number - 0  = octal
		// number - 0X  = hexadecimal
		// number - 0b = binary
		
		int i = 0b10;
//		System.out.println(i);

		// with long use l in the last
		long k = 1231_2312_312l;
		System.out.println(k);
		
		// Floating type values (precision)
		// float
		// double
		
		float fl = 12.56f; // 4 byte
		System.out.println(fl);
		
		// 8 byte
		double db = 13.45d; // Literal way of value assignment
		System.out.println(db);
		
		int i1 = 10;
		int j1 = 3;
		
		double db1 = (double)i1/(double)j1;
		System.out.println(db1);
		
		
		// Boolean is only datatype whose values itself keyword
		// 2 values allowed , true and false
		// 
		
		boolean b1 = false; // 1 bit  
		
		// character
		// ascii char (1 byte) and uni-code character system (2 bytes)
		
//		ASCII
	
//		a ,  97 
		// one character only you can provide 
		// single quotes
		// all character are int
		// all int are not character
		
		char ch = 'h';
		System.out.println(ch);
		
		int j = (int)ch;
		System.out.println(j);
		
		int m1 = 120;
		char iChar = (char)m1;
		System.out.println(iChar);
		
		char altesh = '\u3055';
		System.out.println(altesh);
		
	}
}
