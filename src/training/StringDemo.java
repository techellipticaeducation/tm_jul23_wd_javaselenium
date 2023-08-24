package training;

public class StringDemo {
public static void main(String[] args) {
	// array of characters
	String s1 = "Java"; // 1 (Java)
	String s2 = "Java"; // 1 (Java)
	s1 = "C#"; // 2 (Java, C#)
	s2 = "C#"; // 
	
	String s3 = "Java"; // Literal way (object directly in pool)
	
	String s4 = new String("Python");
	
	
	
	//{ 'j', 'a', 'v', 'a'}
	System.out.println(s3.charAt(2));
	
	
	
	System.out.println(s1);
	System.out.println(s2);
	
	
	Student st1  = new Student();
	st1.country = "India";
	st1.age = 10;
	Student st2  = new Student();
	st2.country = "Pakistan";
	st2.age = 30;
	System.out.println(st1.country); 
	System.out.println(st1.age);
	
	// Altesh - Human , 150 , Bharat
	// Aishwarya - Human , 145, Bharat
	
} 

}
