package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Generics.BaseClass;
import Generics.Values;
import WithoutPageFactory.ExcelData;

public class PomEdureka extends BaseClass implements Values {
	public WebDriver driver;
	
	//Declaration
	
	@FindBy(how=How.XPATH,using = "//span[text()='Log In']")
	private WebElement clicklogin;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement clickloginbtn;
	
	@FindBy(xpath="(//input[@name='data[User][email]'])[2]")
	private WebElement enterEmail;
	
	@FindBy(xpath= "(//input[@name='data[User][password]'])[2]")
	private WebElement enterPassword;
	
	@FindBy(xpath= "//button[@class='No thanks']")
	private WebElement clickdeny;
	
	@FindBy(xpath="/html/body/header/nav/div[4]/ul/li[6]/a/span[1]")
	private WebElement clickEdureka;
	
	@FindBy(xpath="//a[normalize-space()='My Profile']")
	private WebElement clickprofile;
	
	@FindBy(xpath="//a[@id='personal_details']//i[@class='icon-pr-edit']")
	private WebElement click;
	
	@FindBy(name="fullname")
	private WebElement fullname;
	
	@FindBy(xpath="(//span[normalize-space()='7-10 years'])[1]")
	private WebElement experience;
	
	@FindBy(xpath="//li[normalize-space()='4-7 years']")
	private WebElement years;

	@FindBy(xpath="//span[normalize-space()='IT-Software / Software Services'] ")
	private WebElement industry;
	
	@FindBy(xpath="//li[normalize-space()='Consulting']")
	private WebElement industryselect;
	
	@FindBy(xpath="//input[@id='designation']")
	private WebElement designation;
	
	@FindBy(xpath="//span[text()='Select ']")
	private WebElement clickselect;
	
	@FindBy(xpath="//li[normalize-space()='09:00 AM']")
	private WebElement clickfromtime;
	
	@FindBy(xpath="//li[normalize-space()='11:00 AM']")
	private WebElement clicktotime;
	
	@FindBy(xpath="//button[text()='Save and Continue']")
	private WebElement clicksave;
	
	@FindBy(xpath="(//a[text()='Blog'])[2]")
	private WebElement clickblog;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement clickhome;
	
	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement clicklogout;
	
	@FindBy(xpath = "//button[text()='Allow']")
	private WebElement allow;

	//Initialization
	public PomEdureka(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void signUp() throws Exception {
		
		clicklogin.click();
		enterEmail.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 10, 1));
		Thread.sleep(1000);
		enterPassword.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 11, 1));
		Thread.sleep(1000);
		clickloginbtn.click();
	}
	
	public void myProfile() throws Exception {
		Thread.sleep(2000);
		clickEdureka.click();
		//clickEdureka.sendKeys(Keys.DOWN);
		clickprofile.click();
		Thread.sleep(1000);
		click.click();
		Thread.sleep(4000);
		fullname.clear();
		Thread.sleep(2000);
		fullname.sendKeys(ExcelData.fetchdata(excelfilepath, excelsheetname, 12, 1));
	}
		public void update() throws Exception {
		experience.click();
		years.click();
		clickdeny.click();
		Thread.sleep(2000);
		//clickdeny.click();
		//Thread.sleep(2000);
		industry.click();
		Thread.sleep(1000);
		industryselect.click();
		Thread.sleep(3000);
		designation.sendKeys("Software Tester");
		clickselect.click();
		clickfromtime.click();
		clicktotime.click();
		clicksave.click();
		clickblog.click();
		clickhome.click();
		clickEdureka.click();
		clickEdureka.sendKeys(Keys.DOWN);
		clicklogout.click();
		}
}