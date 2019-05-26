package Practest2;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {

	public static WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("https://www.thewarehouse.co.nz");
		  Thread.sleep(1000L);
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[3]/a/span")).click();
	    Thread.sleep(3000L);
	}

	@When("^user enters multiple username and password$")
	public void user_enters_multiple_username_and_password(DataTable Credentials) throws Throwable {
		
		for (Map<String,String>data:Credentials.asMaps(String .class, String.class)) {
	    // Write code here that turns the phrase above into concrete actions
driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset[1]/div[1]/div/input")).click();
		
		driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset[1]/div[1]/div/input")).sendKeys(data.get("username"));
	
		driver.findElement(By.xpath("//*[@id='dwfrm_login_password']")).sendKeys(data.get("password"));
		 // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@name='dwfrm_login_login']")).click();
		System.out.println("The login is successfull");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[4]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	}

	@Then("^login is successful$")
	public void login_is_successful() throws Throwable {
	   
	  
	}


}
