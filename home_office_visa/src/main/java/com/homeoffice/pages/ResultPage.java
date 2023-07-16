package com.homeoffice.pages;


import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup//australian messge
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage1;

    @CacheLookup//for chilean confirmation message
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;

    public String getResultMessage() {// for Chelean requiring visa
        log.info("Actual Result Message"+resultMessage);
        String actualResult = getTextFromElement(resultMessage);
        return actualResult;
    }

    public String getResultMSG() {//for Australian doesn't require visa message
        log.info("Actual Result message:"+resultMessage1.toString());
        String resultMsg = getTextFromElement(resultMessage1);
        return resultMsg;
    }

    public void confirmResultMessage(String expectedMessage) {
        log.info("confirm result message" + expectedMessage);
        getResultMessage();
        Assert.assertTrue(expectedMessage.contains(getResultMessage()));
    }

    public void confirmResultMsg(String expectedMessage) {
        log.info("confirm result msg" + expectedMessage);
        getResultMSG();
        Assert.assertTrue(expectedMessage.contains(getResultMSG()));
    }
}
