package POM;

import java.io.IOException;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generics.BaseStudy6;
import Generics.ExcelData;
import Generics.Values;

public class PomStudy5 extends BaseStudy6 implements Values {
	public WebDriver driver;
	//Declaration

	@FindBy(xpath="//button[text()='Bank Manager Login']")
	private WebElement clickmanager;

	@FindBy(xpath="//button[@ng-click='addCust()']")
	private WebElement addcustomer;

	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstname;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;

	@FindBy(xpath="//input[@placeholder='Post Code'][1]")
	private WebElement postalcode;

	@FindBy(xpath="//button[text()='Add Customer']")
	private WebElement clickbtn;

	@FindBy(xpath="//button[contains(text(),'Open Account')]")
	private WebElement clickaccount;

	@FindBy(xpath="//button[text()='Process']")
	private WebElement clickprocess;

	@FindBy(xpath="//input[@placeholder='Search Customer']")
	private WebElement searchCustomer;

	//Initialization
	
	public PomStudy5(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public void validate() throws InterruptedException, IOException {

		clickmanager.click();
		Thread.sleep(2000);
		addcustomer.click();
		Thread.sleep(2000);
		firstname.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 2, 1));
		Thread.sleep(2000);
		lastname.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 3, 1));
		Thread.sleep(2000);
		postalcode.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 4, 1));
		Thread.sleep(2000);
		clickbtn.click();
		Thread.sleep(2000);

		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(3000);

		System.out.println("Added Customer Successfully");
		//System.out.println(alt.getText());
	}
	/*public void openAccount() throws InterruptedException {

		clickaccount.click();
		Thread.sleep(2000);
		//WebElement wd = driver.findElement(By.id("userSelect"));
		WebElement we = driver.findElement(By.xpath("//option[text()='---Customer Name---']"));
		we.click();
		Thread.sleep(2000);
		we.sendKeys("Hermoine Granger");
		//Select se = new Select(wd);
		//se.selectByValue("Hermoine Granger");
		//Thread.sleep(2000);
		//WebElement we1 = driver.findElement(By.id("currency"));
		WebElement we1 = driver.findElement(By.xpath("//option[text()='---Currency---']"));
		we1.click();
		Thread.sleep(2000);
		we1.sendKeys("Dollar");
		
		//Select se1 = new Select(we1);
		//se1.selectByVisibleText("Dollar");
		Thread.sleep(2000);
		clickprocess.click();
		System.out.println("Opened Account Successfully");
		Thread.sleep(3000);	
	}

	public void customer() {
		searchCustomer.click();
		System.out.println("Clicked Successfully");
	}*/
}
