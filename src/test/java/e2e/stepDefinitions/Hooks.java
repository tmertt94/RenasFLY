package e2e.stepDefinitions;

import e2e.pages.Sharifan_1.PageInitializer;
import e2e.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {


    @Before
    public void initialize() {
        openAndLunchApplication();
    }
    @After
    public void teardown(Scenario scenario){

        byte[] pic;
        if (scenario.isFailed()) {
            pic = takeScreenShots("failed/" + scenario.getName());
        }else {
            pic = takeScreenShots("passed/" + scenario.getName());
        }
        scenario.attach(pic,"image/png", scenario.getName());

        PageInitializer.myProfilePage.logout();
        closeBrowser();
    }
}
