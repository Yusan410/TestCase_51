package pracTice;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice  {
	
	WebDriver driver;
	
	@Before
	public void beforemethod() {
		
		
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.phptravels.net/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void test() {
		
		
		
		driver.findElement(By.xpath("//*[@aria-controls='flights']")).click();
		
		driver.findElement(By.id("cookie_stop")).click();
		
		
		driver.findElement(By.id("autocomplete")).sendKeys("Houston");
		
		driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[1]/div/div/div/div/div[1]")).click();
		
		driver.findElement(By.id("autocomplete2")).click();
		
		
	}

}
