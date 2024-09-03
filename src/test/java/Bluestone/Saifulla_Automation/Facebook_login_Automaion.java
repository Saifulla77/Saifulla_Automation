package Bluestone.Saifulla_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_Automaion {

	public static  void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Work\\Download\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Masum = driver.findElement(By.xpath("//input[@name=\"email\"]") );
		WebElement Zakriya = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		Masum.sendKeys("7207443177");
		Zakriya.sendKeys("72074431");
		loginbtn.click();
	
		
	}

}
