package Generics;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.PomStudy5;

public class BaseStudy6 implements Values {
	public WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get(Testurl);
	}
	/*@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException {
		PomStudy5 pm = PageFactory.initElements(driver, PomStudy5.class);
		pm.validate();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		PomStudy5 pm1 = PageFactory.initElements(driver, PomStudy5.class);
		pm1.openAccount();
		System.out.println("Successful");
	}*/
	@AfterClass
	public void close() throws InterruptedException, IOException
	{
		PomStudy5 pm2 = PageFactory.initElements(driver, PomStudy5.class);
		//pm2.customer();
		pm2.validate();
	}
}
