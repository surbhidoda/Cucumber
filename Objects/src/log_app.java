import org.openqa.selenium.WebDriver;

import pageobjects.login;

public class log_app {
	
	public static void logapp(WebDriver driver) {
		
		login.email(driver).sendKeys("surbhi.doda@gmail.com");
		login.pass(driver).sendKeys("Success@2019");
		login.button_login(driver).click();
	}

}


