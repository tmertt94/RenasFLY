package e2e.Sharifan_47pages;



import e2e.utils.CommonMethods;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignUpPage extends CommonMethods {


    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }


    private static final Logger logger = Logger.getLogger(SignUpPage.class);

   @FindBy(xpath = "//a[@href='#/signup']")
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

    //@FindBy(xpath = "//input[@type='radio' and @value='FEMALE']")
    @FindBy(xpath = "//input[@value='FEMALE']")
    private WebElement chooseFemale;

    @FindBy(xpath = "//button[@class='btn btn-primary mt-3']")
    private WebElement signupButton;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement CreatedMessage;



    public void ClickSignup() {
        signUp.click();

    }
    public void enterFirstName(String FirstName) {
        this.firstName.sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        this.lastName.sendKeys(LastName);
    }

    public void enterEmail(String Email) {
        this.emailAddress.sendKeys(Email);
    }

    public void enterPhoneNumber (String PhoneNumber) {
        this.phoneNumber.sendKeys(PhoneNumber);
    }

    public void enterPassword (String password) {
        this.Password.sendKeys(password);
    }

    public void repeatPassword (String RepeatPassword) {
        this.repeatPassword.sendKeys(RepeatPassword);
    }

    public void clickFemaleButton() {
        this.chooseFemale.click();
    }

    public void SingUpButton(){
        this.signupButton.click();
    }


    public boolean isUserCreatedMessageVisible() {
        return this.CreatedMessage.isDisplayed();
    }

}
