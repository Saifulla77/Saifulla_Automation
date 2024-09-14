package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAITS_Selenium_21 {

	public static void main(String[] args) {
		Implicit_wait();
		//Expliit_Wait();
		
	}

	
	private static void Expliit_Wait() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   WebElement Search = driver.findElement(By.xpath("//input[text()='Search'"));
		   WebDriverWait expWait = new WebDriverWait(driver, 30);
		   expWait.until(ExpectedCondition.visibilityof(Search));
	}



	private static void Implicit_wait() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		//Syntax for Implicit Wait
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}
