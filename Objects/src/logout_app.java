import org.openqa.selenium.WebDriver;

import pageobjects.login;

public class logout_app {

	public static void logout(WebDriver driver) {
		
		login.button_logout(driver).click();
	}
}
