package e2e.stepDefinitions.Sharifan_47;

import e2e.Sharifan_47pages.LoginPage;
import e2e.utils.CommonMethods;
import e2e.utils.ConfigReader;
import e2e.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class LoginSteps extends CommonMethods {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the Login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Browser is launched and testing started");
        loginPage.ClickLogin();

    }

    @When("the user enters valid email address and password")
    public void the_user_enters_valid_email_address_and_password() {
        loginPage.UserEmail(ConfigReader.getPropertyValue("username"));
        loginPage.UserPassword(ConfigReader.getPropertyValue("password"));

    }

    @When("the user clicks on Login button")
    public void the_user_clicks_on_login_button(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.implicitly_wait));
        loginPage.LoginButton();



    }

    @Then("the user should be redirected to the Search Flight page")
    public void the_user_should_be_redirected_to_the_search_flight_page() {
        Assert.assertTrue(loginPage.isSearchFlightMessageVisible());


    }
}
