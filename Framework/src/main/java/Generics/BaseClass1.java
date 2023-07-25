package Generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.PomUdemy;

public class BaseClass1 implements Values {

	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get(Udemyurl);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		PomUdemy pm = PageFactory.initElements(driver, PomUdemy.class);
		pm.loggedIn();
		Thread.sleep(1000);
		//pm.enterDetails();
	}
	
	@AfterMethod
	public void afterMethod() {
		//PomUdemy pm1 = PageFactory.initElements(driver, PomUdemy.class);
		//pm1.profile();
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
