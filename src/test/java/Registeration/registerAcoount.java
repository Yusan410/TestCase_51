package Registeration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class registerAcoount {
	
	WebDriver driver;

	@Before
	public void tesbeforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		driver.manage().window().maximize();

	}

	@Ignore
	@Test
	public void tes1() {

		// 3.Click on My Account Menu//

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered Email Address in Email-Address textbox

		driver.findElement(By.id("reg_email")).sendKeys("aa1234@gmail.com");

		// 5) Enter your own password in password textbox

		driver.findElement(By.id("reg_password")).sendKeys("Yusan410517");

		// 6) Click on Register button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();

		// 7) User will be registered successfully and will be navigated to the Home
		// page

		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div"));

		Assert.assertTrue(homepage.isDisplayed());

		System.out.println("successfully navigated to home page :" + homepage.getText());

	}

	@Ignore
	@Test
	public void test2() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter invalid Email Address in Email-Address textbox

		driver.findElement(By.id("reg_email")).sendKeys("aa1234mkli");

		// 5) Enter your own password in password textbox

		driver.findElement(By.id("reg_password")).sendKeys("Yusan410517");

		// 6) Click on Register button

		String currentUrl = driver.getCurrentUrl();
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		7) Registration must fail with a warning message(ie You must enter a valid email address)
		String nextUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.equals(nextUrl));
		System.out.println("Registration failed");

	}

	@Ignore
	@Test
	public void test3() throws InterruptedException {

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter invalid Email Address in Email-Address textbox

		driver.findElement(By.id("reg_email")).sendKeys("");

		// 5) Enter your own password in password textbox

		driver.findElement(By.id("reg_password")).sendKeys("Yusan410517ssddfg");

		driver.findElement(By.id("body")).click();

		// 6) Click on Register button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();

//			7) Registration must fail with a warning message(ie You must enter a valid email address)

		WebElement error = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(error.isDisplayed());

		System.out.println("Passed : " + error.getText());

	}

	@Ignore
	@Test
	public void test4() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter valid Email Address in Email-Address textbox

		driver.findElement(By.id("reg_email")).sendKeys("abc410@gmail.com");

		// 5) Enter empty password in password textbox

		driver.findElement(By.id("reg_password")).sendKeys("");

		driver.findElement(By.id("body")).click();

		// 6) Click on Register button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();

		// 7) Registration must fail with a warning message(ie please enter an account
		// password)

		WebElement error2 = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(error2.isDisplayed());

		System.out.println("Passed : " + error2.getText());

	}

	@Test
	public void tes4() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter valid empty Address in Email-Address textbox

		driver.findElement(By.id("reg_email")).sendKeys("");

		// 5) Enter empty password in password textbox

		driver.findElement(By.id("reg_password")).sendKeys("");

		driver.findElement(By.id("body")).click();

		// 6) Click on Register button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();

		// 7) Registration must fail with a warning message(ie please provide valid
		// email address)

		WebElement error3 = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul"));

		Assert.assertTrue(error3.isDisplayed());

		System.out.println("Passed : " + error3.getText());

	}

}



