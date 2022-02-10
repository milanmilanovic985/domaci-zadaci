package d08_02_2022_tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import d08_02_2022_pages.FormPage;



public class FormTest {
//	Zadatak
//	Za potrebe zadatka kreirati FormPage koji ima sve potrebne metode.
//		Zatim kreirati FormTest koji 
//	Ucitava form.html stranicu (form.html je u folderu za domaci skinite je i otvorite u 
//			chrome i iskopirajte url)
//	I popunjava formu koristeci FormData.xlsx fajl (u folderu je za domaci)
//	Postavite odgovarajuce waitere tako da se saceka sledeci unos podataka u formu nakon submitovanja
	
	private WebDriver driver;
	private WebDriverWait wait;
	private FormPage formPage;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		formPage = new FormPage(driver);
		driver.get("file:///D:/Projekti/FAJLOVI%20ZA%20PROJEKTE/form.html");
	}
	
	@Test
	public void formTest () throws InterruptedException, IOException {
		File file = new File ("data/Podaci.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("form");
		
		
		for (int i = 1; i < 7; i++) {
			
			formPage.getFullName().sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			formPage.getGenderRadio(sheet.getRow(i).getCell(1).getStringCellValue()).click();
			formPage.getDateOfBirth().sendKeys(String.valueOf(sheet.getRow(i).getCell(2).getDateCellValue()));
			formPage.getEmail().sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
			formPage.roleSelect(sheet.getRow(i).getCell(4).getStringCellValue());
			formPage.getCheckboxInput(sheet.getRow(i).getCell(5).getStringCellValue()).click();
			formPage.getComment().sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
			formPage.getSubmit().click();
			wait.until(ExpectedConditions.invisibilityOf(formPage.getMessage()));
			driver.navigate().refresh();
		}
		
	}
	
	@AfterMethod
	public void after() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
