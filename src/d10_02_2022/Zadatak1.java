package d10_02_2022;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1 {
//	1.Zadatak(Za vezbanje)
//	Napisati test koji otvara Google stranicu i pravi screenshot stranice. 
//	Screenshot-ove cuvati u test-screenshots folderu u okviru projekta.
	
	private WebDriver driver;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}
	
	@Test 
	public void screenshotTest () throws InterruptedException, IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File ("test-screenshots/googlescreenshot.png"));
			
		
		
	}


}


