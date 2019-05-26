package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drive {
	
	public static WebDriver driver;
	
	public static WebDriver drive1() {
		
		System.setProperty("webdriver.driver.chrom", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	

}
