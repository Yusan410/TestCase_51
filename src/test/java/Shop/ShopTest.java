package Shop;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopTest {

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
	public void test() throws InterruptedException {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on Shop Menu
		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Adjust the filter by price between 150 to 450 rps
		WebElement sliders = driver
				.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/span[2]"));

		Actions move = new Actions(driver);

		Action action = (Action) move.dragAndDropBy(sliders, -28, 0).build();
		action.perform();

		driver.findElement(By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button")).click();

		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));

		for (WebElement book : books) {

			System.out.println(book.getText());
		}
	}

	@Ignore
	@Test
	public void test2() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on Shop Menu
		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();
		// 4) Click any of the product links available in the product category

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[4]")).click();

		// 5) Now user can view only that particular product

		WebElement book = driver.findElement(By.xpath("//*[@id=\"product-182\"]/div[2]"));

		Assert.assertTrue(book.isDisplayed());

		System.out.println("PASSED: " + book.getText());
	}

	@Ignore
	@Test
	public void test3() {

		// 1) Open the browser
		// 2) Enter the URL “http://practice.automationtesting.in/”
		// 3) Click on Shop Menu

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();
		// 4) Click on Sort by Popularity item in Default sorting dropdown

		WebElement sort = driver.findElement(By.xpath("//*[@id=\"content\"]/form/select"));

		Select select = new Select(sort);

		select.selectByValue("popularity");
		// 5) Now user can view the popular products only

		List<WebElement> products = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));

		for (WebElement product : products) {

			System.out.println("Popular products list : " + product.getText());

		}

	}

	@Ignore
	@Test
	public void test4() {

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Click on Sort by Average ratings in Default sorting dropdown
		WebElement avgRating = driver.findElement(By.xpath("//*[@id=\"content\"]/form/select"));

		Select select = new Select(avgRating);

		select.selectByVisibleText("Sort by average rating");

		// 5) Now user can view the popular products only

		List<WebElement> popularProducts = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));

		for (WebElement books : popularProducts) {

			System.out.println("Passed :" + books.getText());
		}

	}

	@Ignore
	@Test
	public void test5() {

		// 3) Click on Shop Menu

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Click on Sort by Newness ratings in Default sorting dropdown

		WebElement NewneesRate = driver.findElement(By.xpath("//*[@id=\"content\"]/form/select"));

		Select select = new Select(NewneesRate);

		select.selectByVisibleText("Sort by newness");

		// 5) Now user can view the popular products only

		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));

		for (WebElement elements : element) {

			System.out.println("Passed : " + elements.getText());
		}

	}

	@Ignore
	@Test
	public void test6() {

		// 3) Click on Shop Menu

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Click on Sort by Low to High Item in Default sorting dropdown

		WebElement loeToHigh = driver.findElement(By.xpath("//*[@id=\"content\"]/form/select"));

		Select select = new Select(loeToHigh);

		select.selectByValue("price");

		// 5) Now user can view the popular products only

		List<WebElement> price = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));

		for (WebElement Price : price) {

			System.out.println("Passed : " + Price.getText());

		}

	}

	@Ignore
	@Test
	public void test8() {

		// 3) Click on Shop Menu

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Click on Sort by Low to High Item in Default sorting dropdown

		WebElement HighToLow = driver.findElement(By.xpath("//*[@id=\"content\"]/form/select"));

		Select select = new Select(HighToLow);

		select.selectByValue("price-desc");

		// 5) Now user can view the popular products only

		List<WebElement> priceDesc = driver.findElements(By.xpath("//*[@id=\"content\"]/ul"));

		for (WebElement Price : priceDesc) {

			System.out.println("Passed : " + Price.getText());

		}
	}
    @Ignore
	@Test
	public void test9() {

		// 3) Click on Shop Menu

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();

		// 4) Click on read more button in home page

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[2]")).click();
		// 5) Read More option indicates the Out Of Stock.
		
	
		// 6) User cannot add the product which has read more option as it was out of
		// stock.
         WebElement books = driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/p"));
         
         Assert.assertTrue(books.isDisplayed());
         
         System.out.println("Cannot add to basket : " +books.getText());
         
	}
    @Ignore
	@Test
	public void test10() {
		
		//3) Click on Shop Menu
		
		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();
	//4) Click on Sale written product in home page
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]/img")).click();
	//5) User can clearly view the actual price with old price striken for the sale written products
		
		WebElement price = driver.findElement(By.xpath("//*[@id=\"product-169\"]/div[2]/div[1]/p"));
		
		Assert.assertTrue(price.isDisplayed());
		
		System.out.println("Original price and sale price: " +price.getText());
		
		
	}
    @Ignore
	@Test
	public void test11() throws InterruptedException {
		
		//3) Click on Shop Menu
		
				driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();
				
				
				//4) Click on the Add To Basket button which adds that book to your basket
				
				driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
				
				//5) User can view that Book in the Menu item with price .
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
				
				//7) Now user can find total and subtotal values just above the Proceed to Checkout button.
				
				//8) The total always < subtotal because taxes are added in the subtotal
				
				WebElement element =driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div"));
				
				Assert.assertTrue(element.isDisplayed());
				
				System.out.println("Passed : " +element.getText());
				
				//9) Now click on Proceed to Check out button which navigates to payment gateway page.
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
				
				String currentUrl = driver.getCurrentUrl();
				
				System.out.println(currentUrl);
				
				
				
				//10) User can view Billing Details,Order Details,Additional details and Payment gateway details.
				
				Thread.sleep(2000);
				
				WebElement review = driver.findElement(By.xpath("//*[@id=\"order_review\"]"));
				
				Assert.assertTrue(review.isDisplayed());
				System.out.println("--------------------------------------------");
				System.out.println(review.getText());
				
				//11) Now user can fill his details in billing details form and can opt any payment in the
				
				driver.findElement(By.id("billing_first_name")).sendKeys("Ali");
				driver.findElement(By.id("billing_last_name")).sendKeys("Yusan");
				driver.findElement(By.id("billing_company")).sendKeys("Sutong Tire");
				driver.findElement(By.id("billing_email")).sendKeys("abcc51@gmail.com");
				driver.findElement(By.id("billing_phone")).sendKeys("34658857888");
				driver.findElement(By.xpath("//*[@id=\"s2id_billing_country\"]/a/span[2]/b")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("s2id_autogen1_search")).sendKeys("United States",Keys.ENTER);
				
				driver.findElement(By.id("billing_address_1")).sendKeys("26319 andrew ct");
				driver.findElement(By.id("billing_city")).sendKeys("Cypress");
				
				driver.findElement(By.xpath("//*[@id=\"s2id_billing_state\"]/a/span[2]/b")).click();
				
				driver.findElement(By.id("s2id_autogen2_search")).sendKeys("Texas" ,Keys.ENTER);
				
				driver.findElement(By.id("billing_postcode")).sendKeys("77433");
				driver.findElement(By.xpath("//*[@id=\"payment_method_bacs\"]")).click();
				//12) Now click on Place Order button to complete process
				driver.findElement(By.id("place_order")).click();
				
				Thread.sleep(2000);
				
				String CurrentUrl = driver.getCurrentUrl();
				
				System.out.println("-----------------------------------------------");
				
				System.out.println(CurrentUrl);
				
				//13) On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.
				Thread.sleep(2000);
				
				WebElement order = driver.findElement(By.xpath("//*[@id=\"content\"]"));
				
				Assert.assertTrue(order.isDisplayed());
				
				System.out.println("-----------------------------------------------");
				System.out.println("-----------------------------------------------");
				
				System.out.println(order.getText());
				
				
	}
    @Ignore
    @Test
    public void test12() throws InterruptedException {
    	

		driver.findElement(By.xpath("//li[@id='menu-item-40']/a")).click();
		
		
		//4) Click on the Add To Basket button which adds that book to your basket
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
		
		//5) User can view that Book in the Menu item with price .
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
		
		//7) Now user can find total and subtotal values just above the Proceed to Checkout button.
		
		//8) The total always < subtotal because taxes are added in the subtotal
		
		//9) The tax rate variers for India compared to other countries
		//10) Tax rate for indian should be 2% and for abroad it should be 5%
		
	String basketTotal = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div")).getText();
	
	
	Thread.sleep(2000);
	
	System.out.println(basketTotal);
	
	
	System.out.println("-------------------------------------------------");
		
	String subtotal = driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText().replace("₹", "");
	
	Thread.sleep(2000);
	
	double Subtotal = Double.parseDouble(subtotal);
	
	System.out.println(Subtotal);
	
	double IndiaTaxRate = 0.02;
	
	double Indiatotal = Subtotal * IndiaTaxRate;
	
	
	System.out.println("\n~With India Tax Rate~\nSubtotal : ₹" + Subtotal + "\n" + "India Tax Rate(2%) : ₹"
			+ (Subtotal * IndiaTaxRate) + "\n" + "Total : ₹" + (Subtotal + Indiatotal));
	
    	
    
    	
    }
	

}
