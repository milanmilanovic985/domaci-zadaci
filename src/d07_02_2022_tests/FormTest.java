package d07_02_2022_tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d07_02_2022_pages.FormPage;

public class FormTest {
//	FormTest
//	Ucitava stranicu
//	Popunite formu proizvoljnim podacima
//	Submitujte formu 
//	Proverite da li su podaci uspesno sacuvani. 
//	(imate metodu iz page-a koja vam vraca da li je uspesno sacuvano, iskorisite je)
//	U AfterClass metodi zatvaramo stranicu
	
	private WebDriver driver;
	private FormPage formPage;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		formPage = new FormPage(driver);
		driver.get("file:///C:/Users/Tijana/Desktop/form.html");
	}
	
	@Test (enabled = true)
	public void formTest () throws InterruptedException {
		formPage.getFullName().sendKeys("Milan Milanovic");
		formPage.getGenderRadio("male").click();;
		formPage.getDateOfBirth().sendKeys("16.10.1985");
		formPage.getEmail().sendKeys("milan@gmail.com");
		formPage.roleSelect("QA");
		formPage.getCheckboxInput("read_books").click();;
		formPage.getCheckboxInput("online_courses").click();;
		formPage.getComment().sendKeys("Test");
		Thread.sleep(3000);
		formPage.getSubmit().click();
		Assert.assertTrue(formPage.isDataSaved(), "Data is not saved!!!");
	}
	
	@AfterMethod
	public void after() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	


}

