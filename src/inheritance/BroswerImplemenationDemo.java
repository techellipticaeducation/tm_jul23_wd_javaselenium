package inheritance;

public class BroswerImplemenationDemo {
	public static void main(String[] args) {
		
		Browser browser = new Chrome();
		browser.opensite();
		browser.click();		
	}
}

// abstract class = partial abstraction (can contain abstract and non-abstract method)
// anything which is abstract , we cannot create object for that (HAS-A)- Not allowed
// abstract class contains abstract method , and abstract method never have body
// You can inherit abstract class, but you cannot create object for abstract class

// can we use final (IS-A relation not allowed) and abstract together (HAS-A)- Not allowed ?
// we cannot use abstract and final together 

// interface - full abstraction
// implements
// by default , all method of interface is abstract internally
// with interface, i can provide multiple interfaces with single class

// in class it is not possible because of multiple inheritance
// variable in interface


interface Browser{
	
//	public static final  
	
	int i = 10;
	
	public void opensite();
	public void  click();
}

interface FastBrowser{
	public void opensite();
}

class Chrome implements Browser, FastBrowser{

	public void opensite() {
		System.out.println(Browser.i);
		System.out.println(" Chromeopensite");
	}

	public void  click() {
		System.out.println("Chrome click");
	}
	
}

class Mozilla implements Browser{
	public void opensite() {
		System.out.println(" mozilla opensite");
	}

	public void  click() {
		System.out.println("Mozilla click");
	}
	
}


