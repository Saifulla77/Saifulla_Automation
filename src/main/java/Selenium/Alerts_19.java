package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_19 {

	public static void main(String[] args) throws InterruptedException {
	
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	       WebElement Masum     = driver.findElement(By.xpath("//label[text()=\"On button click, confirm box will appear\"]/following::button[1]"));
	       WebElement Saifulla  = driver.findElement(By.xpath("//label[text()=\"On button click, confirm box will appear\"]/following::button[2]"))	;       
	       Thread.sleep(3000); 
	       Masum.click();
	       Thread.sleep(2000);
	       driver.switchTo().alert().accept();
	       Thread.sleep(3000);
	       Saifulla.click();
	       driver.switchTo().alert().sendKeys("Masum");
	       Thread.sleep(3000);
	       driver.switchTo().alert().accept();
	       Thread.sleep(3000);
	       driver.close();

	       
	       
	       
	}

}
