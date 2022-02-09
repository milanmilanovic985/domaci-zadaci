package d07_02_2022_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
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
	
	public ShopPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getShopPage () {
		return driver.findElement(By.xpath("//div[@id='primary-menu']//li[5]"));
	}
	public WebElement getProductPage () {
		return driver.findElement(By.xpath("//ul[contains (@class, 'columns-3')]/li"));
		
	}
	public WebElement getQuantity () {
		return driver.findElement(By.xpath("//input[@title='Qty']"));
		
	}
	public WebElement getAddToCartButton () {
		return driver.findElement(By.xpath("//button[@name='add-to-cart']"));
	}
	public boolean isProductAdded () {
		boolean isProductAdded = false;
		try {	driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText().contains("have been added to your cart");
				isProductAdded = true;
		} catch (Exception e) {
				isProductAdded = false;
		}
		return isProductAdded;
	}
	public WebElement getViewCartButton () {
		return driver.findElement(By.xpath("//div[@class='woocommerce-message']/a"));
	}


}
