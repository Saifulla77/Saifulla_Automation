package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling_23 {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.get("https://www.instagram.com/");
	       Thread.sleep(3000);
	       WebElement AboutLink = driver.findElement(By.xpath("//span[text()=\"About\"]"));
	       WebElement HelpLink = driver.findElement(By.xpath("//span[text()=\"Help\"]"));
	       WebElement APILink = driver.findElement(By.xpath("//span[text()=\"API\"]"));
	       
	       Thread.sleep(3000);
	       AboutLink.click();
	       Thread.sleep(3000);
	       HelpLink.click();
	       Thread.sleep(3000);
	       APILink.click();
	       
	     //Now 4 Windows are open
	     //Getting the Handles of All The Opened windows
	     //Return type for getWindowHandles is set of String
	     //Return Type for getWindowHandle is String
	       
	       Set<String> AllHandles = driver.getWindowHandles();
	       Iterator<String> ite   = AllHandles.iterator();
	       
	       while(ite.hasNext())
	       {
	       
	    	String ChildWindow = ite.next();
	    	Thread.sleep(3000);
	    	driver.switchTo().window(ChildWindow);
	    	Thread.sleep(3000);
	    	String CurrentTitle = driver.getTitle();
	    			
	    	System.out.println(CurrentTitle);
	    	
	        
	        
	        
	       }
	       
	       
	       
	       
	       
	       

	}

}
