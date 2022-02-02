package d01_02_2022;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.Zadatak
//		Napisti program koji:
//		Ucitava stranicu https://videojs.com/city
//		Pusta video klikom na play dugme
//		Cekamo da se video ucita
//		Tako sto proveravamo da li vise to play dugme nije vidljivo
//
//		Za vezbanje
//		Probajte da napisete dopunite koji ceka da se zavrsi video i ispisuje u konzoli. Video je gotov.
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://videojs.com/city");
		driver.findElement(By.xpath("//*[@id='vjs_video_3']/button")).click();
		
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='vjs_video_3']/button")));
			System.out.println("Ucitao se video");
		} catch (Exception e) {
			System.out.println("Nije se ucitao video");
		}
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='vjs_video_3']/div[4]/button[1][contains (@title, 'Replay')]")));
			System.out.println("Video je gotov");
		} catch (Exception e) {
			System.out.println("Video nije gotov");
		}


	}

}
