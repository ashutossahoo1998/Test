package WithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PomClass1 extends CaseStudy1 implements Values {
	
	public WebDriver driver;
	//Declaration
	By genderClick = By.xpath("//label[text()='Male']");
	By firstName = By.name("FirstName");
	By lastName = By.name("LastName");
	By email = By.name("Email");
	By password = By.name("Password");
	By cpassword = By.name("ConfirmPassword");
	By registerbtn = By.xpath("//button[text()='Register']");
	By ValidateRegister = By.xpath("//div[text()='Your registration completed']");
	By clickContinue = By.xpath("//a[text()='Continue']");
	By clickElectronics = By.xpath("//a[text()='Electronics '] ");
	
	//Initialization
	public PomClass1(WebDriver driver1){
		this.driver = driver1;
	}
	
	//Utilization
	public void clickGender() {
		if(driver.findElement(genderClick).isDisplayed()) {
			driver.findElement(genderClick).click();
		}
	}
	public void setFirstName() throws Exception {
		driver.findElement(firstName).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 5, 1));
	}
	public void setLastName() throws Exception {
		driver.findElement(lastName).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 6, 1));
	}
	public void setDay() {
		Select drp;
		drp = new Select(driver.findElement(By.name("DateOfBirthDay")));
		drp.selectByValue("5");
	}
	public void setMonth() {
		Select drp;
		drp = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		drp.selectByIndex(5);
	}
	public void setYear() {
		Select drp;
		drp = new Select(driver.findElement(By.name("DateOfBirthYear")));
		drp.selectByVisibleText("1998");
	}
	public void setEmail() throws Exception {
		driver.findElement(email).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 7, 1));
	}
	public void setPassword() throws Exception {
		driver.findElement(password).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 8, 1));
		Thread.sleep(2000);
		driver.findElement(cpassword).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 9, 1));
	}
	public void validateRegister() {
		if(driver.findElement(registerbtn).isDisplayed()) {
			driver.findElement(registerbtn).click();
		}
	}
	public void validation() throws Exception {
		if(driver.findElement(ValidateRegister).isDisplayed()) {
			System.out.println("Validated Successfully");
		}
		else {
			System.out.println("Validated Unsuccessfully");
		}
		Thread.sleep(1000);
		if(driver.findElement(clickContinue).isDisplayed()) {
			driver.findElement(clickContinue).click();
			System.out.println("Clicked Successfully");
		}
		else {
			System.out.println("Clicked Unsuccessfully");
		}
	}
	public void click() throws Exception {
		if(driver.findElement(clickElectronics).isDisplayed()) {
			System.out.println("Displayed Successfully");
			Thread.sleep(1000);
			driver.findElement(clickElectronics).click();
		}
	}
}