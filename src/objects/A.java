package objects;

public class A {
	
	
	// class load
	
//1	// static variable
//2	// static method

//3	// instance variable
//4	// non-static method
	
	
	int k1 = 10; // instance
	static int k2 = 30; // static
	
	
	// Non - static method
	void test1() {
		// local variable
		int k3 = 10;
		
		System.out.println(k1);
		System.out.println(k2);
	}
	
	/**
	 * this is my documentation comment <BR/>
	 * this method is for demo pupose for my selenium students
	 */
	static void test2() {
		System.out.println("static method");
		System.out.println(k2);
		test3();
		A aobj = new A();
		aobj.test1();
	}
	
	static void test3() {
		test2();
		String st = "adfds";
	}

	// comments in java
	// single line comment
	/*
	 * dsfajshd
	 * asdjfh
	 * asdjha
	 * sdasjdfh
	 * asdjfasd
	 * multiline comment
	 */
	
	// documentational comments
	
	
	
	// instance  variable = k1
	// local variable = k3
	// static variable = k2
	
	// how to call k1
	
	// static varibale / method -> classname.methodname/varibale 
	// non-static/instance => we need object for that
	
	// static method only allow static variables 
	// non-static method allow both variables
}

class B{
	public static void main(String[] args) {
		// k1
		A a1 = new A();
		System.out.println(a1.k1);
	
		
		System.out.println(A.k2);
		A.test2();
		
		
		
		
		a1.test1();
		
	}
}
