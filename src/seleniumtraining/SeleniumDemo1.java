package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		
		// Mozilla - webdriver.gecko.driver
		// Edge -    webdriver.edge.driver
		// Chrome driver exec configuration
		BrowserUtil.setDriver();
		
		// object for chrome
		WebDriver driver = new ChromeDriver();	// session
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		// any new session open in selenium. No cookies 
		
		
		// close the browser 
		driver.close(); // active tab/ active handle
		driver.quit();  // close entire session
		
		
		
		
		
		
	}
	
}
