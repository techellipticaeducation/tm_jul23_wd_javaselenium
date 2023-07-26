package training;

public class TernaryDemo {
	public static void main(String[] args) {
		// ternary operator
		
		int age = 21;
		
//		String ageGroup = "";
//		if(age < 18) {
//			ageGroup = "Child";
//		}else {
//			ageGroup = "Adult";
//		}
		
		String ageGroup =   age < 18 ? "Child"  : "Adult" ;
		System.out.println(ageGroup);
		
		
	}
}
