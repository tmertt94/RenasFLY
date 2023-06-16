package e2e.stepDefinitions;

import e2e.pages.AccountPage;
import e2e.pages.HomePage;

public class PageInitializer {


    public static AccountPage accountPage;
    public static HomePage homePage;



    public static void initializeObjects() {
        accountPage = new AccountPage();
        homePage = new HomePage();
    }
}
