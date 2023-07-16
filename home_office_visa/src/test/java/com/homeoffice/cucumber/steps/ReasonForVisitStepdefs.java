package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.ReasonForTravelPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ReasonForVisitStepdefs {


    @And("^user click on reason for visit as Tourism or visiting family and friends$")
    public void userClickOnReasonForVisitAsTourismOrVisitingFamilyAndFriends() {
        new ReasonForTravelPage().selectReasonForVisit();
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
        new ReasonForTravelPage().clickOnContinueBtn();
    }


    @And("^user click on reason for visit as Work, academic visit or business$")
    public void userClickOnReasonForVisitAsWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForVisit1();
    }


    @And("^user click on reason for visit as Join partner or family for a long stay$")
    public void userClickOnReasonForVisitAsJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForVisit2();
    }


}
