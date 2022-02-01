package d28_01_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
//		Zadatak
//		Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//		Maksimizirati prozor
//		Ucitati stranicu 
//		https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
//		Dodati red podataka - jedan red u jednoj iteraciji 
//		Kliknite na dugme Add New
//		Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//		Kliknite na zeleno Add dugme
//		Na kraju programa ugasite pretrazivac.
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		int a = 4;
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//button[@class='btn btn-info add-new']")).click();
			driver.findElement(By.id("name")).sendKeys("Milan Milanovic");
			driver.findElement(By.id("department")).sendKeys("QA");
			driver.findElement(By.id("phone")).sendKeys("(060)111-222");
			driver.findElement(By.xpath("(//*[@class='add'])[" + a + "]")).click();
			
			a++;
			Thread.sleep(4000);
		}
		driver.close();
		


	}

}
