package com.homeoffice.pages;

import com.homeoffice.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(css = "div.govuk-radios>div")
    List<WebElement> selectOption;

    @CacheLookup
    @FindBy(css = "input#response-0")
    WebElement yes;

    @CacheLookup
    @FindBy(css = "input#response-1")
    WebElement no;

    public void selectImmigrationStatus(String status) {
        List<WebElement> option = selectOption;
        String s = option.toString();
        switch (status) {
            case "Yes":
                s.equalsIgnoreCase(status);
                clickOnElement(yes);
                break;


            case "No":
                s.equalsIgnoreCase(status);
                clickOnElement(no);
                break;


        }

    }
}
