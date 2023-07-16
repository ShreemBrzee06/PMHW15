package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.SelectNationalityPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class NationalityStepdefs {


    @And("^user select nationality as \"([^\"]*)\"$")
    public void userSelectNationalityAs(String nationality)  {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^user click on continue button$")
    public void userClickOnContinueButton() {
    new SelectNationalityPage().clickOnContinueButton();
    }
}
