import org.openqa.selenium.WebDriver;

public class main_execution {
	
	public static WebDriver driver;
	
	public static void main (String[] args) throws InterruptedException
	{
		
		driver=launchdriver.launchapp(driver);
		log_app.logapp(driver);
		logout_app.logout(driver);
	}

}
