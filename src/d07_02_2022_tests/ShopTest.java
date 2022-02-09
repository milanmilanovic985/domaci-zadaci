package d07_02_2022_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022_pages.CartPage;
import d07_02_2022_pages.ShopPage;

public class ShopTest {
//	2.Zadatak
//	Napisati test koji:
//	Ucitava stranicu http://cms.demo.katalon.com/
//	Vrsi klik na Shop link iz navigacije
//	Otvara stranicu prvog proizvoda klikom na karticu prvog proizvoda
//	Dodaje proizvod u korpu sa kolicinom 2
//	Verifikuje poruku nakon dodavanja “has been added to your cart.”
//	Odlazi u korpu klikom na dugme VIew Cart
//	Verifikuje stanje u korpi, tj. da postoji proizvod sa kolicinom 2.
//	Brise stavku iz korpe klikom na dugme x.
//	Verifikuje poruku za praznu korpu.
//	Osmislite pageve za ovaj zadatak!
	
	private WebDriver driver;
	private CartPage cartPage;
	private ShopPage shopPage;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		cartPage = new CartPage(driver);
		shopPage = new ShopPage(driver);
		driver.get("http://cms.demo.katalon.com/");
	}
	
	@Test 
	public void shopTest () throws InterruptedException {
		shopPage.getShopPage().click();
		shopPage.getProductPage().click();
		shopPage.getQuantity().clear();
		shopPage.getQuantity().sendKeys("2");
		shopPage.getAddToCartButton().click();
		
		Assert.assertTrue(shopPage.isProductAdded(), "Product is not added!!!");
		shopPage.getViewCartButton().click();
		
		Assert.assertTrue(cartPage.isProductQuantityEqual(), "Product quantity is not equal!");
		cartPage.getRemoveButton().click();
		Assert.assertTrue(cartPage.isCartEmpty(), "Cart is not empty");
	}
	
	@AfterMethod
	public void after() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


}

