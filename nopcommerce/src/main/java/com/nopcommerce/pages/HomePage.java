package com.nopcommerce.pages;


import com.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
private static final Logger log = LogManager.getLogger(HomePage.class.getName());

public HomePage(){
    PageFactory.initElements(driver,this);
}

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;





    public void enterUserName(String uname){
       log.info("Entering username:"+userName.toString());
        sendTextToElement(userName,uname);
    }

    public void enterPassword(String pswd){
        log.info("Entering password"+password.toString());
        sendTextToElement(password,pswd);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


}
