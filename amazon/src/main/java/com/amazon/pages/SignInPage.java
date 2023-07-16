package com.amazon.pages;


import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Sign in')]")
    WebElement signInLogo;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    //By emailField = By.id("Email");
    @CacheLookup
    @FindBy(id = "ap_email")
    WebElement emailField;

    //By passwordField = By.name("Password");
    @CacheLookup
    @FindBy(id = "ap_password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(css = "input#continue")
    WebElement continueButton;

    @CacheLookup
    @FindBy(css = "input#signInSubmit")
    WebElement clickOnSignInButton;

    @CacheLookup
    @FindBy(css = "span[class='a-list-item']")
    WebElement errorMessage;

    public String getSignInLogo() {

        log.info("get welcome text" + signInLogo.toString());
        return getTextFromElement(signInLogo);
    }

    public String getWelcomeText() {
        log.info("getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        log.info("enterEmailId" + email);
        sendTextToElement(emailField, email);

    }

    public void clickOnContinueButtonAfterEmail() {
        log.info("Click on Continue button after email" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterPassword(String password) {
        log.info("enter password" + password);
        sendTextToElement(passwordField, password);

    }


    public void clickOnSignInButtonButton() {
        log.info("click on login button" + clickOnSignInButton.toString());
        clickOnElement(clickOnSignInButton);
    }

    public String getErrorMessage() {

        log.info("get error messages" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }


}
