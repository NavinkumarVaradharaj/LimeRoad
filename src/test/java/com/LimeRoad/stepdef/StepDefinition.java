package com.LimeRoad.stepdef;

import com.LimeRoad.base.BaseClass;
import com.LimeRoad.pom.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPage lp;

	@Given("User able to view the home")
	public void user_able_to_view_the_home() {
		setUp("chrome");
		launchUrl("https://www.limeroad.com/");
	}

	@When("User click the login btn")
	public void user_click_the_login_btn() {
		lp = new LoginPage();
		lp.clickLoginBtn();
	}

	@When("User enter the mobile number as {string}")
	public void user_enter_the_mobile_number_as(String string) {
		implicitWait();
		lp.enterMobileInput(string);
	}

	@Given("User able to view the home page")
	public void user_able_to_view_the_home_page() {
		setUp("chrome");
		launchUrl("https://www.limeroad.com/");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		lp = new LoginPage();
		// mouseHover(lp.getProfile_option());
		lp.clickLoginBtn();
	}

	@When("User enter the mobile number {string}")
	public void user_enter_the_mobile_number(String string) {
		implicitWait();
		lp.enterMobileInput(string);
	}

	@When("User click the next button")
	public void user_click_the_next_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enter the Otp")
	public void user_enter_the_otp() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User able to view the home page after successful login")
	public void user_able_to_view_the_home_page1() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User mousehover on Kids and click on T-shirt")
	public void user_mousehover_on_kids_and_click_on_t_shirt() {

	}

	@Then("User able to view all the related products")
	public void user_able_to_view_all_the_related_products() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("User able to view all the kids tshirts")
	public void user_able_to_view_all_the_kids_tshirts() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
