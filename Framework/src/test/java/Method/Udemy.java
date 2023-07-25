package Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.BaseClass1;
import POM.PomUdemy;

public class Udemy extends BaseClass1 {
	
	@Test
	public void test() {
		PomUdemy pm2 = PageFactory.initElements(driver, PomUdemy.class);
	}

}
