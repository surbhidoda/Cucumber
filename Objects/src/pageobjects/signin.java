package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin {
	//public static WebElement wb_signin=null;
	
	public static WebElement sign(WebDriver driver) {
		
	WebElement wb_signin=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[3]/a/span"));
		
		return wb_signin;
	}

}
