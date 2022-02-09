package d07_02_2022_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	private WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductQuantityEqual() {
		boolean isProductQuantityEqual = false;
		try {
			String value = driver.findElement(By.xpath("//input[@title='Qty']")).getAttribute("value");
			if (value.equals("2")) {
				isProductQuantityEqual = true;
			}

		} catch (Exception e) {
			isProductQuantityEqual = false;
		}
		return isProductQuantityEqual;

	}

	public WebElement getRemoveButton() {
		return driver.findElement(By.xpath("//*[@class='remove']"));
	}

	public boolean isCartEmpty() {
		try {
			driver.findElement(By.xpath("//*[contains (@class, 'cart-empty')]"));
			return true;

		} catch (Exception e) {
			System.out.println("Cart is not empty!!!");
			return false;
		}
	}

}
