package e2e.pages.Taylan_1;

import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {


    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//button//a)[1]")
    private WebElement loginButton;

    @FindBy(xpath = "//li[@id='dropdownMenuLink']")
    private WebElement dropdownButtonNavigationBar;

    @FindBy(xpath = "(//div[@class='dropdown-menu show']//a)[2]")
    private WebElement myProfileButton;


    public void openLoginPage()
    {
        loginButton.click();
    }

    public void OpenMyProfilePage()
    {
        dropdownButtonNavigationBar.click();
        myProfileButton.click();
    }

}
