package Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.BaseStudy6;
import POM.PomStudy5;

public class CaseStudy6 extends BaseStudy6 {
	
	@Test
	
	public void XYZ() throws InterruptedException {
		PomStudy5 pm5 = PageFactory.initElements(driver, PomStudy5.class);
	}

}
