package com.whouse;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinition {
	
	private static WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	   driver=new ChromeDriver();
	    driver.get("https://www.thewarehouse.co.nz");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[3]/a/span")).click();
	    Thread.sleep(3000L);
	    
	}
	
	@When("^user enters correct username and password$")
	public void user_enters_correct_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset[1]/div[1]/div/input")).click();
		FileInputStream fis=new FileInputStream("C:\\Users\\sdoda\\Documents\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		String username;
		String password;
		
		XSSFCell username1=sheet.getRow(1).getCell(0);
		XSSFCell pass1=sheet.getRow(1).getCell(1);
		username=username1.getStringCellValue();
		password=pass1.getStringCellValue();
		
		
			
		driver.findElement(By.xpath("//*[@id='dwfrm_login']/fieldset[1]/div[1]/div/input")).sendKeys(username);
	
		driver.findElement(By.xpath("//*[@id='dwfrm_login_password']")).sendKeys(password);
		
	    
	}
	
	@Then("^login successful$")
	public void login_successful() throws Throwable {
		driver.findElement(By.xpath("//*[@name='dwfrm_login_login']")).click();
		System.out.println("The login is successfull");
	    
	}
	
	@Given("^User is logged in and searching item$")
	public void user_is_logged_in_and_searching_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"q-search\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"q-search\"]")).sendKeys("Daewoo Microwave 31L 1000W");
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[3]/div/form/fieldset/div[1]/button")).click();
	    
	}
	
	@When("^user clicks add to cart$")
	public void user_clicks_add_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
	    
	}
	
	@Then("^product is added to cart$")
	public void product_is_added_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/div[1]/a/i")).click();
		String val=driver.findElement(By.xpath("//*[@id=\"cart-table\"]/tbody/tr[1]/td[2]/div[1]/h5/a")).getText();
		System.out.println("The product added in cart is     "+val);
	    
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String uname=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[3]/a/span/u")).getText();
		if(uname.equals("Surbhi")) {
			System.out.println("The user    "+uname+"     is already logged in");
		}
	    
	}
	
	@When("^user clicks logout button$")
	public void user_clicks_logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div/div/div/div[4]/ul/li[4]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	@Then("^user is logged out$")
	public void user_is_logged_out() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String loginpagelogo=driver.findElement(By.xpath("//*[@id=\"login-member\"]/div[1]/h2/span")).getText();
		System.out.println(loginpagelogo);
		if(loginpagelogo.equals("ACCOUNT LOG IN")) {
			System.out.println("The user has successfully logged out");
		}
	    
	}


}
