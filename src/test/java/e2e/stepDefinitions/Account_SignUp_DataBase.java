package e2e.stepDefinitions;

import e2e.utils.CommonMethods;
import io.cucumber.java.en.Then;

import java.sql.SQLException;

public class Account_SignUp_DataBase extends CommonMethods {




    @Then("Verify that user is created in Database")
    public void verify_that_user_is_created_in_database() throws SQLException {
          dataBase.verifyDB();
    }

}
