package inheritance;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Audi c1 = new Audi();
		c1.maxSpeed();
	}
}
// Bank -> parent , HDFC = child
class Bank{
	
}
class HDFC extends Bank{
	
}


class Car{
	public void maxSpeed() {		
		System.out.println("50");
	}
}


class Audi extends Car{
//	public void maxSpeed() {
//		System.out.println("200");
//	}
}


// Method Overriding
// When Parent and child both are having same signature method. then child method override parent method
// Rule for overriding
// child method cannot reduce visibility of parent method  Access Modifier , public > protected > default 
// return type
// if we are returning objects then we cannot return parent class of return object
// final method cannot override
// private method don't override (with in class)
