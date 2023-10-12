package e2e.pages.Taylan_1;

import com.github.javafaker.Faker;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static e2e.pages.Taylan_1.APIWorkFlow.userInformations;
import static e2e.utils.CommonMethods.driver;

public class MyProfilePage {
    Faker faker = new Faker();
    public MyProfilePage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h5[@class='user-name']")
    private WebElement name_surname;

    @FindBy(xpath = "//h6[@class='user-email']")
    private WebElement email;

    @FindBy(xpath = "//h6[@class='user-phone-number']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//h6[@class='user-gender']")
    private WebElement gender;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputPhone;

    @FindBy(xpath = "//input[@value='MALE']")
    private WebElement selectMale;

    @FindBy(xpath = "//input[@value='FEMALE']")
    private WebElement selectFemale;

    @FindBy(xpath = "//input[@value='OTHERS']")
    private WebElement selectOthers;

    @FindBy(xpath = "//button[@class = 'btn btn-primary me-5 ']")
    private WebElement updateButton;

    @FindBy(xpath = "//a[@class='text-white nav-link btn btn-danger underline text-light']")
    private WebElement logoutButton;


    public void MyProfilePageShowsCorrectDetails() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(name_surname.getText(), userInformations.get("userName+LastName"));
        Assert.assertEquals(email.getText(), userInformations.get("userEmail"));
        Assert.assertEquals(phoneNumber.getText(), userInformations.get("phoneNumber"));
        Assert.assertEquals(gender.getText(), userInformations.get("userGender"));
    }

    public void updateDetails(String gender) throws InterruptedException {
        userInformations.put("userEmail",faker.internet().emailAddress());
        userInformations.put("phoneNumber",faker.phoneNumber().cellPhone().replaceAll("[^0-9]",""));
        userInformations.put("userGender",gender);
        inputEmail.sendKeys(userInformations.get("userEmail"));
        inputPhone.sendKeys(userInformations.get("phoneNumber"));

        if(gender.equalsIgnoreCase("Male"))
        {
            selectMale.click();
        }else if(gender.equalsIgnoreCase("Female"))
        {
            selectFemale.click();
        }
        else {
            selectOthers.click();
        }
        Thread.sleep(3000);
        updateButton.click();

    }

    public void logout()  {
//        logoutButton.click();
    }

}
