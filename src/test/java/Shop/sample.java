package Shop;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	//WebDriver driver;
	
	@Before
	public void tesbeforetest()  {

		WebDriver driver = WebDriverManager.chromedriver().create();

		//driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.manage().window().maximize();
		
		
	}
	@Test
	public void test() {
		
		
	}

}
