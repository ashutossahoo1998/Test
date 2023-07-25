package Generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.PomStudy6;

public class BaseTest7 implements Values {
	public WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get(url1);
	}
	@BeforeMethod
	public void beforeMethod() throws Exception {
		PomStudy6 pm = PageFactory.initElements(driver, PomStudy6.class);
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		PomStudy6 pm4 = PageFactory.initElements(driver, PomStudy6.class);

	}
	@AfterClass
	public void afterClass() throws Exception {
		PomStudy6 pm5 = PageFactory.initElements(driver, PomStudy6.class);

	}
}