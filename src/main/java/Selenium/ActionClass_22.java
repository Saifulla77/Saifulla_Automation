package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_22 {
	

	public static void main(String[] args) throws InterruptedException {
		Right_Click();
		//Double_Click();
		//Hover_Mouse();
		//Drag_Drop();
  }
	//Action class = To perform all the actions that you Can using Mouse we make use of Action Class

	private static void Drag_Drop() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://jqueryui.com/droppable/");
	       Thread.sleep(3000);
	       WebElement To_Element   = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
	       WebElement From_Element = driver.findElement(By.xpath("//p[text()=\"Drop here\"]")) ;
	       
	     //Action Class...Drag and Drop Actions Using
	       Actions ac = new Actions(driver);
	       Thread.sleep(3000);
	       ac.dragAndDrop(To_Element, From_Element).build().perform();
	       Thread.sleep(3000);
	       driver.close();
		
	}

	private static void Hover_Mouse() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/hovers");
	       Thread.sleep(3000);
	       WebElement FirstImage = driver.findElement(By.xpath("//img[@src=\"/img/avatar-blank.jpg\"]"));
	       Thread.sleep(3000);
	       
	     //Action Class...Performing a Hover Action Using MoveToElement Method
	      Actions Masum = new Actions(driver);
	      Thread.sleep(3000);
	      Masum.moveToElement(FirstImage).build().perform();
	      Thread.sleep(3000);
	      driver.close();
	      
		
		
	}

	private static void Double_Click() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("http://mousetester.com/");
	       Thread.sleep(3000);
	       WebElement ClickMe_Button = driver.findElement(By.xpath("//div[@id='ClickME']"));
	       Thread.sleep(3000);
	       
	     //Action Class...Performing Double Click
	      Actions Masum = new Actions(driver);
	      Masum.doubleClick(ClickMe_Button).build().perform();
	      Thread.sleep(3000);
	      driver.close();
	      
	}

	private static void Right_Click() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://the-internet.herokuapp.com/context_menu");
	       Thread.sleep(3000);
	       
	       WebElement Rectangle_Area = driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
	       Thread.sleep(3000);
	     
	  //Action Class....
	     
	        Actions ac = new Actions(driver);
	        ac.contextClick(Rectangle_Area).build().perform();
	        Thread.sleep(3000);
	        driver.switchTo().alert().accept();
	        Thread.sleep(3000);
	        driver.close();
	        
	}

}
