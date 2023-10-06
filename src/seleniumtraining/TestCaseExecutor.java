package seleniumtraining;

public class TestCaseExecutor {
	public static void main(String[] args) {
		NegativeLoginTestCase.verify_password_is_required_when_user_enter_no_password();
		NegativeLoginTestCase.verify_password_is_required_when_user_enter_no_username();
		NegativeLoginTestCase.verify_password_is_required_when_user_enter_no_username_and_password();
		NegativeLoginTestCase.verify_password_is_required_when_user_enter_invalid_username_and_password();
		
	}
}
