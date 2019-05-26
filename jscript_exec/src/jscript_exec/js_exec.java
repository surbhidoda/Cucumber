package jscript_exec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_exec {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(3000L);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js=document.getElementById("fromPlaceName");
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String)js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("CHIKKALSANDRA BENGALURU")){
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String)js.executeScript(script);
			System.out.println(text);
		}
		
}
}