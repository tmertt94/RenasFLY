package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class Account_Login_API extends CommonMethods {



    @Then("User add request payload for Login")
    public void user_add_request_payload_for_login() {
     apiWorkFlow.setApiBodyForLogin();
    }
    @Then("User sends the request for Login")
    public void user_sends_the_request_for_login() {
      apiWorkFlow.sendRequestForLogin();
    }
    @Then("User verifies status code for Login as {int}")
    public void user_verifies_status_code_for_login_as(Integer expectedStatusCode) {
        apiWorkFlow.verifyPayloadLogin(expectedStatusCode);

    }
}
