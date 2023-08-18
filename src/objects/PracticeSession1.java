package objects;

public class PracticeSession1 {
	// public - access from anywhere
	// static - no need to create object / heap memory
	// void - no return type
	// main 
	// command line argument
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(Student.school);
	}
}


class Student{

	int name;
	static String school;

	public void start() {
		String clgStart = "";
	}

}