package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegistrationPage {
	private ConfigFileReader configFileReader;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement linkRegister;
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement province;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmitRegistration;
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Note: Your user name is ')]")
	public static WebElement messageRegistration;
	


	public RegistrationPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}

	public void clickOnRegistrationLink()  {
		linkRegister.click();
		
	}

	public void clickOnsubmitRegistration() {
		
		btnsubmitRegistration.click();
	}

	public void fillFirstName(String name) throws InterruptedException {
		Thread.sleep(8000); 
		firstName.clear();
		firstName.sendKeys(name);
	}

	public void fillUserName(String name) throws InterruptedException {
		Thread.sleep(3000); 
		userName.clear();
		userName.sendKeys(name);
	}

	public void fillLastName(String name) {
		lastName.clear();
		lastName.sendKeys(name);
	}

	public void fillAddress(String addressValue) {
		address.clear();
		address.sendKeys(addressValue);
	}

	public void fillCity(String cityAddress) {
		city.clear();
		city.sendKeys(cityAddress);
	}

	public void selectCountry(String country1) throws InterruptedException {
		Thread.sleep(3000);
		Select select = new Select(country);
		select.selectByValue(country1);
	}

	public void fillEmail(String emailValue) {
		email.clear();
		email.sendKeys(emailValue);
	}

	public void fillPassword(String passwordValue) {
		password.clear();
		password.sendKeys(passwordValue);
	}

	public void fillConfirmPassword(String passwordValue) {
		confirmPassword.clear();
		confirmPassword.sendKeys(passwordValue);
	}

	public void fillPhone(String phoneValue) {
		phone.clear();
		phone.sendKeys(phoneValue);
	}

	public void fillPostalCode(String postaleCodeValue) {
		postalCode.clear();
		postalCode.sendKeys(postaleCodeValue);
	}

	public void fillProvince(String provinceValue) throws InterruptedException {
		Thread.sleep(3000); 
		province.clear();
		province.sendKeys(provinceValue);
	}

}
