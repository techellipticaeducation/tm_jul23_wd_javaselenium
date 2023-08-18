package objects;

public class Human {
	// Characteristic area
	
	String name;
	int age;
	int height;
	float weight;
	
	// how to constant in java
	// static and final 
	static String country = "India";
	
	int k1 = k2;
	static int k2 = 10; 
	
	static final int m = 10;
	
	
	
	// we didnt declear K2 , and we are trying to use it
	
	
	// static variable - class variables, shared variable
	// static variable - memory location never change
	
	// static variable - constant - memory
	// final variable - constant - value
	
	// classname.variable name
	
	// Yes
	// because static variable do not need object
	
	// instance variable - object variable
	
	// Behaviours
	public void speak(String content) {
		System.out.println(name + " - " +content);
	}
	
	public void birthday() {
		age++;
		System.out.println("Happy BirthDay " + name + "! "
				+ "Your age now is " +age);
	}
	
	
}
