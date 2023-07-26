package training;

public class ContinueDemo {
public static void main(String[] args) {
	int i  = 1;
	
	while( i < 10) {
		System.out.println("Before continue");
		if(i == 5) {
			continue;
		}
		System.out.println(i);
		i++;
	}
	
}
}
