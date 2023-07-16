package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.DurationOfStayPage;
import com.homeoffice.pages.WorkType;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class WorkTypeStepdefs {


    @And("^user click on Continue button$")
    public void userClickOnContinueButton() {
        new WorkType().clickOnNextButton();
    }



    @And("^user Select have planning to work for Health and care professional$")
    public void userSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkType().selectJobType();
    }
}
