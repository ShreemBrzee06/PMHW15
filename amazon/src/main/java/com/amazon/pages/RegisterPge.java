package com.amazon.pages;


import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPge extends Utility {
    private  static final Logger log = LogManager.getLogger(RegisterPge.class.getName());
    public RegisterPge(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(css ="h1.title" )
    WebElement RegisterPage;

    @CacheLookup
    @FindBy(css ="#rightPanel>h1" )
    WebElement RegisterPageWelcomeMsg;


    @CacheLookup
    @FindBy(id = "customer.firstName")
    WebElement FirstName;

    @CacheLookup
    @FindBy(id ="customer.lastName" )
    WebElement LastName;
    @CacheLookup
    @FindBy(id = "customer.address.street")
    WebElement Address;
    @CacheLookup
    @FindBy(id ="customer.address.city" )
    WebElement City;
    @CacheLookup
    @FindBy(id ="customer.address.state" )
    WebElement State;
    @CacheLookup
    @FindBy(id = "customer.address.zipCode")
    WebElement ZipCode;
    @CacheLookup
    @FindBy(id = "customer.phoneNumber")
    WebElement Phone;
    @CacheLookup
    @FindBy(id ="customer.ssn" )
    WebElement SSN;
    @CacheLookup
    @FindBy(id ="customer.username" )
    WebElement UserName;
    @CacheLookup
    @FindBy (id ="customer.password" )
    WebElement Password;
    @CacheLookup
    @FindBy(id="repeatedPassword")
    WebElement confirmPW;
    @CacheLookup
    @FindBy(css = "input[value='Register']")
    WebElement RegisterButton;


    public String getRegisterPage(){
        log.info("get Register Page Msg"+ RegisterPage.toString());
        return getTextFromElement(RegisterPage);
    }

    public String getWelcomeMessage(){
        return getTextFromElement(RegisterPageWelcomeMsg);
    }

    public void enterFirstName(String firstname){
    log.info("Enter First Name"+FirstName.toString());
    sendTextToElement(FirstName,firstname);
    }
    public void enterLastName(String lastname){
        log.info("Enter Last Name"+LastName.toString());
        sendTextToElement(LastName,lastname);
    }

    public void enterAddressStreet(String streetName){
        log.info("Enter Address Street Name"+streetName.toString());
        sendTextToElement(Address,streetName);
    }

    public void enterCity(String CityName){
        log.info("Enter City Name: " +CityName.toString());
        sendTextToElement(City,CityName);
    }

    public void enterState(String StateName){
        log.info("Enter State Name: " +StateName.toString());
        sendTextToElement(State,StateName);
    }

    public void enterZipCode(String zipCode){
        log.info("Enter Zip Code: " +ZipCode.toString());
        sendTextToElement(ZipCode,zipCode);
    }


    public void enterPhone(String phoneNumber){
        log.info("Enter Phone Number: " +phoneNumber.toString());
        sendTextToElement(Phone,phoneNumber);
    }

    public void enterSsn(String ssn){
        log.info("Enter SSN no: " +ssn.toString());
        sendTextToElement(SSN,ssn);
    }

    public void enterUserName(String userName){
        log.info("Enter User Name"+userName.toString());
       // String username = ""+(int)(Math.random()*Integer.MAX_VALUE);
       // String emailID = username+"gmail.com";
        sendTextToElement(UserName,userName);
    }

    public void enterPassword(String password){
        log.info("Enter Password: " +password.toString());
        sendTextToElement(Password,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        log.info("Enter Password: " +confirmPassword.toString());
        sendTextToElement(confirmPW,confirmPassword);
    }


    public void personalInfo(String firstName, String lastname){
        enterFirstName(firstName);
        enterLastName(lastname);
    }

    public void address(String addressStreet, String city, String state, String zipCode,String phone, String ssn){
        enterAddressStreet(addressStreet);
        enterCity(city);
        enterState(state);
        enterZipCode(zipCode);
        enterPhone(phone);
        enterSsn(ssn);

    }

    public void resisterInfo(String userName, String password, String confirmPw){
        enterUserName(userName);
        enterPassword(password);
        enterConfirmPassword(confirmPw);
    }

    public void registerButton (){
        clickOnElement(RegisterButton);
    }



}

