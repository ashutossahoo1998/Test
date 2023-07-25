package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generics.BaseTest4;
import Generics.ExcelData;
import Generics.Values;


public class PomCheckoutScenario extends BaseTest4 implements Values {
	
	public WebDriver driver;
	//Declaration
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement tshirt;
	
	@FindBy(xpath="//div[@class='inventory_details_price']")
	private WebElement validateprice;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocart1;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
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
	
	
	//Utilization
	public void checkout() throws InterruptedException, IOException {
		tshirt.click();
		String price = validateprice.getText();
		System.out.println(price);
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(1000);
		String text = addtocart1.getText();
		System.out.println(text);
		Thread.sleep(2000);
		addtocart1.click();
		Thread.sleep(2000);
		checkout.click();
		Thread.sleep(2000);
		firstname.sendKeys("Ashutos");
		Thread.sleep(1000);
		lastname.sendKeys("Sahoo");
		Thread.sleep(1000);
		postalcode.sendKeys("751018");
		Thread.sleep(2000);
		clickcontinue.click();
		Thread.sleep(1000);
		clickfinish.click();
		Thread.sleep(1000);
		String ordervalidate = validateorder.getText();
		System.out.println(ordervalidate);
		backhome.click();
		Thread.sleep(1000);
		String title = validatetitle.getText();
		System.out.println(title);
	}
}
