package POM;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

import Generics.BaseTest3;
import Generics.ExcelData;
import Generics.Values;

public class PomClass extends BaseTest3 implements Values {

	//Declaration
	public WebDriver driver;

	@FindAll(
			{
				@FindBy(name="user-name"),
				@FindBy(how=How.ID,using = "user-name")
			})
	private WebElement username;
	@FindAll(
			{
				@FindBy(name="password"),
				@FindBy(how=How.ID,using = "password")
			})
	private WebElement password;

	@FindBy(name="login-button")
	@CacheLookup
	private WebElement loginbtn;

	@FindBy (xpath = "//button[text()='Open Menu']")
	private WebElement burgermenu;

	@FindBy(xpath="//a[text()='About']")
	private WebElement about;

	@FindBy(xpath = "//a[@id=\"logout_sidebar_link\"]")
	private WebElement logout;

	//Initialization
	public PomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public void loginPage() throws IOException, InterruptedException {
		//TakesScreenshot src = (TakesScreenshot) driver;
		//File sourcefile = src.getScreenshotAs(OutputType.FILE);
		//File desFile = new File("D:\\screenshot.png");
		//FileUtils.copyFile(sourcefile, desFile);

		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("D:\\Training Files/Image.png"));
		username.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 0, 1));
		Thread.sleep(2000);
		password.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 1, 1));
		Thread.sleep(2000);
		loginbtn.click();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Successfully Login");
		System.out.println("Test Excution is Completed");
	}
	public void validation() {
		String url = driver.getCurrentUrl();
		String Eurl = "https://www.saucedemo.com/";
		if(url.equals(Eurl)) {
			System.out.println("URL is Correct");
		}
		else {
			System.out.println("URL is Incorrect");
		}
		String title = driver.getTitle();
		String Etitle = "Swag Labs";
		if(title.equals(Etitle)) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Title is Incorrect");
		}
	}
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		burgermenu.click();
		Thread.sleep(2000);
		about.sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		logout.click();

	}
}