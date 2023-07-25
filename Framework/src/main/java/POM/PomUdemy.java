package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Generics.BaseClass1;
import Generics.ExcelData;
import Generics.Values;

public class PomUdemy extends BaseClass1 implements Values {
	public WebDriver driver;

	//Declaration

	@FindBy(xpath="//span[normalize-space()='Sign up']")
	private WebElement signUp;
	
	@FindBy(xpath="(//a[normalize-space()='Log in'])[2]")
	private WebElement login;

	@FindBy(xpath="//label[@class='ctp-checkbox-label']")
	private WebElement clickCheckbox;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement clicklogin;

	@FindBy(xpath= "(//div[text()='AS'])[2]")
	private WebElement clickProfile;

	public PomUdemy(WebDriver driver1) {
		this.driver=driver1;
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver1, 30);
		//PageFactory.initElements(factory, this);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver1, 30), this);

	}

	//Utilization
	public void loggedIn() throws Exception {
		signUp.click();
		Thread.sleep(8000);
		clickCheckbox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		login.click();
	}

/*public void enterDetails() throws Exception {
	Password.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 13, 1));
	Thread.sleep(2000);
	clicklogin.click();
}*/

/*public void profile() {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
}*/
}

