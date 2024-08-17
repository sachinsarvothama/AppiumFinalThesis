package screens;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	// ObjectRepository:
	@FindBy(xpath = "//*[@class='logo']/a")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id='menu']/div[1]/button")
	WebElement hamburgerMenu;
	
	@FindBy(linkText = "Desktops")
	WebElement desktops;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[1]/div/a")
	WebElement showAllDesktops;
	
	@FindBy(linkText = "Laptops & Notebooks")
	WebElement laptops;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[2]/div/a")
	WebElement showAllLaptops;
	
	@FindBy(linkText = "Components")
	WebElement components;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[3]/div/a")
	WebElement showAllComponents;
	
	@FindBy(linkText = "Tablets")
	WebElement tablets;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[4]/div/a")
	WebElement showAllTablets;
	
	@FindBy(linkText = "Software")
	WebElement software;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[5]/div/a")
	WebElement showAllSoftware;
	
	@FindBy(linkText = "Phones & PDAs")
	WebElement phones;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[6]/div/a")
	WebElement showAllPhones;
	
	@FindBy(linkText = "Cameras")
	WebElement cameras;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[7]/div/a")
	WebElement showAllCameras;
	
	@FindBy(linkText = "MP3 Players")
	WebElement mp3;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[8]/div/a")
	WebElement showAllMp3;
	
	// Initializing the Page Objects:
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public ProductPage validateMenu1() throws IOException {
		hamburgerMenu.click();
		desktops.click();
		showAllDesktops.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu2() throws IOException {
		hamburgerMenu.click();
		laptops.click();
		showAllLaptops.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu3() throws IOException {
		hamburgerMenu.click();
		components.click();
		showAllComponents.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu4() throws IOException {
		hamburgerMenu.click();
		tablets.click();
		showAllTablets.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu5() throws IOException {
		hamburgerMenu.click();
		software.click();
		showAllSoftware.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu6() throws IOException {
		hamburgerMenu.click();
		phones.click();
		showAllPhones.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu7() throws IOException {
		hamburgerMenu.click();
		cameras.click();
		showAllCameras.click();

		return new ProductPage();
	}
	
	public ProductPage validateMenu8() throws IOException {
		hamburgerMenu.click();
		mp3.click();
		showAllMp3.click();

		return new ProductPage();
	}

}
