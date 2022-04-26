package pracTice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {
	

	WebDriver driver;
	
	@Before
	public void dropdowntest() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
	}
   @Test
	public void test1() {
	   
	   driver.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();
	   
	   Actions a = new Actions(driver);
	   
	  WebElement button =  driver.findElement(By.id("msdd"));
	  
	  a.moveToElement(button).build().perform();
	   
	   
		}
		
		
		
		
	}


