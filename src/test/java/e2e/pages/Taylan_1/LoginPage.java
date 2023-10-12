package e2e.pages.Taylan_1;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {


    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='userEmail']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='userPassword']")
    private WebElement password;

    @FindBy(xpath = "//div[@class='text-center']//button")
    private WebElement loginButton;


    public void loginToSystem()
    {
        email.sendKeys(PageInitializer.apiWorkFlow.userEmail);
        password.sendKeys(PageInitializer.apiWorkFlow.password);
        loginButton.click();
    }


}
