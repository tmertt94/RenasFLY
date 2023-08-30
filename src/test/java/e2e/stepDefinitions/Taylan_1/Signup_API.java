package e2e.stepDefinitions.Taylan_1;

import e2e.pages.Taylan_1.PageInitializer;
import io.cucumber.java.en.Given;

public class Signup_API {

    @Given("the user signUp to the app with random Name, Surname, Telephone Number, and Gender equals Male with API Request")
    public void the_user_sign_up_to_the_app_with_random_name_surname_telephone_number_and_gender_equals_male_with_api_request() {
        PageInitializer.apiWorkFlow.sendAPIRequestToSignup();
    }
}
