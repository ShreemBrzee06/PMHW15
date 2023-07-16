package com.homeoffice.pages;

import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "input#response-0")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(css = "input#response-1")
    WebElement moreThanSixMonths;
     @CacheLookup
    @FindBy(css = "button.gem-c-button.govuk-button.gem-c-button--bottom-margin")
    WebElement clickOnNextButton;

    public void clickOnSixMonths() {
        log.info("click on 6 months or less option"+lessThanSixMonths.toString());
        clickOnElement(lessThanSixMonths);
    }

    public void clickOnMoreThanSixMonths(){
        log.info("click on more than 6 months option"+ moreThanSixMonths.toString());
        clickOnElement(moreThanSixMonths);
    }

    public void clickOnNextButton() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Click on contiune button"+clickOnNextButton.toString());
        clickOnElement(clickOnNextButton);
    }


    public void selectLengthOfStay(String moreOrLess) {
        String s1 = lessThanSixMonths.toString();
        String s2 = moreThanSixMonths.toString();
        switch (moreOrLess) {
            case "6 months or less":
                s1.equalsIgnoreCase(moreOrLess);
                clickOnSixMonths();
                break;
            case "longer than 6 months":
                s2.equalsIgnoreCase(moreOrLess);
              clickOnMoreThanSixMonths();
                break;
        }
    }

}
