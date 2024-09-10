package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Automation_14 {

	public static void main(String[] args) throws InterruptedException {
		//This part of the code is no longer needed as we are using selenium dependency version of above 14
	//System.setProperty("webdriver.chrome.driver","C:\\work\\downloads\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	//Launch the url
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("I love INDIA");

	
	//Find the Web Elements
    WebElement  Masum     =  driver.findElement(By.xpath("//input[@id='email']"));
	WebElement  Saifulla  =  driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement  Loginbtn  =  driver.findElement(By.xpath("//button[@name='login']"));
	
	//Operations on Elements
	Masum.sendKeys("shaikmohammedsaifulla@gmail.com");
	Saifulla.sendKeys("7207443");
	Loginbtn.click();
	Thread.sleep(5000);	
	driver.close();
	
	}

}
