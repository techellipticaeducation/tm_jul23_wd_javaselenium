package training;

public class StringDemo2 {
public static void main(String[] args) {
	String t1 = "Pune"; // 1
	String t2 = "Pune"; // 1
    String t3 = new String("Pune"); // 2 (pointingobjectt3, pune)
    String t4 = new String("Pune"); // 3 (pointingobjectt3, pointingobjectt4,  pune)

//    == operator  (it will always check first ref)
    System.out.println(t1 == t2);// true
    System.out.println(t2 == t3);// false
    System.out.println(t3 == t4);// false
    
    t3 = t3.intern(); // interning - process
    System.out.println(t2 == t3);// true
    
    // String value , .equals
    System.out.println("=========");
    System.out.println(t1 == t4); // false
    System.out.println(t1.equals(t4)); // value
    
    // String methods
    // 2 questions
}
}
