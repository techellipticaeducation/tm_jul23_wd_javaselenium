package inheritance;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		PCar m1 = new CAudi();
		m1.speed();
	//	m1.brakes();
	// Runtime Polymorphism - runtime
	}
	
	
}



class PCar{
	public void speed() {
		System.out.println("100");
	}
}



class CAudi extends PCar{
	public void speed() {
		System.out.println("300");
	}
	
	public void brakes() {
		System.out.println("Audi brakes");
	}
}

class Maruti extends PCar{
	public void speed() {
		System.out.println("60");
	}
	
	public void gears() {
		System.out.println("Maruti Gears");
	}
	
}

