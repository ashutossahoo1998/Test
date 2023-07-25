package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Generics.BaseTest7;
import Generics.ExcelData1;
import Generics.Values;

public class PomStudy6 extends BaseTest7 implements Values {

	public WebDriver driver;
	//Declaration
	@FindAll(
			{
				@FindBy(how=How.ID,using = "gender-male"),
				@FindBy(name="Gender")
			}
			)	
	private WebElement gender;
	@FindBy(how=How.ID,using = "FirstName")
	private WebElement firstName;
	@FindBy(how=How.NAME,using = "LastName")
	private WebElement lastName;
	@FindBy(how=How.XPATH, using = "//input[@name='Email']")
	private WebElement email;
	@FindBy(how=How.NAME,using="Password")
	private WebElement Password;
	@FindBy(how=How.ID,using = "ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(how=How.ID,using = "register-button")
	private WebElement registerbtn;
	@FindBy(how=How.XPATH,using = "//div[text()='Your registration completed']")
	private WebElement textvalidate;
	@FindBy(how=How.XPATH,using = "//a[text()='Electronics ']")
	private WebElement clickElectronics;
	@FindBy(how=How.XPATH,using = "//a[text()='Continue']")
	private WebElement clickContinue;
	
	//Initialization
	public PomStudy6(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void clickgender() throws Exception {
		gender.click();
	}
	public void setName() throws Exception {
		firstName.sendKeys(ExcelData1.fetchDatafromExcel(excelfilepath, excelsheetname, 5, 1));
	}
	public void setLastName() throws Exception {
		lastName.sendKeys(ExcelData1.fetchDatafromExcel(excelfilepath, excelsheetname, 6, 1));
	}
	public void setDate() throws Exception {
		Select drp;
		drp= new Select(driver.findElement(By.name("DateOfBirthDay")));
		drp.selectByValue("5");
		Thread.sleep(1000);
	}
		public void setMonth() throws Exception {
		Select drp1;
		drp1= new Select(driver.findElement(By.name("DateOfBirthMonth")));
		drp1.selectByIndex(5);
		Thread.sleep(1000);
		}
		public void setYear() {
		Select drp2 = new Select(driver.findElement(By.name("DateOfBirthYear")));
		drp2.selectByVisibleText("1998");
	}
	public void setemail() throws Exception {
		email.sendKeys(ExcelData1.fetchDatafromExcel(excelfilepath, excelsheetname, 7, 1));
	}
	public void setPassword() throws Exception {
		Password.sendKeys(ExcelData1.fetchDatafromExcel(excelfilepath, excelsheetname, 8, 1));
		Thread.sleep(2000);
		confirmPassword.sendKeys(ExcelData1.fetchDatafromExcel(excelfilepath, excelsheetname, 9, 1));
	}
	public void clickregister() {
		registerbtn.click();
	}
	public boolean GetText() {
		return textvalidate.getText().contains("Your registration completed");
	}
	
	public void validate() {
		if(textvalidate.isDisplayed()) {
			System.out.println("Displayed Successfully");
		}
		else {
			System.out.println("Displayed Unsuccessfully");
		}
		if(clickContinue.isDisplayed()) {
			System.out.println("Displayed Successfully");
			clickContinue.click();
		}
		else {
			System.out.println("Displayed Unsuccessfully");
		}
	}
	public boolean validate1() {
		if(clickElectronics.isDisplayed()) {
			System.out.println("Displayed Successfully");
			clickElectronics.click();
		}
	else {
		System.out.println();
	}
		return true;
		}
}