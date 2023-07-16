package com.parabank.pages;

import com.parabank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    //By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    @CacheLookup
    @FindBy(css = ".caption")
    WebElement welcomeLogo;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    //By emailField = By.id("Email");
    @CacheLookup
    @FindBy(name = "username")
    WebElement emailField;

    //By passwordField = By.name("Password");
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    //By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    @CacheLookup
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;

    //By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    @CacheLookup
    @FindBy(xpath = "//p[@class='error']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(linkText = "Log Out")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//div[@id='leftPanel']//h2")
    WebElement verifyLogoutMsg;


    public String getWelcomeLogo() {

        log.info("get welcome text" + welcomeLogo.toString());
        return getTextFromElement(welcomeLogo);
    }

    public String getWelcomeText() {
        log.info("getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        log.info("enterEmailId" + email);
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("enter password" + password);
        sendTextToElement(passwordField, password);

    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }

    public void clickOnLoginButton() {
        log.info("click on login button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {

        log.info("get error messages" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public void logOut() {
        clickOnElement(logOutLink);
    }

    public String logOutMsg() {
        log.info("Verify the Logout Messsage" + verifyLogoutMsg.toString());
        return getTextFromElement(verifyLogoutMsg);
    }
}
