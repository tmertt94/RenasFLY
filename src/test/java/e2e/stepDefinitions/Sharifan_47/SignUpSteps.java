package e2e.stepDefinitions.Sharifan_47;

import e2e.Sharifan_47pages.SignUpPage;


import e2e.utils.CommonMethods;
import e2e.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SignUpSteps extends CommonMethods {
    SignUpPage SignUpPage=new SignUpPage();
    @Given("the user is on the SignUp page")
    public void the_user_is_on_the_sign_up_page() {
        SignUpPage.ClickSignup();

    }
    @When("they enter valid values for First Name, Last Name, Email, Phone, Password, Password Repeat, and Gender")
    public void they_enter_valid_values_for_first_name_last_name_email_phone_password_password_repeat_and_gender() throws InterruptedException {
        SignUpPage.Info();

    }
    @When("they click the Sign Up button")
    public void they_click_the_sign_up_button() {
        SignUpPage.clickSignUpButton();

    }
    @Then("they should see a {string} banner message with a green background color")
    public void they_should_see_a_banner_message_with_a_green_background_color(String string) {

    }


    @Given("the user is on the Login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Browser is launched and testing started");


       driver.get(ConfigReader.getPropertyValue("urlLogin"));




    }

    @When("the user enters valid email address and password")
    public void the_user_enters_valid_email_address_and_password() throws InterruptedException {
        SignUpPage.setUserEmail(ConfigReader.getPropertyValue("userEmail"));
       SignUpPage.setUserPassword(ConfigReader.getPropertyValue("userPassword"));
       // PageInitializer.loginPage.;
       //PageInitializer.loginPage.();


    }

    @When("the user clicks on Login button")
    public void the_user_clicks_on_login_button() throws InterruptedException {
       // setWaitTime();



      SignUpPage.setLoginButton();


    }

    @Then("the user should be redirected to the Search Flight page")
    public void the_user_should_be_redirected_to_the_search_flight_page() {
        driver.getTitle();

    }







}
