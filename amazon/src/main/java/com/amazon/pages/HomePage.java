package com.amazon.pages;


import com.amazon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    //By loginLink = By.linkText("Log in");

    @CacheLookup
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement mouseHooverSignIn;

    @CacheLookup
    @FindBy(css = "#nav-flyout-ya-newCust>a")
    WebElement newCustomerLink;

    @CacheLookup
    @FindBy(css = "#nav-flyout-ya-signin>a")
    WebElement signInLink;



    @CacheLookup
    @FindBy(id = "#nav-main")
    WebElement mainAllClassLink;

    @CacheLookup
    @FindBy(id = "#twotabsearchtextbox")
    WebElement searchBox;


    public void newCustomerLink() {
        mouseHoverToElement(newCustomerLink);
        log.info("clicking on login link : " + newCustomerLink.toString());
        clickOnElement(newCustomerLink);

    }

    public void clickOnSignInLink() {
        mouseHoverToElement(mouseHooverSignIn);
        log.info("click on register link :" + signInLink.toString());
        clickOnElement(signInLink);

    }


}
