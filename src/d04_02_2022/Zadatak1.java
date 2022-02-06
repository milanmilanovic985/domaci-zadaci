package d04_02_2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1 {
//	Umesto prvog za Udemy imamo kupujem prodajem.
//	Ucitajte stranicu (ako treba gasite onaj dijalog sto iskace)
//	Ukucajte za pretragu iphone
//	postavice za valutu eure
//	Sortirajte prema ceni da bude najjefinije prvo
//	Onda izvrsite proveru sortiranja kao sto je bilo za udemy
	
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.kupujemprodajem.com/");
		
		
	}
	
	@Test
	public void sortTest () throws InterruptedException {
		
		driver.findElement(By.className("kpBoxCloseButton")).click();
		driver.findElement(By.id("searchKeywordsInput")).sendKeys("Iphone");
		driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"priceSecondSelection\"]/div/div[1]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='eur']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("has_price_yes")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@value='Primeni']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='orderSecondSelection']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@data-text='Jeftinije']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains (@class, 'secondarySearchButton')]")).click();
		Thread.sleep(2000);
		List<WebElement> listaCena = driver.findElements(By.xpath("//span[@class='adPrice ']"));
		double cenaMax = 0;
		double cenaMin = 0;
		String eur = "€";
		String din = "din";
		
			String minCena = listaCena.get(0).getText();
			String maxCena = listaCena.get(listaCena.size() - 1).getText();
			if (minCena.contains(din)) {
				minCena = minCena.replaceAll(din, "");
				minCena = minCena.trim();
				double cenaDouble = new Double (minCena);
				cenaMin = cenaDouble / 118;
			} else if (minCena.contains(eur)) {
				minCena = minCena.replaceAll(eur, "");
				minCena = minCena.trim();
				double cenaDouble = new Double (minCena);
				cenaMin = cenaDouble / 118;
			}
			if (maxCena.contains(din)) {
				maxCena = maxCena.replaceAll(din, "");
				maxCena = maxCena.trim();
				double cenaDouble = new Double (maxCena);
				cenaMax = cenaDouble / 118;
			} else if (maxCena.contains(eur)) {
				maxCena = maxCena.replaceAll(eur, "");
				maxCena = maxCena.trim();
				double cenaDouble = new Double (maxCena);
				cenaMax = cenaDouble;
			}
		Assert.assertTrue(cenaMax > cenaMin, "Nije sortirano");
	
	}
	@AfterMethod
	public void afterMethod () {
		driver.quit();
	}
	
	


}


