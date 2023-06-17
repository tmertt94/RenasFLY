package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class Account_Login extends CommonMethods {



    @Then("User clicks login button on header")
    public void user_clicks_login_button_on_header() {
          accountPage.setLoginButtonOnHeader();
    }
    @Then("User enters email and password with valid credentials")
    public void user_enters_email_and_password_with_valid_credentials() {
        accountPage.setValidCredentials();
    }
    @Then("User clicks login button after added valid credentials")
    public void user_clicks_login_button_after_added_valid_credentials() {
        accountPage.setLoginButtonOnBottom();
    }
    @Then("User verifies first name on header")
    public void user_verifies_first_name_on_header() {
       accountPage.verifyAccountName();
    }
}
