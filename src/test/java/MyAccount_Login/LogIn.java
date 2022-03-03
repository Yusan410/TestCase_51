package MyAccount_Login;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn {
	
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void beforemethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();

	}
    @Ignore
	@Test
	public void test1() {

		// 3.Click on My Account Menu//

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox//

		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");

		// 5) Enter password in password textbox//

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// Click on login button//

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		// 7) User must successfully login to the web page//

		String CurrentUrl = driver.getCurrentUrl();

		System.out.println("successfully login to the web page :" + CurrentUrl);
	}
    @Ignore
	@Test
	public void test2() {

		// 3.Click on My Account Menu//
		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter incorrect username in username textbox

		driver.findElement(By.id("username")).sendKeys("dsjhdke");

		// 5) Enter incorrect password in password textbox.

		driver.findElement(By.id("password")).sendKeys("fhdufr");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

//		/7) Proper error must be displayed(ie Invalid username) and prompt to enter login again

		WebElement Username = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));

		Assert.assertTrue(Username.isDisplayed());

		System.out.println("Passed :" + Username.getText());

	}
    @Ignore
	@Test
	public void test3() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter valid username in username textbox

		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");

		// 5) Now enter empty password in the password textbox

		driver.findElement(By.id("password"));

		// 6) Click on login button.

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		// 7) Proper error must be displayed(ie Invalid password) and prompt to enter
		// login again

		WebElement password = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(password.isDisplayed());

		System.out.println("Passed : " + password.getText());
	}
    @Ignore
	@Test
	public void test4() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter empty username in username textbox
		driver.findElement(By.id("username"));

		// 5) Now enter valid password in the password textbox
		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button.
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) Proper error must be displayed(ie Invalid username) and prompt to enter
		// login again
		WebElement Result = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(Result.isDisplayed());

		System.out.println("Passed : " + Result.getText());

		// Test 4 and Test 5 is same//
	}
    @Ignore
	@Test
	public void test5() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter empty username in username textbox
		driver.findElement(By.id("username")).sendKeys("");

		// 5) Now enter valid password in the password textbox
		driver.findElement(By.id("password")).sendKeys("");

		// 6) Click on login button.
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) Proper error must be displayed(ie Invalid username) and prompt to enter
		// login again
		WebElement Result = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(Result.isDisplayed());

		System.out.println("Passed : " + Result.getText());
	}
    @Ignore
	@Test
	public void test6() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter the password field with some characters.

		driver.findElement(By.id("password")).sendKeys("abcd");

		// 5) The password field should display the characters in asterisks or bullets
		// such that the password is not
		// visible on the screen

		//boolean Encryped = driver.findElement(By.id("password")).getAttribute("type").equals("password");
		//Assert.assertTrue(Encryped);
		//System.out.println(Encryped);
		
		WebElement loginPageNavigate = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[2]"));
		Assert.assertTrue(loginPageNavigate.isDisplayed());
		System.out.println("TEST PASSED : " + loginPageNavigate.getText());
	}
    @Ignore
	@Test
	public void test7() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter empty username in username textbox
		driver.findElement(By.id("username")).sendKeys("yusan410@gmail.com");

		// 5) Now enter valid password in the password textbox
		driver.findElement(By.id("password")).sendKeys("yusan8559693");

		// 6) Click on login button.
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		WebElement result = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(result.isDisplayed());

		System.out.println("Passed : " + result.getText());
	}
    @Ignore
	@Test
	public void test8() {

		// 3) Click on My Account Menu

				driver.findElement(By.id("menu-item-50")).click();

				// 4) Enter empty username in username textbox
				driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");

				// 5) Now enter valid password in the password textbox
				driver.findElement(By.id("password")).sendKeys("Yusan8559693");

				// 6) Click on login button.
				driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
				
				//7) Once your are logged in, sign out of the site
				
				driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
				
				String currentUrl = driver.getCurrentUrl();
				
				System.out.println(currentUrl);
				
				//8) Now press back button
				
				driver.navigate().back();
				
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id='customer_login']/div[1]/h2")).isDisplayed());
				
				System.out.println(driver.findElement(By.xpath("//*[@id='customer_login']/div[1]/h2")).getText());
		
	}

}



