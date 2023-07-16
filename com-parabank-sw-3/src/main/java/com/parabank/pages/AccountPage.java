package com.parabank.pages;

import com.parabank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css ="#rightPanel>h1+p")
    WebElement registerSuccessfulTxtMsg;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='title']")
    WebElement accountOverviewMsg;

    public String registerSuccessfulTxtMsg(){
        log.info("Successful registration page"+registerSuccessfulTxtMsg.toString());
        return getTextFromElement(registerSuccessfulTxtMsg);
    }

    public String accountOverviewMsg(String expected){
       return getTextFromElement(accountOverviewMsg);
    }

}
