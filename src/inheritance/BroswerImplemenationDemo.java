package inheritance;

public class BroswerImplemenationDemo {
	public static void main(String[] args) {
		
		Browser browser = new Chrome();
		browser.opensite();
		browser.click();
		
		
//		Chrome ch1 = new Chrome();
//		ch1.openchromesite();
//		ch1.clickchrome();
//
//		
//		Mozilla ch2 = new Mozilla();
//		ch2.openmozillasite();
//		ch2.clickmoziila();
		
	}
}

class Browser{
	public void opensite() {
		System.out.println("opensite");
	}

	public void  click() {
		System.out.println("click");
	}
}



class Chrome extends Browser{

	public void opensite() {
		System.out.println(" Chromeopensite");
	}

	public void  click() {
		System.out.println("Chrome click");
	}
	
}

class Mozilla extends Browser{
	public void opensite() {
		System.out.println(" mozilla opensite");
	}

	public void  click() {
		System.out.println("Mozilla click");
	}
	
}


