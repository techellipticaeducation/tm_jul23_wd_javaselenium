package training;

public class ConditionalStatementDemo {
	public static void main(String[] args) {
		// input -> int age =

		// age < 18 = child
		// age > 18 & 30 = adult
		// age > 30 & 45 = mature
		// age > 45 =  old

		// output -> age group ?

		int age = 14;
		String ageGroup ="";
		if(age <= 18) {
			ageGroup = "Child";
		}else if(age > 10 && age <= 30) {
			ageGroup = "Adult";
		}else if(age > 30 && age <= 45) {
			ageGroup = "Mature";
		}else {
			ageGroup = "old";
		}
		System.out.println(ageGroup);

	}
}
