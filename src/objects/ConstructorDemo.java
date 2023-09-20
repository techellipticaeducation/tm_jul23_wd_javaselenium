package objects;

public class ConstructorDemo {
	// Every class has a default constructor 
//	until we are not creating any explicit constructor

	// How to create explicit constructor
	// it is like method but 
	// name must be same as class name
	// no return type
	// constructor we use to initiate instance variables
	
	// importance of this keyword - this represent instance, object
	// static = classname.variable
	// instance = this.instancevariable
	
	// method -> method
	// constuctor -> method 
	// method -> constructor(creating object of that class)
	// constructor -> constructor (using this keyword)
	
	
	String name;
	int age;
	
	ConstructorDemo(){
		this("defaultname",10);
		System.out.println("");
	}
	
	ConstructorDemo(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	ConstructorDemo(String name){
		this.name = name;
	}
	
	
	public void test1() {
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("i am main method");
//		ConstructorDemo demo1 = new ConstructorDemo("Vaibhav",34);
//		System.out.println(demo1.name);
//		System.out.println(demo1.age);
//		
		ConstructorDemo demo2 = new ConstructorDemo();
		
//		demo2.name = "Altesh";
//		demo2.age = 20;
		System.out.println(demo2.name);
		System.out.println(demo2.age);
//		
//		
//		ConstructorDemo demo3 = new ConstructorDemo("Abhijit");
//		System.out.println(demo3.name);
//		System.out.println(demo3.age);
	}
	
	
}
