package training;

public class MethodOverloadingDemo {
	public static void main(String...args) {
		int ret = CalculatorProject.add(10, 20);
		System.out.println(ret);
		ret = CalculatorProject.add(10, 20,30);
		System.out.println(ret);
		ret = CalculatorProject.add(10, 20,3,0,5,22,9,23,223);
		System.out.println(ret);
		ret = CalculatorProject.add(30);
		System.out.println(ret);
	}
}


class CalculatorProject{
	public static int add(int...i) {  //{10,20,30}
		int sum = 0;
		for(int j = 0 ; j < i.length; j++) {
			sum = sum + i[j];
		}
		return sum;
	}

	// Method Overloading - having same method name, but different number of param or different type of param
	// return type will not make any impact
	// Compile time polymorphism
	//  method name is same but mathod
	//  varargs = var (various) + args (arguments) = 

	//  2 rules
	// 1 - in one param list , only 1 varargs is possisble
	// 2 - varargs must be the last param in param list



}
