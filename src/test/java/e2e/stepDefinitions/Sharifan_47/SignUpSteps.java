package e2e.stepDefinitions.Sharifan_47;

import com.github.javafaker.Faker;
import e2e.Sharifan_47pages.SignUpPage;


import e2e.utils.CommonMethods;
import e2e.utils.ConfigReader;

import e2e.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;


public class SignUpSteps extends CommonMethods {
    SignUpPage SignUpPage=new SignUpPage();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Given("the user is on the SignUp page")
    public void the_user_is_on_the_sign_up_page() {
       SignUpPage.ClickSignup();


    }
    @When("they enter valid values for First Name, Last Name, Email, Phone, Password, Password Repeat, and Gender")
    public void they_enter_valid_values_for_first_name_last_name_email_phone_password_password_repeat_and_gender() throws InterruptedException {
        SignUpPage.enterFirstName(faker.name().firstName());
        SignUpPage.enterLastName(faker.name().lastName());
        SignUpPage.enterEmail(faker.internet().emailAddress());
        SignUpPage.enterPhoneNumber(faker.phoneNumber().cellPhone());
        String password = faker.internet().password(8,16,true,false,true);

        SignUpPage.enterPassword(password);
        SignUpPage.repeatPassword(password);

        js.executeScript("window.scrollBy(0, 500);");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.implicitly_wait));
        SignUpPage.clickFemaleButton();



    }
    @When("they click the Sign Up button")
    public void they_click_the_sign_up_button() {
        SignUpPage.SingUpButton();


    }
    @Then("they should see a {string} banner message with a green background color")
    public void they_should_see_a_banner_message_with_a_green_background_color(String string) {
        Assert.assertTrue(SignUpPage.isUserCreatedMessageVisible());

    }



}
