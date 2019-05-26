package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe1 {

	
	public static WebDriver driver;
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(3000L);
				
	}
	
	public  static int findFrameNumber(WebDriver driver,By by) {
		
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		
		for (i=0;i<framecount;i++) {
			
			driver.switchTo().frame(i);
			int count= driver.findElements(by).size();
			
			if (count>0) {
				
				break;
			}
			
			else
			{
				System.out.println("continue looping");
				
			}
			
					}
		
		driver.switchTo().defaultContent();
		return i;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		 
		iframe1 frobj=new iframe1();
		frobj.test1();
		int fr1=iframe1.findFrameNumber(driver,By.xpath("//*[@id=\"draggable\"]/p"));
		
		driver.switchTo().frame(fr1);
		
		Actions a =new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		a.dragAndDrop(source, target).build().perform();
	}
	
	
}

