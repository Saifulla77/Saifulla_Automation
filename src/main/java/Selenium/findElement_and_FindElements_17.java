package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement_and_FindElements_17 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://demo.guru99.com/test/web-table-element.php");
	       
	   //This will return only first matching WebElement and it will be stored in single
	       WebElement Single = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr"));
	       
	   //This will return all the WebElemnents
	       List<WebElement> allElements = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
	       int count = allElements.size();
	       System.out.println("Number of Elements in List"+count);
	       Thread.sleep(5000);
	       driver.close();         
    }

}
  //Find Element:It will find Only Single first WebElement matching the Xpath.The Return type of this is WebElement

  //FindElements:It will find all the WebElements matching the Xpath.The Return type for this will be List of webElements.