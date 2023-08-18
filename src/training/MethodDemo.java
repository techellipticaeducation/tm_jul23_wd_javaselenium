package training;

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo d1 = new MethodDemo();
		int retValue = d1.add(10, 20); // arguments - method calling, invoke
		//		for(int i = 1; i < 20 ; i++) {
		//			int sqr = d1.square(i);
		//			System.out.println(sqr);
		//		}
		// area = pi * rsquare

		float area =d1.areaOfCircle(10);	
		System.out.println(area);


		SumOfDigitDemo demo1 = new SumOfDigitDemo();
		int sumValue  = demo1.sumOfValue(456);
		System.out.println(sumValue);
	}
	// Method name
	// parameters -> right hand side in paranthesis
	// method body
	// return type 

	// No parameters - non-paramertized method
	// No return type - void method




	float PIValue() {
		return 3.14f;
	}


	float areaOfCircle(float radius) {
		float area = PIValue() * square(radius);
		return area;
	}

	int add(int a1, int a2) {
		int a3  = a1+a2;		
		return a3;
	}


	float square(float i) {
		float sq = i * i;
		return sq;
	}
}
