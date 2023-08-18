package objects;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		System.out.println("");
		Calculator.sum(10, 20);
	}
}



class Calculator{
	// parameters data type should be different or 
	// number of param should be different
	// method overloading - Method name is same but number of param, or type of param - 80%
	// compile time polymorphism
	// return type not depends

	static int sum(int i , int j){
		int sumValue = i+j;
		return sumValue;
	}

	static float sum(float i , float j){
		float sumValue = i+j;
		return sumValue;
	}

	static int sum(int i , int j, int k){
		int sumValue = i+j+k;
		return sumValue;
	}



}