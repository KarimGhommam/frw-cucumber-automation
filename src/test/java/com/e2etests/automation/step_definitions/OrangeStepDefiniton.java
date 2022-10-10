package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.OrangePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeStepDefiniton {

	private OrangePage orangePage;

	public OrangeStepDefiniton() {
		this.orangePage = new OrangePage();
	}

	@Given("Je me connecte au site Orange")
	public void jeMeConnecteAuSiteOrange() throws InterruptedException {
		orangePage.goToUrl();
		Thread.sleep(3000);
	}

	@When("Je saisie mon userName {string}")
	public void jeSaisieMonUserName(String userName) {
		orangePage.fillUserName(userName);
	}

	@When("Je saisie mon password {string}")
	public void jeSaisieMonPassword(String password) {
		orangePage.fillPassword(password);
	}

	@When("Je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin() {
		orangePage.clickOnBtnSubmit();

	}

	@Then("Je me redirige vers mon compte")
	public void jeMeRedirigeVersMonCompte() {

	}

	@When("Je clique sur icone du proprietaire du compte")
	public void jeCliqueSurIconeDuProprietaireDuCompte() throws InterruptedException {
		orangePage.clickOnprofile();
		Thread.sleep(3000);
	}

	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout()  {
		orangePage.clickOnlogout();
		
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {

	}

}
