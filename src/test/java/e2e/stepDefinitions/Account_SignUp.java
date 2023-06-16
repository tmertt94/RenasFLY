package e2e.stepDefinitions;

import e2e.pages.AccountPage;
import e2e.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Account_SignUp extends CommonMethods {


    @Given("User navigates to website and verify title as {string}")
    public void user_navigates_to_website_and_verify_title_as(String expectedTitle) {

        Assert.assertEquals(expectedTitle,homePage.getHomePageTitle());

    }
    @When("User verify Home Page header title as {string}")
    public void user_verify_home_page_header_title_as(String expectedHeaderText) {

        Assert.assertEquals(expectedHeaderText,homePage.getSearchFlightText());

    }
    @Then("User clicks Sign Up button and verifies signup page header as {string}")
    public void user_clicks_sign_up_button_and_verifies_signup_page_header_as(String expectedSignUpHeaderTitle) {

        accountPage.setSignUpButton();
        Assert.assertEquals(expectedSignUpHeaderTitle,accountPage.signUpTextOnHeader());

    }
    @Then("User fills up signup form")
    public void user_fills_up_signup_form() {
        accountPage.setFirstName();
        accountPage.setLastName();
        accountPage.setEmail();
        accountPage.setPhoneNumber();
        accountPage.setUserPassword();
        accountPage.setGetUserPasswordRepeat();
        accountPage.setGender();


    }
    @Then("User clicks signUp button")
    public void user_clicks_sign_up_button() {
       accountPage.setSignUpOnBottom();
    }
    @Then("User verify success message as {string}")
    public void user_verify_success_message_as(String expectedAlertMessage) {
          Assert.assertEquals(expectedAlertMessage,accountPage.setAlertSuccessMessage());
    }
}
