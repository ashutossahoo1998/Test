package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import Generics.BaseTest4;
import Generics.Values;

public class PomCheckout2 extends BaseTest4 implements Values {
	public WebDriver driver;
	//Declaration
    
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	private WebElement lightclick;

	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement clickadd;

	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement clickbag;

	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement clickshirt;

	@FindBy(xpath="//div[@class='inventory_details_price']")
	private WebElement pricetag;

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocartno;

	@FindBy(xpath="//button[text()='Remove']")
	private WebElement clickremove;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement clickcheckout;

	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement clickcontinue;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement clickfinish;
	
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement validateorder;
	
	@FindBy(xpath="//button[text()='Back Home']")
	private WebElement backhome;
	
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement validatetitle;
	
	@FindBy(xpath="//span[text()='Checkout: Overview']")
	private WebElement validatetext;
	
	@FindBy(xpath="//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")
	private WebElement textvalidate;

	//Initialization
	public PomCheckout2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public void checkoutend() throws InterruptedException {

		lightclick.click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		clickadd.click();
		String cprice = pricetag.getText(); 
		String eprice = "$9.99";
		System.out.println(cprice);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		clickbag.click();
		String cpricebag = pricetag.getText();
		String epricebag = "$29.99";
		System.out.println(cpricebag);
		Thread.sleep(1000);
		clickadd.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		clickshirt.click();
		Thread.sleep(1000);
		String cpriceshirt = pricetag.getText();
		String epriceshirt = "$15.99";
		System.out.println(cpriceshirt);
		clickadd.click();
		Thread.sleep(1000);
		String no = addtocartno.getText();
		System.out.println(no);
		addtocartno.click();
		Thread.sleep(2000);
		/*List<WebElement> we = driver.findElements(By.xpath("//div[@class='cart_quantity']"));
		System.out.println(we.size());
		for(WebElement list:we) {
			if(rate<29.99) {
			clickremove.click();
		}*/
		if(cprice.equals(eprice)) {	
			clickremove.click();
			System.out.println("Removed Successfully");
		}
		else {
			System.out.println("Removed Unsuccessfully");
		}
		Thread.sleep(2000);
		if(cpriceshirt.equals(epriceshirt)) {
			clickremove.click();
			System.out.println("Removed Successfully");
		}
		else {
			System.out.println("Removed Unsuccessfully");
		}
		Thread.sleep(2000);
		clickcheckout.click();
		Thread.sleep(2000);
		firstname.sendKeys("Ashutos");
		Thread.sleep(1500);
		lastname.sendKeys("Sahoo");
		Thread.sleep(2000);
		postalcode.sendKeys("751018");
		Thread.sleep(2000);
		clickcontinue.click();
		Thread.sleep(2000);
		String overview = validatetext.getText();
		System.out.println(overview);
		clickfinish.click();
		String validate = validateorder.getText();
		System.out.println(validate);
		String Text = textvalidate.getText();
		System.out.println(Text);
		Thread.sleep(2000);
		backhome.click();
	}
}
