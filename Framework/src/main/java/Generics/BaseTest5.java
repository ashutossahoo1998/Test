package Generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest5 implements Values {

	public WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(url);
	}

	@BeforeMethod
	public void start() throws IOException, InterruptedException 
	{
		POM.PomClass pm = PageFactory.initElements(driver, POM.PomClass.class);
		pm.loginPage();
	}

	@AfterMethod
	public void end() throws InterruptedException
	{
		POM.PomClass pn=PageFactory.initElements(driver, POM.PomClass.class);
		pn.logout();
	}

	@AfterClass
	public void close()
	{
		driver.close();
	}


}
