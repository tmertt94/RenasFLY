package e2e.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Taylan_1",
        glue = "e2e/stepDefinitions",
        tags = "@Regression_1",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/failed.text"
        }
)

public class RunnerClassTest {
}
