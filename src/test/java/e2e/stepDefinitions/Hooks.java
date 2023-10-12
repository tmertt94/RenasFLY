package e2e.stepDefinitions;




import e2e.pages.Taylan_1.PageInitializer;
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


    //We have hooks class because we need to have pre-setup of scenarios and closing driver. We have to have it
    //under stepsDefintions package so that we dont need to extend it to any other class. Since cucumber is present class/
    //Cucumber will automatically detect it.




}
