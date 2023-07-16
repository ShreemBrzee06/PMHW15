package com.homeoffice.pages;

import com.homeoffice.utility.Utility;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkType extends Utility {
    private static final Logger log = LogManager.getLogger(WorkType.class.getName());
    public WorkType(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(css = "input#response-0")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(css = "button.gem-c-button--bottom-margin")
    WebElement nextStepButton;

    public void selectJobType(){
        log.info("Select Jobtype option"+selectJobTypeList.toString());
        clickOnElement(selectJobTypeList);
    }

    public void clickOnNextButton(){
        clickOnElement(nextStepButton);
    }

}
