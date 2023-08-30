package e2e.stepDefinitions.Taylan_1;

import e2e.pages.Taylan_1.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyProfilePage {

    @Then("the card-body shows the correct information under the profile picture")
    public void the_card_body_shows_the_correct_information_under_the_profile_picture() throws InterruptedException {
        PageInitializer.myProfilePage.MyProfilePageShowsCorrectDetails();
    }

    @When("Update the previous details with the random email , number and {string}")
    public void update_the_previous_details_with_the_random_email_number_and(String gender) throws InterruptedException {

        PageInitializer.myProfilePage.updateDetails(gender);

    }
}
