package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.DurationOfStayPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class DurationOfStayStepdefs {
    @And("^user click on next continue button$")
    public void userClickOnNextContinueButton() throws InterruptedException {
        new DurationOfStayPage().clickOnNextButton();
    }

    @And("^user select the intendent stay for \"([^\"]*)\"$")
    public void userSelectTheIntendentStayFor(String stay) {
        new DurationOfStayPage().selectLengthOfStay(stay);
    }
}
