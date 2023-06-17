package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Account_SignUp_API extends CommonMethods {


    @Given("User add request payload")
    public void user_add_request_payload() {
       apiWorkFlow.setAPIBodyForSignUp();
    }
    @When("User send the request")
    public void user_send_the_request() {
       apiWorkFlow.sendRequestForSignUp();
    }
    @Then("User verifies status code as {int}")
    public void user_verifies_status_code_as(Integer expectedStatusCode) {
        apiWorkFlow.verifyPayloadSignUp(expectedStatusCode);
    }
    @Then("User login with UI by given credentials from API")
    public void user_login_with_ui_by_given_credentials_from_api() {
        apiWorkFlow.loginWithUI();
    }
}
