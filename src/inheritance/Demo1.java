package inheritance;

public class Demo1 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test3();
		System.out.println(c1.i);
		
	}
}


class A{
	int i;
	public void test1() {
		
	}
}

class Z{
	int j;
	public void test2() {
		
	}
}

class B extends A{
	public void test2() {
		System.out.println(i);
		test1();
	}
}

class C extends A{
	public void test3() {
		
	}
}

class D extends A{
	
}

// extends Keyword
// inheritance is unidirectional - parent -> child , child -> No to parent
// in Java , parent class of all classes is Object class

// Single level inheritance  A -> B
// Multi level inheritance   A -> B -> C
// Heirarchial Inheritance   one parent can have multiple child
// Multiple Inheritance      one child can have multiple parent ?  Java doesnt not support multiple inheritance?
// because ambiguity due to same name method or attribute in multiple parents

