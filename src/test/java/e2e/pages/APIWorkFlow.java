package e2e.pages;

import com.github.javafaker.Faker;
import e2e.utils.APIConstants;
import e2e.utils.APIPayloadConstants;
import e2e.utils.CommonMethods;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static io.restassured.RestAssured.given;

public class APIWorkFlow extends CommonMethods {

    Faker faker = new Faker();

    String userName="";
    String userLastName="";
    String userEmail="";
    String phoneNumber="";
    String password="Password1";
    String userGender="";
    String userImage="";

    public APIWorkFlow() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "input[name='userEmail']")
    private WebElement email;
    @FindBy(css = "input[name='userPassword']")
    private WebElement userPassword;

    RequestSpecification requestSpecification;
    Response response;


    public void setAPIBodyForSignUp() {
         userName=faker.name().firstName();
         userLastName=faker.name().lastName();
         userEmail=faker.internet().emailAddress();
         phoneNumber=faker.phoneNumber().cellPhone().replaceAll("[^0-9]","");
         userGender="MALE";
         userImage=null;



        requestSpecification=given().header(APIConstants.Content_Type_Value,APIConstants.Header_Content_type)
                .body(APIPayloadConstants.SignUp(userName,userLastName,userEmail,phoneNumber,password,userGender,userImage));
    }

    public void sendRequestForSignUp() {
        response=requestSpecification.post(APIConstants.signUp);
    }

    public void verifyPayloadSignUp(Integer status) {
        System.out.println(response.body().prettyPrint());
        response.then().assertThat().statusCode(status);
        String verifyFirstNameOnResponse = response.body().jsonPath().getString("userFirstName");
        Assert.assertEquals(userName,verifyFirstNameOnResponse);
    }
    public void setApiBodyForLogin() {
        requestSpecification=given().header(APIConstants.Content_Type_Value,APIConstants.Header_Content_type).
                body(APIPayloadConstants.Login(userEmail,password));
    }
    public void sendRequestForLogin() {
        response=requestSpecification.post(APIConstants.login);
    }
    public void verifyPayloadLogin(Integer status) {
        System.out.println(response.body().prettyPrint());
        response.then().assertThat().statusCode(status);
    }

    public void loginWithUI(){
        accountPage.setLoginButtonOnHeader();
        email.sendKeys(userEmail);
        userPassword.sendKeys(password);
        accountPage.setLoginButtonOnBottom();
        Assert.assertEquals(loginPage.setAccountName(),userName);
    }

}
