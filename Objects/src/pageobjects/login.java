package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {

	
	public static WebElement email(WebDriver driver) {
		
		WebElement wb_email=driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset[1]/div[1]/div/input"));
		return wb_email;
	}
	
public static WebElement pass(WebDriver driver) {
		
		WebElement wb_pass=driver.findElement(By.xpath("//*[@id='dwfrm_login_password']"));
		return wb_pass;
	}

public static WebElement button_login(WebDriver driver) {
	
	WebElement wb_login=driver.findElement(By.xpath("//*[@name='dwfrm_login_login']"));
	return wb_login;
}


public static WebElement button_logout(WebDriver driver) {
	
	WebElement wb_logout=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[4]/a/span"));
	return wb_logout;
}
	
}
