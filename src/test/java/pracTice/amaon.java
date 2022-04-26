package pracTice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amaon {
	
	WebDriver driver;
	
	@Before
	public void before() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		
	}
	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13",Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img[1]")).click();
		
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"variation_service_provider\"]/ul/li"));
		
		for(WebElement e : element) {
			
			
			String str = e.getText();
			
			System.out.println(str);
			
			if(e.getText().contains("Verizon")) {
				
				Thread.sleep(2000);
				
				e.click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("add-to-cart-button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("nav-cart")).click();
				
			}
			
			
		}
	}

}
