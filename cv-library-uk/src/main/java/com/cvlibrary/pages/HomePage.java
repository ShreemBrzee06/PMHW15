package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
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
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(css = "div.hp-search-more>#toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(css = "input#salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(css = "input#salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(css = "select[id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(css = "select#tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(css = "input#hp-search-btn")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement iframeClickButton;


    public void enterJobTitle(String jobTitles) {
        log.info("Job Title:" + jobTitles.toString());
        sendTextToElement(jobTitle, jobTitles);
    }

    public void enterLocation(String locationName) {
        log.info("Location" + location.toString());
        sendTextToElement(location, locationName);
    }

    public void selectDistance(String dropDownOptions) {
        log.info("Distance DropDown Method" + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, dropDownOptions);
    }

    public void clickOnMoreSearchOptionLink() {
        log.info("More Search option Link Method" + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String salaryMins) {
        log.info("salary min" + salaryMins.toString());
        sendTextToElement(salaryMin, salaryMins);
    }

    public void enterMaxSalary(String salaryMaxs) {
        log.info("salary Max" + salaryMaxs.toString());
        sendTextToElement(salaryMax, salaryMaxs);
    }

    public void selectSalaryType(String option) {

        log.info("salary type dropdown method" + option.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, option);
    }

    public void selectJobType(String jobType) {
        log.info("Select Job Type" + jobType.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        log.info("click on findJobButton"+findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }

    public void iframeHandle() throws InterruptedException {
        log.info("Iframe Handled"+iframeClickButton.toString());
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(iframeClickButton);
        driver.switchTo().defaultContent();
    }


}
