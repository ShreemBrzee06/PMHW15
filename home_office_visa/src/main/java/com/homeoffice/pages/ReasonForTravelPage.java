package com.homeoffice.pages;


import com.homeoffice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup//
    @FindBy(css = "input#response-0")
    WebElement reasonForVisitList;

    @CacheLookup//work,academic
    @FindBy(css = "input#response-1")
    WebElement getReasonForVisitList1;

    @CacheLookup
    @FindBy(css = "input#response-4")
    WebElement reasonForVisit2;
    //By.cssSelector("input#response-0");

    @CacheLookup
    @FindBy(css = "button.gem-c-button--bottom-margin")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(css = "input#response-1")
    WebElement howLongStay;

    /* public void selectReasonForVisit(String reason){
        List<WebElement>visit = driver.findElements(reasonForVisitList);
         for (WebElement option:visit){
             System.out.println(visit+"-------------------");
         String result = option.getText();
             System.out.println(result+"-------------------");
         if(result.equalsIgnoreCase(reason)){
             option.click();
         }
      }*/
    public void selectReasonForVisit() {
        log.info("Click on Reason for visit" + reasonForVisitList.toString());
        clickOnElement(reasonForVisitList);

    }

    public void selectReasonForVisit1() {
        log.info("Click on reason for visit1" + getReasonForVisitList1.toString());
        clickOnElement(getReasonForVisitList1);

    }

    public void selectReasonForVisit2() {
        log.info("Select for Reason for visit" + reasonForVisit2.toString());
        clickOnElement(reasonForVisit2);
    }


    public void clickOnContinueBtn() {
        log.info("Click on Continue button" + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }

    public void intendentStay() {
        log.info("Click on Continue button" + howLongStay.toString());
        clickOnElement(howLongStay);
    }
}
