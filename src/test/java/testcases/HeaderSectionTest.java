package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import screens.HeaderSection;
import screens.LoginPage;

public class HeaderSectionTest extends TestBase{
	HeaderSection headerSection;
	LoginPage loginPage;
	
	public HeaderSectionTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		headerSection = new HeaderSection();
	}
	
	@Test
	public void clickOnLoginTest() throws IOException, InterruptedException {
	loginPage = headerSection.clickOnLogin();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
