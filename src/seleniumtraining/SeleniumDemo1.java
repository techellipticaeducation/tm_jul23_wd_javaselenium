package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.get("https://www.saucedemo.com/");
		
		// any new session open in selenium. No cookies 
//		open google.com
		
//		entering a search term
		// Locate 
		// 8 strategies 
		// id, name
		
//		name = q
		
		By textbox = By.id("user-name"); // Ref 
		WebElement textBoxElem = driver.findElement(textbox); // find element using driver
		textBoxElem.sendKeys("standard_user");  // action to our element
		
		//NoSuchElementException
		
//		and pressing enter key

		// close the browser 
		driver.close(); // active tab/ active handle
		driver.quit();  // close entire session
		
		
		
		
		
		
	}
	
}
