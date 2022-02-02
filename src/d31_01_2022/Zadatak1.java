package d31_01_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
//		1.Zad
//		Napisati program koji:
//		Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//		Klikce na svaki iks da ugasi obavestenje i proverava da li se 
//		nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke 
//		(OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//		POMOC: Brisite elemente odozdo.
//		(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");
		List<WebElement> links = driver.findElements(By.xpath("//*[@class='col-md-12']//button"));
		
		for (int i = 0; i < links.size(); i++) {
			driver.findElement(By.xpath("//*[@class='col-md-12']//div[last()]//button")).click();
			Thread.sleep(3000);
			try {
				WebElement x = driver.findElement(By.xpath("(//button[@class='col-md-12']//div[last()]"));
				System.out.println("Element nije obrisan");
			} catch (Exception e) {
				System.out.println("Element je obrisan");
			}
		}
		
		for (int i = 0; i < links.size(); i++) {
			driver.findElement(By.xpath("//*[@class='col-md-12']//div[1]//button")).click();
			Thread.sleep(3000);
			try {
				WebElement x = driver.findElement(By.xpath("(//button[@class='col-md-12']//div[1]"));
				System.out.println("Element nije obrisan");
			} catch (Exception e) {
				System.out.println("Element je obrisan");
			}
		}


	}

}
