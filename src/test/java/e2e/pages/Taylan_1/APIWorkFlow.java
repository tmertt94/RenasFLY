package e2e.pages.Taylan_1;

import com.github.javafaker.Faker;
import e2e.utils.APIConstants;
import e2e.utils.APIPayloadConstants;
import e2e.utils.CommonMethods;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APIWorkFlow extends CommonMethods {

    Faker faker = new Faker();
    public static Map<String,String> userInformations = new HashMap<>();
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

    RequestSpecification requestSpecification;
    Response response;


    public void sendAPIRequestToSignup() {
         userName=faker.name().firstName();
         userLastName=faker.name().lastName();
         userEmail=faker.internet().emailAddress();
         phoneNumber=faker.phoneNumber().cellPhone().replaceAll("[^0-9]","");
         userGender="MALE";
         userImage=null;
         String fullName = userName + " " +userLastName;



        requestSpecification=given().header(APIConstants.Content_Type_Value,APIConstants.Header_Content_type)
                .body(APIPayloadConstants.SignUp(userName,userLastName,userEmail,phoneNumber,password,userGender,userImage));

        response=requestSpecification.post(APIConstants.signUp);
        verifyPayloadLogin();

        userInformations.put("userName+LastName",fullName);
        userInformations.put("userEmail",userEmail);
        userInformations.put("phoneNumber",phoneNumber);
        userInformations.put("userGender",userGender);

    }
    public void verifyPayloadLogin() {
        while(!(response.statusCode() ==201))
        {
            sendAPIRequestToSignup();
        }
        response.then().assertThat().statusCode(201);
    }

}
