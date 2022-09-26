package com.e2etests.automation.step_definitions;



import org.junit.Assert;

import com.e2etests.automation.page_objects.RegistrationPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinition {
	
	private RegistrationPage registrationPage;
	
	public RegistrationStepDefinition() {
		this.registrationPage = new RegistrationPage();
	}


	@Given("Je me connecte sur lapplication Mercury")
	public void jeMeConnecteSurLapplicationMercury() {
		registrationPage.goToUrl();
	}
	@When("Je click sur le lien register")
	public void jeClickSurLeLienRegister() {
		registrationPage.clickOnRegistrationLink();
	}
	@When("Je saisie le firstname {string}")
	public void jeSaisieLeFirstname(String firstName) {
		registrationPage.fillFirstName(firstName);
	}
	@When("Je saisie lastname {string}")
	public void jeSaisieLastname(String lastName) {
		//registrationPage.fillLastName(lastName);
	}
	@When("Je saisie phone {string}")
	public void jeSaisiePhone(String phone) {
		registrationPage.fillPhone(phone);
	}
	@When("Je saisie email {string}")
	public void jeSaisieEmail(String email) {
		registrationPage.fillEmail(email);
	}
	@When("Je saisie adresse {string}")
	public void jeSaisieAdresse(String address) {
		registrationPage.fillAddress(address);
	}
	@When("Je saisie city {string}")
	public void jeSaisieCity(String city) {
		registrationPage.fillCity(city);
	}
	@When("Je saisie provance {string}")
	public void jeSaisieProvance(String province) {
		registrationPage.fillProvince(province);
	    
	}
	@When("Je saisie postal code {string}")
	public void jeSaisiePostalCode(String postalCode) {
		registrationPage.fillPostalCode(postalCode);
	}
	@When("Je selectionne country {string}")
	public void jeSelectionneCountry(String country) {
		registrationPage.selectCountry(country);
	}
	@When("Je saisie username {string}")
	public void jeSaisieUsername(String name) throws InterruptedException {
		registrationPage.fillUserName(name);
	}
	
	@When("Je saisie une premiere fois password {string}")
	public void jeSaisieUnePremiereFoisPassword(String password) {
		registrationPage.fillPassword(password);
	}

	@When("Je confirm password {string}")
	public void jeConfirmPassword(String password) {
		registrationPage.fillConfirmPassword(password);
	}
	@When("Je clique sur le boutton soumettre")
	public void jeCliqueSurLeBouttonSoumettre() {
		registrationPage.clickOnsubmitRegistration();
	}
	@Then("Je me redirige vers la page register_succes {string}")
	public void jeMeRedirigeVersLaPageRegisterSucces(String text) {
		String message = RegistrationPage.messageRegistration.getText();
		Assert.assertEquals(text, message);
	}



	


}
