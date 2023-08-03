package objects;

public class ChatterBox {
	public static void main(String[] args) {
		
		Human h1 = new Human(); // object creation	
		h1.name = "pranaja";
		h1.age = 25;
		h1.height= 160;
		h1.weight = 45.7f;
		
		Human h2 = new Human();
		h2.name = "Vaibhav";
		h2.age = 30;
		h2.height= 170;
		h2.weight = 78.7f;
		
		h1.speak("Hello, Good morning!");	
		h2.speak("Hello, I am fine.");
		h1.birthday();
	}
}
