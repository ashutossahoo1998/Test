package WithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class LoginPage implements Values {
	public WebDriver driver;
	//Declaration
	By username = By.name("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	By clickburgerbtn = By.xpath("//button[text()='Open Menu']");
	By about = By.xpath("//a[text()='About']");
	By logoutbtn = By.xpath("//a[text()='Logout']");
	By validatetext = By.xpath("//div[text()='Swag Labs']");
	
	//Initialization
	LoginPage(WebDriver d) {
		this.driver=d;
	}
	
	//Utilization
	public void enterUsername() throws Exception {
		driver.findElement(username).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 0, 1));
		Thread.sleep(2000);
		driver.findElement(username).sendKeys(Keys.TAB);
	}
	public boolean enterPassword() throws Exception {
		driver.findElement(password).sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 1, 1));
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(Keys.TAB);
		return true;
	}
	public boolean clickloginbutton() {
		driver.findElement(loginbtn).click();
		System.out.println("Logged in Successfully");
		return true;
	}
	public void validate() {
		if(driver.findElement(validatetext).isDisplayed()) {
			System.out.println("Validated Successfully");
		}
		else {
			System.out.println("Validated Unsuccessfully");
		}
	}
	public void clickburgerbutton() {
		driver.findElement(clickburgerbtn).click();
		System.out.println("Clicked Successfully");
	}
	public void validate1() throws Exception {
		if(driver.findElement(about).isDisplayed()) {
			System.out.println("Displayed Successfully");
			Thread.sleep(2000);
			driver.findElement(about).sendKeys(Keys.DOWN);
		}
		else {
			System.out.println("Displayed Unsuccessfully");
		}
	}
	public void logout() throws Exception {
		driver.findElement(logoutbtn).click();
		Thread.sleep(1000);
		driver.close();
	}
}