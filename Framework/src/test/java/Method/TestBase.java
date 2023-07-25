package Method;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Generics.BaseTest3;
import POM.PomClass;

public class TestBase extends BaseTest3 {
		@Test
		public void execution() throws IOException, InterruptedException
		{
			PomClass pc = PageFactory.initElements(driver, PomClass.class);
			
		}
	}