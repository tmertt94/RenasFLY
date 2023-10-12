package e2e.Sharifan_47pages;


import com.github.javafaker.Faker;
import e2e.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static e2e.pages.Taylan_1.APIWorkFlow.userInformations;


public class SignUpPage extends CommonMethods {
    Faker faker = new Faker();

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }


    // private static final Logger logger = Logger.getLogger(LoginPage.class);

    @FindBy(xpath = "//button[@type='button']")
    private WebElement signUp;

    @FindBy(xpath = "//input[@name='userFirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='userLastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='userEmail']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@name='userPhoneNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='userPassword']")
    private WebElement Password;

    @FindBy(xpath = "//input[@name='userPasswordRepeat']")
    private WebElement repeatPassword;

    @FindBy(xpath = "//input[@value='MALE']")
    private WebElement chooseMale;

    @FindBy(xpath = "//button[@class='btn btn-primary mt-3']")
    private WebElement signupButton;



    public void ClickSignup() {
        signUp.click();
    }

    public void Info() throws InterruptedException {

        firstName.sendKeys("asaa");
        lastName.sendKeys("amsa");
        emailAddress.sendKeys("sada@gmail.com");
        phoneNumber.sendKeys("5221433455");
        Password.sendKeys("Aq133411");
        repeatPassword.sendKeys("Aq133411");
        chooseMale.click();
        Thread.sleep(3000);
    }
        public void clickSignUpButton() {

            signupButton.click();




    }




    @FindBy(xpath = "//input[@name='userEmail']")
    private WebElement userEmail;
    @FindBy(xpath = "//input[@name='userPassword']")
    private WebElement userPassword;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement loginButton;

    public void setUserEmail(String username) throws InterruptedException {
        //if (!username.isEmpty()) {
        // logger.error("username is empty. Please check the value you provided");
        // logger.info("Please check if you provided username correctly");
        //  staticWait(5);


        userEmail.sendKeys("username");
        Thread.sleep(3000);
    }



    public void setUserPassword(String password) throws InterruptedException {
        userPassword.sendKeys("password");
        Thread.sleep(3000);

    }
    public void setLoginButton() throws InterruptedException {

        loginButton.click();
        Thread.sleep(3000);

    }








}
