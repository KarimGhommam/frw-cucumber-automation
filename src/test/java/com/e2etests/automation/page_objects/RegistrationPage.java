package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;



public class RegistrationPage {
	private ConfigFileReader configFileReader;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement linkRegister;
	@FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[2]/input[1]")
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
	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmitRegistration;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Lobnaster")
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

	public void fillFirstName(String name) {
		Setup.driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(Setup.driver, java.time.Duration.ofSeconds(30));
		firstName = wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys(name);
	}

	public void fillUserName(String name) throws InterruptedException {
		Thread.sleep(3000); 
		userName.sendKeys(name);
	}

	public void fillLastName(String name) {
		lastName.sendKeys(name);
	}

	public void fillAddress(String addressValue) {
		address.sendKeys(addressValue);
	}

	public void fillCity(String cityAddress) {
		city.sendKeys(cityAddress);
	}

	public void selectCountry(String country) {
		Select select = new Select(city);
		select.selectByValue(country);
	}

	public void fillEmail(String emailValue) {
		email.sendKeys(emailValue);
	}

	public void fillPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void fillConfirmPassword(String passwordValue) {
		confirmPassword.sendKeys(passwordValue);
	}

	public void fillPhone(String phoneValue) {
		phone.sendKeys(phoneValue);
	}

	public void fillPostalCode(String postaleCodeValue) {
		postalCode.sendKeys(postaleCodeValue);
	}

	public void fillProvince(String provinceValue) {
		province.sendKeys(provinceValue);
	}

}
