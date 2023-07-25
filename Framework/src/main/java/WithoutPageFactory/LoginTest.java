package WithoutPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest implements Values {
public static LoginPage login;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Launch ChromeBrowser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		//Open the URL
		driver.get(url);
		driver.manage().window().maximize();
		
		//Create Object of LoginPage
		
		login = new LoginPage(driver);
		login.enterUsername();
		Thread.sleep(2000);
		login.enterPassword();
		Thread.sleep(2000);
		login.clickloginbutton();
		Thread.sleep(2000);
		login.validate();
		Thread.sleep(2000);
		login.clickburgerbutton();
		Thread.sleep(2000);
		login.validate1();
		Thread.sleep(2000);
		login.logout();	
	}
}