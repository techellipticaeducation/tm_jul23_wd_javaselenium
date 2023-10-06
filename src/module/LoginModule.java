package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModule {
	
	
	public static void login(WebDriver driver, String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
	
	public static void validateErrorMsg(WebDriver driver,String expectedErrorMsg) {
		String errorText = driver.findElement(By.className("error-message-container")).getText();
		if(errorText.contains(expectedErrorMsg)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
