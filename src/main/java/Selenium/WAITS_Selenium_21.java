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
    //Implicit Wait:It is Global Wait.This is applicable for all the WebElement 
    //Once it finds the Element within given Timeframe.Instead of waiting For total given time.It will proceed further
    //Implicit Wait Syntax: Driver.manage.timeout.implicitwait(10,TimeUnit.Seconds);
   
    //Explicit Wait; This Wait is applicable for Single WebElement 
    //Explicit Wait Syntax: WebDriverWait Expwait= new WebDriverWAit(driver,30);