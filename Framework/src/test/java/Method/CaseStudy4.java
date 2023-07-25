package Method;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.BaseTest4;
import POM.PomCheckout2;
public class CaseStudy4 extends BaseTest4 {
	@Test
	public void checkoutlast() throws InterruptedException {
		PomCheckout2 pco = PageFactory.initElements(driver, PomCheckout2.class);
		pco.checkoutend();
	}

}
