package Method;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Generics.BaseTest;
import POM.PomCheckoutScenario;
public class CaseStudy3 extends BaseTest {
	@Test
	public void checkout() throws InterruptedException, IOException {
	PomCheckoutScenario pcs = PageFactory.initElements(driver, PomCheckoutScenario.class);
	pcs.checkout();
	}
}