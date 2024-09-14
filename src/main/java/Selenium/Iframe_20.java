package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_20 {

	public static void main(String[] args) throws InterruptedException {
		SwitchToFrame_By_Id();
		//SwitchToFrawebEme_By_Index();
		//SwitchTOF_By_WebElement();
		
	}

	private static void SwitchTOF_By_WebElement() {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/tinymce");
	   //Switch To Frame By WebElement
	       WebElement iframe_xpath = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr'"));
	       driver.switchTo().frame(iframe_xpath);
	       
	}

	private static void SwitchToFrame_By_Index() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/tinymce");
	    //Switching to frame by Index 
	       driver.switchTo().frame(0);
	       WebElement Message_TestBox = driver.findElement(By.xpath("//body[@id=\"tinymce\"]"));
	       Message_TestBox.clear();
	       Thread.sleep(3000);
	       Message_TestBox.sendKeys("Bluestone");
	       Thread.sleep(3000);
	       Message_TestBox.clear();
	       Thread.sleep(3000);
	       Message_TestBox.sendKeys("Saifulla from Bluestone");
	       Thread.sleep(2000);
	       driver.close();
	       
	       
		
	}

	private static void SwitchToFrame_By_Id() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/tinymce");
	       
	     //Switch To Frame by ID
	       
	       driver.switchTo().frame("mce_0_ifr");
	       Thread.sleep(4000);
	       WebElement Message_TestBox = driver.findElement(By.xpath("//body[@id=\"tinymce\"]"));
	       Message_TestBox.clear();
	       Thread.sleep(3000);
	       Message_TestBox.sendKeys("Bluestone");
	       Thread.sleep(3000);
	       Message_TestBox.clear();
	       Thread.sleep(3000);
	       Message_TestBox.sendKeys("Saifulla from Bluestone");
	       Thread.sleep(2000);
	       driver.close();
	       
	       
	       
	       
	       
	}

}
