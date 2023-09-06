package e2e.stepDefinitions.Taylan_1;

import e2e.pages.Sharifan_1.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePage {
    @And("the end-user landing to login page")
    public void the_end_user_landing_to_login_page() {
        PageInitializer.homePage.openLoginPage();
        PageInitializer.loginPage.loginToSystem();
    }

    @When("The end-user opens My Profile page")
    public void the_end_user_opens_my_profile_page()
    {
        PageInitializer.homePage.OpenMyProfilePage();
    }
}
