package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Automation_Practise_17 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	       
	       
	       WebElement Name     = driver.findElement(By.xpath("//input[@id=\"name\"]"));
	       WebElement Email    = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	       WebElement Gender   = driver.findElement(By.xpath("//input[@name=\"gender\"]"));
	       WebElement Mobile   = driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
	       WebElement DOB      = driver.findElement(By.xpath("//input[@name=\"dob\"]"));
	       WebElement Subject  = driver.findElement(By.xpath("//input[@id=\"subjects\"]"));
	       WebElement Hobbies  = driver.findElement(By.xpath("//label[text()=\"Hobbies:\"]//following::input[1]"));
	       WebElement Address  = driver.findElement(By.xpath("//textarea[@id=\"picture\"]")); 
	       WebElement state    = driver.findElement(By.xpath("//select[@name=\"state\"]"));
	       
	       //SendKeys Method to Enter Data into text Box
	       //Click Method to click Radio Button
	       //Click Method to Click on CheckBox
	       
	       Name.sendKeys("Saifulla");
	       Thread.sleep(3000);
	       Email.sendKeys("shaikmohammedsaifulla@gmail.com");
	       Thread.sleep(3000);
	       Gender.click();
	       Thread.sleep(3000);
	       Mobile.sendKeys("9998887777");
	       Thread.sleep(3000);
	       DOB.sendKeys("05-06-2004");
	       Thread.sleep(3000);
	       Subject.sendKeys("Maths");
	       Thread.sleep(3000);
	       Hobbies.click();
	       Thread.sleep(3000);
	       Address.sendKeys("Kurnool");
	       Thread.sleep(3000);
	       Select sc = new Select(state);
	       sc.selectByIndex(2);
	       Thread.sleep(3000);
	       
           
	       
	       driver.close();
	       
	       
	       
	       
	       
	       
	       
	}

}
