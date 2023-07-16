package com.homeoffice.pages;


import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(css = "#response")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(css = "#current-question>button")
    WebElement nextStepButton;

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectNationality(String nationality) {

        log.info("nationality " + nationality);
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }

    public void clickOnContinueButton() {
        log.info("click on continue button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
