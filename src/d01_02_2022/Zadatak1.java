package d01_02_2022;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
//		1.Zadatak
//		Napisati program koji :
//		Ucitava stranicu https://www.udemy.com/courses/search/?src=ukw&q=slksd
//		Klikce na dugme za jezik i proverava da li se prikazuje dijalog za promenu jezika
//		Stampa u konzoli tekst “Dijalog se prikazao”
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.udemy.com/courses/search/?src=ukw&q=slksd");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//*[contains(@class, 'language-selector-button--button--1wgoL')]")));
		Thread.sleep(5000);
		driver.findElement
				(By.xpath("//*[contains(@class, 'language-selector-button--button--1wgoL')]")).click();
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated
					(By.xpath("//div[@class='language-list--multi-column--1ZNPI']")));
			System.out.println("Dijalog se prikazao.");
		} catch (Exception e) {
			System.out.println("Dijalog se nije prikazao.");
		}



	}

}
