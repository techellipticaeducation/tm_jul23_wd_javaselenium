package seleniumtraining;


import module.LoginModule;

public class NegativeLoginTestCase extends TestCaseBase{
	
	public static void verify_password_is_required_when_user_enter_no_password() {
		beforeEverytestCase();
		LoginModule.login(driver,"standard_user","");
		LoginModule.validateErrorMsg(driver,"Password is required");	
		afterEveryTestCase();
	}
	
	public static void verify_password_is_required_when_user_enter_no_username() {
		beforeEverytestCase();
		LoginModule.login(driver,"","secret_sauce");
		LoginModule.validateErrorMsg(driver,"Username is required");
		afterEveryTestCase();
	}
	
	public static void verify_password_is_required_when_user_enter_no_username_and_password() {
		beforeEverytestCase();
		LoginModule.login(driver,"","");
		LoginModule.validateErrorMsg(driver,"Username is required");		
		afterEveryTestCase();
	}
	
	public static void verify_password_is_required_when_user_enter_invalid_username_and_password() {
		beforeEverytestCase();
		LoginModule.login(driver,"test","test");
		LoginModule.validateErrorMsg(driver,"Username and password do not match any user in this service");
		afterEveryTestCase();
	}
}
