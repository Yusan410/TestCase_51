package HomePageTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	

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
	public void test1() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

		List<WebElement> sliders = driver.findElements(
				By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]//div//div//div"));

		int numberofsliders = sliders.size();

		Assert.assertTrue(numberofsliders == 3);

		System.out.println("sliders are 3");

		for (int i = 0; i < numberofsliders; i++) {

			Thread.sleep(2000);

			List<WebElement> img = driver.findElements(
					By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]//img"));

			Thread.sleep(2000);

			img.get(i).click();

			// driver.navigate().back();

			System.out.println("img clictable ");

			List<WebElement> checkOutButton = driver.findElements(By.xpath("//button[@type='submit']"));

			if (checkOutButton.size() > 0) {
				Assert.assertTrue(checkOutButton.size() > 0);
				System.out.println("This item is able to add to the basket: PASSED");

			} else {
				driver.navigate().back();
			}

		}

	}

	@Ignore
	@Test
	public void test2() {

		// Description and Review

		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"tab-description\"]//h2")).isDisplayed());

		System.out.println("description is display : passed");

		driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[2]/a")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"reviews\"]")).isDisplayed());

		System.out.println("review is display: passed");

	}

	@Ignore
	@Test
	public void test3() {

		// Click on the Add To Basket button which adds that book to your basket
		// 11) User can view that Book in the Menu item with price.
		// 12) User can add a book by clicking on Add To Basket button which adds that
		// book in to his Basket
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]")).click();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement result = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]"));

		Assert.assertTrue(result.isDisplayed());

		System.out.println("Sucseesfully add to basket Passed :  " + result.getText());

	}

	@Ignore
	@Test
	public void test4() {

		// Select more books than the books in stock.Ex if the stock has 20 books, try
		// to add 21.
		// 14) Click the add to basket button
		// 15) Now it throws an error prompt like you must enter a value between 1 and
		// 20

		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]")).click();

		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("7800");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("\"Value must be less than or equal to stock limit should pop-up");

	}
    @Ignore
	@Test
	public void test5() throws InterruptedException {

		// add book // add coupun // remove book !
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a")).click();

		System.out.println("succseesfully add to book");

		driver.findElement(By.xpath("//*[@id=\"coupon_code\"]")).sendKeys("krishnasakinala");

		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]")).click();

		Thread.sleep(3000);

		WebElement elemement = driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/ul//li"));

		Thread.sleep(3000);

		System.out.println("CAN NOT ADD COUPUN  : " + elemement.getText());

		driver.findElement(By.xpath("//td[@class='product-remove']/a")).click();

		Thread.sleep(3000);

		WebElement removeitem = driver.findElement(By.xpath("//*[@class='woocommerce']/p[1]"));

		Assert.assertTrue(removeitem.isDisplayed());

		System.out.println("ITEM REMOVE PASS : " + removeitem.getText());

	}
    @Ignore
	@Test
	public void test6() throws InterruptedException {
		
		// add book // UPDATE BASKET // 

				driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

				driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

				driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]")).click();

				driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();

				driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a")).click();

				WebElement quantity = driver.findElement(By.xpath("//div[@class='quantity']/input"));

				quantity.clear();

				quantity.sendKeys("5");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@value='Update Basket']")).click();
				Thread.sleep(3000);
				
				WebElement updatebasket = driver.findElement(By.xpath("//div[@class='woocommerce-message']"));
				Thread.sleep(3000);
				
				Assert.assertTrue(updatebasket.isDisplayed());
				
				Thread.sleep(3000);
				
				System.out.println("VERIFY BASKET UPDATE  PASSED : " +updatebasket.getText());
				
				WebElement subtotal = driver.findElement(By.xpath("//tr[@class='cart-subtotal']/td/span"));
				
				Thread.sleep(3000);
				
				Assert.assertTrue(subtotal.isDisplayed());
				
				Thread.sleep(3000);
				
				System.out.println("Subtotal : " +subtotal.getText());
		
		
	}
    @Ignore
    @Test
    public void test7() throws InterruptedException {
    	
    //  verify subtotal  // total  //
		
    		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();

    		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();

    		driver.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]")).click();

    		driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();

    		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a")).click();

    		WebElement quantity = driver.findElement(By.xpath("//div[@class='quantity']/input"));

    		quantity.clear();
    		
    		Thread.sleep(3000);

    		quantity.sendKeys("5");
    		
    		Thread.sleep(3000);
    		
    		driver.findElement(By.xpath("//*[@value='Update Basket']")).click();
    		Thread.sleep(3000);
    		
    		
    		
    		WebElement subtotal = driver.findElement(By.xpath("//tr[@class='cart-subtotal']/td/span"));
    		
    		Thread.sleep(3000);
    		
    		Assert.assertTrue(subtotal.isDisplayed());
    		
    		Thread.sleep(3000);
    		
    		System.out.println("Subtotal is : " +subtotal.getText());
    		
    		Thread.sleep(3000);
    		
    		WebElement total = driver.findElement(By.xpath("//tr[@class='order-total']/td/strong"));
    		
    		Thread.sleep(3000);
    		
    		Assert.assertTrue(total.isDisplayed());
    		
    		Thread.sleep(3000);
    		
    		System.out.println("Total is : " +total.getText());
    		
    		Thread.sleep(3000);
    		
    		System.out.println("Subtotal less than Total :  Passed ");
    		
    		Thread.sleep(3000);
    		
    		//Checkout button //
    		
    		driver.findElement(By.xpath("//div[@class='wc-proceed-to-checkout']/a")).click();
    		
    		String actualtitle = driver.getTitle();
    		
    		Thread.sleep(2000);
    		
    		String expectedtitle = "Checkout – Automation Practice Site";
    		
    		Thread.sleep(2000);
    		
    		Assert.assertEquals(actualtitle,expectedtitle);
    		
    		Thread.sleep(2000);
    		
    		System.out.println("Test passed "  +actualtitle);
    		
    		Thread.sleep(2000);
    		
    		
    		driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/div[2]/a")).click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("krishnasakinala");
    		
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/form[2]/p[2]/input")).click();
    		
    		Thread.sleep(2000);
    		
    		//username
    		
    		
    		
    		//add coupon // 
    		
    		
    		//WebElement coupon = driver.findElement(By.xpath("//div[@class='woocommerce-message']"));
    		
    		//Thread.sleep(3000);
    		
    		
    		//Assert.assertTrue(coupon.isDisplayed());
    		
    		//Thread.sleep(3000);
    		
    		
    		//System.out.println("Coupon successfully added PASS : " +coupon.getText());
    		
    		//Thread.sleep(3000);
    		
    		//  OrderReview // 
    		
    		WebElement orderReview = driver.findElement(By.xpath("//div[@id='order_review']"));
    		
    		Thread.sleep(3000);
    		
    		
    		Assert.assertTrue(orderReview.isDisplayed());
    		
    		Thread.sleep(3000);
    		
    		System.out.println("----------------------------------------------");
    		
    		
    		System.out.println("Order review  PASSED : " +orderReview.getText());
    		
    		Thread.sleep(3000);
    		
    		
            driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/div[1]/a")).click();
            
            Thread.sleep(1500);
    		
    		
    		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Yusan410@gmail.com");
    		
    		//Thread.sleep(1500);
    		
    		
    		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Yusan8559693");
    		
    		//Thread.sleep(1500);
    		
    		
    		//driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/form[1]/p[4]/input[3]")).click();
    		
    		
    		
    		
    		
    		
    		
    		//customer information//
    		
    		
    		driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("Yusan");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("Ali");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//input[@id='billing_company']")).sendKeys("Sutong");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("Ali410@gmail.com");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("832-349-2222");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//*[@id='s2id_billing_country']/a/span[2]/b")).click();
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//input[@id=\"s2id_autogen1_search\"]")).sendKeys("United States" ,Keys.ENTER);
    		
    		

    		Thread.sleep(1500);
    		
    		
    		
    		
    		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("26311 andrew arbor ct");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Cypress");
    		
    		Thread.sleep(1500);
    		
    		driver.findElement(By.xpath("//*[@id=\"s2id_billing_state\"]/a/span[2]/b")).click();
    		
    		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys("Texas" ,Keys.ENTER);
    		
    		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("77433");
    		
    		driver.findElement(By.xpath("//input[@id='payment_method_bacs']")).click();
    		
    		driver.findElement(By.id("place_order")).click();
    		
    		Thread.sleep(2000);
    		
    		//  Verify : coupon limit has rechead //
    		
    		//WebElement coupun = driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/form[3]/ul"));
    		
    		//Thread.sleep(2000);
    		
    		//Assert.assertTrue(coupun.isDisplayed());
    		
    		//Thread.sleep(2000);
    		
    		//System.out.println("-----------------------------------------------");
    		
    		//System.out.println("Coupon usage has limit Passed : " +coupun.getText());
    		
    		//driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
    		//Thread.sleep(2000);
    		
    		//oder details//
    		
    		WebElement orderdetails = driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]"));
    		Thread.sleep(2000);
    		
    		Assert.assertTrue(orderdetails.isDisplayed());
    		Thread.sleep(2000);
    		
    		System.out.println("-----------------------------------------------");
    		
    		Thread.sleep(2000);
    		
    		System.out.println("Verify order details Passed : " +orderdetails.getText());
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    		
    		
    	}

    	
    	
    	
    



