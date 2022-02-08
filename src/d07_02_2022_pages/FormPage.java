package d07_02_2022_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
//	Zadatak
//	Skinite form.html stranicu (iz ovog foldera za domaci) na svom racunaru i otvorite je u pretrazivacu, 
//	iskopirajte url stranice
//		Od klasa je potrebno:
//	FormPage koja ima:
//	getere za sve inpute
//	geter za radio - //*[@name='gender'][@value='"+ radioValue +"'] - kao parametar prima value (male/female/middle) 
//	tog radio dugmeta
//	geter za checkbox inpute - //*[@type='checkbox'][@value='"+ checkboxValue +"']  - kao parametar prima value 
//	(read_books, online_courses, opensource, tech_cons, tech_blogs, via_delivery - jednu od ovde navedenih) tog 
//	checkbox inputa
//	getter koji hvata dugme treba da ceka da element postane klikabilan pre nego sto vrati element. 
//	Koristite waiter za ovaj slucaj.
//	metodu koja vraca da li su podaci uspesno sacuvani, tako sto proverava da li element koji nosi poruku za 
//	atribut style ima vrednost "visibility: visible"
	
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
	public WebElement getGenderRadio (String radioValue) {
		return driver.findElement(By.xpath("//*[@name='gender'][@value='" + radioValue + "']"));
	}
	
	public WebElement getCheckboxInput (String checkboxValue) {
		return driver.findElement(By.xpath("//*[@type='checkbox'][@value='"+ checkboxValue + "']"));
	}
	public boolean isDataSaved () {
		boolean isDataSaved = false;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains (@class, 'poruka')]")));
				
					isDataSaved = true;
				
		} catch (Exception e) {
			isDataSaved = false;
		}
		return isDataSaved;
	}


}


