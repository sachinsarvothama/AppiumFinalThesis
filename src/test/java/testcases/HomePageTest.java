package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import screens.HeaderSection;
import screens.HomePage;
import screens.LoginPage;

public class HomePageTest extends TestBase {
	HeaderSection headerSection;
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		headerSection = new HeaderSection();
		loginPage = headerSection.clickOnLogin();
	}

	@Test(priority = 1)
	public void clickOnLogoTest() throws IOException, InterruptedException {
		homePage = loginPage.validateLogin(config.getProperty("username"), config.getProperty("password"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
