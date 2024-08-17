package screens;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CheckoutPage extends TestBase {

	// ObjectRepository:
	@FindBy(xpath = "//*[@id='logo']/a/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id='top-links']/ul/li[5]/a")
	WebElement checkoutBtn;
	
	@FindBy(xpath = "//input[@type='button']")
	WebElement addressContBtn;

	@FindBy(xpath = "//*[@id='button-shipping-address']")
	WebElement addressConfirmContBtn;
	
	@FindBy(xpath = "//*[@id='button-shipping-method']")
	WebElement shipContBtn;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement paymentCheckBox;
	
	@FindBy(xpath = "//*[@id='button-payment-method']")
	WebElement payContBtn;
	
	@FindBy(xpath = "//*[@id='button-confirm']")
	WebElement orderConfirmBtn;
	
	// Initializing the Page Objects:
	public CheckoutPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public HomePage validateOrder() throws IOException, InterruptedException {
		logo.click();
		checkoutBtn.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		addressContBtn.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		addressConfirmContBtn.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		shipContBtn.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		paymentCheckBox.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		payContBtn.click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(5000);
		orderConfirmBtn.click();
		return new HomePage();
	}

}