package pracTice;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownPractice {
	
	
	WebDriver driver;
	
	@Before
	public void dropdowntest() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		
	}
	
	@Test
	public void test() {
		
		
		driver.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();
		
		
		WebElement element = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		
		
		Select sel = new Select(element);
		
		sel.selectByVisibleText("United States of America");
		
		
		
		WebElement firstoptions =sel.getFirstSelectedOption();
		
		System.out.println("first options :" +firstoptions.getText());
		
		
		List<WebElement> listoptions = sel.getOptions();
			
		
		
		for(WebElement webelement:listoptions) {
			
			System.out.println("Get options " +webelement.getText());
			
			
			
		}
		
		
    
    	 
    	 
    
		
		
		
	}

}
	
	
	
	
	
	
	//http://demo.automationtesting.in/Index.html


