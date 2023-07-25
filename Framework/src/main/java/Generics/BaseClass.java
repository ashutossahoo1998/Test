package Generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.PomEdureka;

public class BaseClass implements Values {
	public WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		driver.get(Edurekaurl);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() throws Exception {
		PomEdureka pm = PageFactory.initElements(driver, PomEdureka.class);
		pm.signUp();
	}
	@AfterMethod
	public void afterMethod() throws Exception {
		PomEdureka pn = PageFactory.initElements(driver, PomEdureka.class);
		pn.myProfile();
		Thread.sleep(1000);
		pn.update();
		System.out.println("Successfully Executed");
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}