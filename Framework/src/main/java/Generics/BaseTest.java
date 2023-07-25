package Generics;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Values {
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openbrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {

			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get(url);
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.get(url); 
		}
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
