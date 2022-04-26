package MyAccount_Login;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dental {
	
	WebDriver driver;
	@Before
	public void setup() {
		
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://diseradental.ca/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("hero-aptform")).click();
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/img")).click();
	
	
	
	
	driver.findElement(By.id("service-button")).click();
	
	}
}
