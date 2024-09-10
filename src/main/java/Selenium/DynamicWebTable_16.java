package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable_16 {

	private static final List<WebElement> Rows = null;
	private static final List<WebElement> count = null;

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	WebElement WebElementrows = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr"));
    List<WebElement>columns=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr[1]//td"));
	int Row_Count   = Rows.size();
	int Column_Count= count.size();
	
	
	}
}
