package com.parabank.cucumber.steps;

import com.parabank.pages.AccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AccountStepdefs {
    @And("^I saw message as \"([^\"]*)\"$")
    public void iSawMessageAs(String resultText)  {
        Assert.assertEquals(new AccountPage().registerSuccessfulTxtMsg(),resultText,"Text doesn't match");
    }


    @Then("^I should login successfully and see \"([^\"]*)\"$")
    public void iShouldLoginSuccessfullyAndSee(String successMSG )  {
    Assert.assertEquals(successMSG,new AccountPage().accountOverviewMsg(successMSG));
    }
}
