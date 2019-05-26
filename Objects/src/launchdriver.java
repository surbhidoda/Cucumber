import org.openqa.selenium.WebDriver;

import pageobjects.drive;
import pageobjects.signin;

public class launchdriver {
	
	
	public static WebDriver launchapp(WebDriver driver) throws InterruptedException {
		
		driver=drive.drive1();
		
		driver.get("https://www.thewarehouse.co.nz");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		signin.sign(driver).click();
		Thread.sleep(3000L);
		return driver;
	}

}
