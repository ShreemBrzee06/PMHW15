package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(css = "h1.search-header__title")
    WebElement result;

    public void resultText(String expected) {
        log.info("Result Text" + result.toString());
        String actualMsg = getTextFromElement(result);
        Assert.assertEquals(actualMsg, expected,"Result Message doesn't match");

    }


}
