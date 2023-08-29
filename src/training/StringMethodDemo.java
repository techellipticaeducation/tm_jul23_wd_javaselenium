package training;

public class StringMethodDemo {
public static void main(String[] args) {
	// second number per kaun sa character hai
	// String - array of character
	
	String st1 = "ukdsjkj sdkjhsd  dsjkh ad aksdjh sdjfk asdjkhdsjkfhsdkjfh ";
	// contains - check , where provided string is avaibale in string or not
	//System.out.println(st1.contains("python"));
	
	st1 = st1.toLowerCase();
//	this is java session
	// length = 7
	st1 = st1.replaceAll(" ", "");
	int stringsize = st1.length(); // 7
//	System.out.println(stringsize);
	
	
//	char ch =  st1.charAt(2);
//	System.out.println(ch);
	
	// print every char in this string	
	
	//  how many time a is present in pranaja = 3
	// how to know duplicate char in string ?
	
	//  which char are duplicate
	char c = 'j';
	
	String duplicateChar = "";
	for(int i = 0 ; i < stringsize ; i++) {
		int count = 0;
		for(int j = 0 ; j < stringsize ; j++) {
			if(st1.charAt(j) == st1.charAt(i)) {
				count++;
			}
		}
		if(count > 1) {
			if(duplicateChar.contains(String.valueOf(st1.charAt(i)))) {
				
			}else {
				System.out.println(st1.charAt(i)  + " -> " + count);
				duplicateChar = duplicateChar + String.valueOf(st1.charAt(i)); // duplicateChar = "isa";
				//System.out.println("========" + duplicateChar);
			}
		}
	}
	
	//System.out.println(c + " present in " +st1 + " = " + count);
	
}
}
