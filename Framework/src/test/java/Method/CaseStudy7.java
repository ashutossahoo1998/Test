package Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.BaseTest7;
import POM.PomStudy6;

public class CaseStudy7 extends BaseTest7 {

	@Test
	public void Test() throws Exception {
		PomStudy6 pom = PageFactory.initElements(driver, PomStudy6.class);
		pom.clickgender();
		Thread.sleep(2000);
		pom.setName();
		Thread.sleep(2000);
		pom.setLastName();
		Thread.sleep(1000);
		pom.setDate();
		Thread.sleep(1000);
		pom.setMonth();
		Thread.sleep(1000);
		pom.setYear();
		Thread.sleep(1000);
		pom.setemail();
		Thread.sleep(1000);
		pom.setPassword();
		Thread.sleep(1000);
		pom.clickregister();
		Thread.sleep(1000);
		pom.GetText();
		Thread.sleep(2000);
		pom.validate();
		Thread.sleep(2000);
		pom.validate1();
	}
}
