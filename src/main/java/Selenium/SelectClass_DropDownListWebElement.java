package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_DropDownListWebElement {

	
	public static void main(String[] args) throws InterruptedException {
	 Select_By_value();
	//Select_By_Visible_Text();
	//Select_By_Index();
	
	}
	//Every DDL has  Tag Name of Select
	//Select sc= new select(DDL WebElement)
	//==>sc.selectByIndex();
	//==>sc.selectByVisibleText();
	//==>sc.selectByValue();
	
	private static void Select_By_Index() throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		//Selecting a value from Drop Down list
		   WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		   Select sc = new Select(SSCBoard_ddl);
		   Thread.sleep(3000);
		   sc.selectByIndex(4);
		   driver.close();
		   
	}

	private static void Select_By_Visible_Text() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		//Selecting a value from Drop Down list
		   WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		   Select sc = new Select(SSCBoard_ddl);
		   sc.selectByVisibleText("APOS");
		   Thread.sleep(5000);
		   sc.selectByVisibleText("AP SSC");
		   driver.close();
	}


	private static void Select_By_value() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		//Selecting a value from Drop Down list
	       WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@name='userProperties(addrdistid)']"));
		   Thread.sleep(5000);
	       Select sc = new Select( SSCBoard_ddl);
	       sc.selectByValue("10");
	       Thread.sleep(5000);
	       sc.selectByValue("4");
	       driver.close();
	       
		
	}
}



   
  
   
   
