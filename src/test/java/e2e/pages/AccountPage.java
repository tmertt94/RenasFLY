package e2e.pages;

import com.github.javafaker.Faker;
import e2e.utils.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Objects;

public class AccountPage extends CommonMethods {

    Faker faker = new Faker();
    String userName="";
    String userLastName="";
    String userEmail="";
    String phoneNumber="";

    String validPassword="Password1";


    public AccountPage() {
        PageFactory.initElements(driver,this);
    }



    @FindBy(partialLinkText = "Sign")
    private WebElement signUpButton;
    @FindBy(xpath = "//h1[.='Sign Up']")
    private WebElement signUpTextOnHeader;
    @FindBy(css = "input[name='userFirstName']")
    private WebElement firstName;
    @FindBy(css = "input[name='userLastName']")
    private WebElement lastName;
    @FindBy(css = "input[name='userEmail']")
    private WebElement email;
    @FindBy(css = "input[name='userPhoneNumber']")
    private WebElement userPhoneNumber;
    @FindBy(css = "input[name='userPassword']")
    private WebElement userPassword;
    @FindBy(css = "input[name='userPasswordRepeat']")
    private WebElement getUserPasswordRepeat;
    @FindBy(css = "div[class='form-check row '] label")
    private List<WebElement> gender;
    @FindBy(css = ".btn.btn-primary.mt-3")
    private WebElement signUpOnBottom;
    @FindBy(xpath = "//div[contains(text(),'Minimum eight characters, at least one uppercase letter, one lowercase letter, one number')]")
    private WebElement wrongPassword;
    @FindBy(css = ".alert.alert-success")
    private WebElement successAlertMessage;
    @FindBy(partialLinkText = "Login")
    private WebElement loginButtonOnHeader;
    @FindBy(css = ".btn.btn-primary.mt-2")
    private WebElement loginButtonOnBottom;


    public void setSignUpButton() {
        signUpButton.click();
    }
    public String signUpTextOnHeader() {
        return signUpTextOnHeader.getText();
    }

    public void setFirstName() {
        userName=faker.name().firstName();
        firstName.sendKeys(userName);
    }
    public void setLastName() {
        userLastName=faker.name().lastName();
        lastName.sendKeys(userLastName);
    }
    public void setEmail() {
        userEmail=faker.internet().emailAddress();
        email.sendKeys(userEmail);
    }
    public void setPhoneNumber() {
        phoneNumber=faker.phoneNumber().cellPhone().replace("-","");
        userPhoneNumber.sendKeys(phoneNumber);
    }
    public void setUserPassword() {
        userPassword.sendKeys("password1");
    }
    public void setGetUserPasswordRepeat() {
        getUserPasswordRepeat.sendKeys("password1");
    }
    public void setGender() {
        for (WebElement element:gender) {
            if (Objects.equals(element.getText(), "Female")) {
                Actions actions = new Actions(driver);
                actions.doubleClick(element).build().perform();
            }else {
                System.out.println("Radio Button is not selected");
            }
        }
    }

    public void setSignUpOnBottom() {
        signUpOnBottom.click();
    }
    public String setAlertSuccessMessage() {
        Assert.assertTrue(wrongPassword.isDisplayed());
        if (wrongPassword.isDisplayed()){
            userPassword.clear();
            userPassword.sendKeys(validPassword);
            getUserPasswordRepeat.clear();
            getUserPasswordRepeat.sendKeys(validPassword);
            signUpOnBottom.click();
        }
        return successAlertMessage.getText();
    }

    public void setLoginButtonOnHeader() {
        loginButtonOnHeader.click();
    }
    public void setValidCredentials() {
        email.sendKeys(userEmail);
        userPassword.sendKeys(validPassword);
    }

    public void setLoginButtonOnBottom() {
        loginButtonOnBottom.click();
    }
    public void verifyAccountName() {
        Assert.assertEquals(userName,loginPage.setAccountName());
    }




}
