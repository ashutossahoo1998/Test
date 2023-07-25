package Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generics.BaseClass;
import POM.PomEdureka;

public class Edureka extends BaseClass {
	@Test
	public void edureka() {
		PomEdureka pom = PageFactory.initElements(driver, PomEdureka.class);
	}
}