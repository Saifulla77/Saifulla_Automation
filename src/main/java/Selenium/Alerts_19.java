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
     //They have Created an interface Call Alerts. Using this you handle the Alests in Web page.

      //ALERTS Handdling
  //1.Driver.switchTo.Alext.accept();-->ok/proceed
  //2.Driver.swithTo.Alert.Dismiss();-->cancel /Do not proceed
  //3.Driver.swithTo.Alert.sendkeys();-->Enter To Data into Text Box that is present inside an alert
  //4.Driver.switchTo.Alert.getText();-->To Read Text from the Pop up Window 



