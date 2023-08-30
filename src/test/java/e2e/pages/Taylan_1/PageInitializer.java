package e2e.pages.Taylan_1;

import e2e.pages.*;

import java.util.Map;

public class PageInitializer {


    public static HomePage homePage;
    public static LoginPage loginPage;
    public static APIWorkFlow apiWorkFlow;
    public static MyProfilePage myProfilePage;


    public static void initializeObjects() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        apiWorkFlow = new APIWorkFlow();
        myProfilePage = new MyProfilePage();
    }
}
