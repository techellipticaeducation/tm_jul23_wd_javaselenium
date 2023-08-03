package objects;

public class Human {
	// Characteristic area
	String name;
	int age;
	int height;
	float weight;
	
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
