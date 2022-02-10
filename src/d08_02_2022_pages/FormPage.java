package d08_02_2022_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
//	Zadatak
//	Za potrebe zadatka kreirati FormPage koji ima sve potrebne metode.
//		Zatim kreirati FormTest koji 
//	Ucitava form.html stranicu (form.html je u folderu za domaci skinite je i 
//			otvorite u chrome i iskopirajte url)
//	I popunjava formu koristeci FormData.xlsx fajl (u folderu je za domaci)
//	Postavite odgovarajuce waitere tako da se saceka sledeci unos podataka u formu nakon submitovanja

	
	private WebDriver driver;
	
	public FormPage (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getFullName () {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getDateOfBirth () {
		return driver.findElement(By.id("dob"));
	}
	public WebElement getEmail () {
		return driver.findElement(By.id("email"));
	}
	public WebElement getComment () {
		return driver.findElement(By.id("comment"));
	}
	public WebElement getSubmit () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
		return driver.findElement(By.id("submit"));
	}
	public void roleSelect (String roleValue) {
		Select dropdownRole = new Select(driver.findElement(By.id("role")));
		dropdownRole.selectByVisibleText(roleValue);
	}
	public WebElement getGenderRadio (String genderValue) {
		return driver.findElement(By.xpath("//*[@name='gender'][@value='" + genderValue + "']"));
	}
	
	public WebElement getCheckboxInput (String checkboxValue) {
		return driver.findElement(By.xpath("//*[@type='checkbox'][@value='"+ checkboxValue + "']"));
	}
	public WebElement getMessage () {
		return driver.findElement(By.xpath("//div[contains (@class, 'poruka')]"));
	}


}
