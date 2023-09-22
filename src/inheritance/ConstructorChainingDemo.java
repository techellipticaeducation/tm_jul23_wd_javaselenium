package inheritance;

public class ConstructorChainingDemo {
	public static void main(String[] args) {
		J2 j2= new J2(10);
		//j2.test1();
	}
}

// Constructor - we need to create object
// default constructor - 

// by default, default constructor (non-param constructor going to execute)
// in a constructor you cannot use this and super together

class J0{
	J0(){
		System.out.println("J0 class constructor");
	}
	
	J0(int i){
		System.out.println("J0 class 1 param constructor");
	}
}

class J1 extends J0{
	J1(){
		System.out.println("J1 class constructor");
	}
	
	J1(int i ){
		super(i);
		System.out.println("J1 class 1 param constructor");
	}
	
	public void test1() {

	}
}

class J2 extends J1{

	J2(){
		System.out.println("J2 class constructor");
	}
	
	J2(int i){
		super(10);
		System.out.println("J2 class 1 param constructor");
	}
	public void test2() {

	}
}

