package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class OrangePage {

	private ConfigFileReader configFileReader;
	
	/* @FindBy */
	@FindBy(how = How.NAME, using = "username") 
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password") 
	public static WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']") 
	public static WebElement btnSubmit;
	@FindBy(how = How.XPATH, using = "//img[@alt='profile picture']") 
	public static WebElement profile;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]") 
	public static WebElement logout;
	
	public OrangePage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Create Method */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url.orange"));
	}
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void clickOnBtnSubmit() {
		btnSubmit.click();
	}
	public void clickOnprofile() {
		profile.click();
	}
	
	public void clickOnlogout() {
		logout.click();
	}
	
}
