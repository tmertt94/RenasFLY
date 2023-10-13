package e2e.Sharifan_47pages;

import e2e.utils.CommonMethods;
import groovyjarjarantlr.CommonAST;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.=' Login']")
    private WebElement loginClick;

    @FindBy(xpath = "//input[@name='userEmail']")
    private WebElement userEmail;
    @FindBy(xpath = "//input[@name='userPassword']")
    private WebElement userPassword;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement loginButton;
    @FindBy(xpath = "//h1[.='Search Flight']")
    private WebElement SearchFlightMessage;

    public void ClickLogin(){
        loginClick.click();
    }

    public void UserEmail(String username){
        this.userEmail.sendKeys(username);

    }


    public void UserPassword(String password) {
          userPassword.sendKeys("password");

    }

    public void LoginButton() {
        loginButton.click();

    }
    public boolean isSearchFlightMessageVisible(){
        return this.SearchFlightMessage.isDisplayed();
    }
}
