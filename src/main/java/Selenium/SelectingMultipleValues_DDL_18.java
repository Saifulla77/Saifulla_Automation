package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingMultipleValues_DDL_18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialspoint.com/selenium/selenium_automation_practise.htm");
		WebElement Masum = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select sc = new Select(Masum);
		Thread.sleep(3000);
		sc.selectByIndex(4);
		Thread.sleep(2000);
		sc.selectByIndex(1);
		driver.close();
		  

	}

}
