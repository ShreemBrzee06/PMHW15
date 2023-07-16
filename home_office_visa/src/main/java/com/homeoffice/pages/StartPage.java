package com.homeoffice.pages;


import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(css = ".gem-c-button.govuk-button.govuk-button--start")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='js-confirmation-buttons govuk-button-group']/button[1]")
    WebElement clickOnCookies;
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnCookies() {
        log.info("click on cookies" + clickOnCookies.toString());
        clickOnElement(clickOnCookies);
    }

    public void clickStartNow() {
        log.info("Click on Start Button" + startNowButton.toString());
        clickOnElement(startNowButton);
    }

}
