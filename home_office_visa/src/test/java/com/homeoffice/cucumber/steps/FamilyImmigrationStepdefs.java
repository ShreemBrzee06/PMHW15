package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.FamilyImmigrationStatusPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class FamilyImmigrationStepdefs {


    @And("^user select family immigration status \"([^\"]*)\"$")
    public void userSelectFamilyImmigrationStatus(String status)  {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }
}
