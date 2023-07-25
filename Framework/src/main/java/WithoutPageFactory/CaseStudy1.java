package WithoutPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 implements Values {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.get(url1);
		driver.manage().window().maximize();
		
		PomClass1 pom = new PomClass1(driver);
		pom.clickGender();
		Thread.sleep(2000);
		pom.setFirstName();
		Thread.sleep(2000);
		pom.setLastName();
		pom.setDay();
		Thread.sleep(2000);
		pom.setMonth();
		Thread.sleep(2000);
		pom.setYear();
		Thread.sleep(2000);
		pom.setEmail();
		pom.setPassword();
		Thread.sleep(2000);
		pom.validateRegister();
		Thread.sleep(2000);
		pom.validation();
		Thread.sleep(2000);
		pom.click();
	}

}
