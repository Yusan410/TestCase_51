package My_Account;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountTest {

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
	public void test() {
		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);

		// 8) Click on Myaccount link which leads to Dashboard

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a")).click();

		// 9) User must view Dashboard of the site

		String Dashboard = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println(Dashboard);

	}

	@Ignore
	@Test
	public void test2() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);
		// 8) Click on Myaccount link
		// 9) Click on Orders link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
		// 10) User must view their orders on clicking orders link

		String orders = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println(orders);

	}

	@Ignore
	@Test
	public void test3() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);
		// 8) Click on Myaccount link
		// 9) Click on Orders link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
		// 10) User must view their orders on clicking orders link

		String orders = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println(orders);

		// 11) User must view his Order details,customer details and billing details on
		// clicking view button

		System.out.println("==================================================================");

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a")).click();

		String order = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println(order);

	}

	@Ignore
	@Test
	public void test4() {

		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);
		// 8) Click on Myaccount link
		// 9) Click on Orders link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
		// 10) User must view their orders on clicking orders link

		String orders = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println(orders);

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a")).click();

		// 11) User must view Order Number Ordered date and Status of the order on
		// clicking view button

		System.out.println("==================================================================");

		String Order = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p")).getText();

		System.out.println("Passed: " + Order);

	}

	@Ignore
	@Test
	public void test5() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);

		// 8) Click on Myaccount link which leads to Dashboard

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a")).click();

		// 9) Click on Address link

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a")).click();

		// 10) User must view billing address and ship address

		String address = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println("Passed : " + address);
	}

	@Ignore
	@Test
	public void test6() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);

		// 8) Click on Myaccount link which leads to Dashboard

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[1]/a")).click();

		// 9) Click on Address link

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a")).click();

		// 10) Click Edit on Shipping Address

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[2]/header/a")).click();

		// 11) User can Edit Shipping address

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form")).isDisplayed());

		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form")).getText());

	}

	@Ignore
	@Test
	public void test7() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);

		// 8) Click on Myaccount link

		driver.findElement(By.id("menu-item-50")).click();

		// 9) Click on Account details
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a")).click();

		// 10) User can view account details where he can change his pasword also.

		String account = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText();

		System.out.println(account);

		driver.findElement(By.id("account_first_name")).sendKeys("Yusan");

		driver.findElement(By.id("account_last_name")).sendKeys("Ali");

		driver.findElement(By.id("password_current")).sendKeys("Yusan8559693");

		driver.findElement(By.id("password_1")).sendKeys("Yusan8559693");

		driver.findElement(By.id("password_2")).sendKeys("Yusan8559693");

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[4]/input[3]")).click();

		String account1 = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div[1]")).getText();

		System.out.println("Passed: " + account1);

	}

	@Test
	public void test8() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on My Account Menu

		driver.findElement(By.id("menu-item-50")).click();

		// 4) Enter registered username in username textbox
		driver.findElement(By.id("username")).sendKeys("Yusan410@gmail.com");
		// 5) Enter password in password textbox

		driver.findElement(By.id("password")).sendKeys("Yusan8559693");

		// 6) Click on login button

		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		// 7) User must successfully login to the web page

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Successfully login the web page : " + currentUrl);

		// 8) Click on Myaccount link

		driver.findElement(By.id("menu-item-50")).click();

		// 9) Click on Logout button

		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a")).click();

		// 10) On clicking logout,User successfully comes out from the site

		String logout = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]")).getText();

		System.out.println("Successfully comes out  " + logout);

	}
}
