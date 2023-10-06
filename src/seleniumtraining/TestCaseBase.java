package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseBase {
	static WebDriver driver;
	public static void beforeEverytestCase() {
		BrowserUtil.setDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	public static void afterEveryTestCase() {
		driver.close();
	}
}
