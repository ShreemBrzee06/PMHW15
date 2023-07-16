package com.amazon.cucumber.steps;

import com.amazon.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SignInStepdefs {
    @And("^user enters \"([^\"]*)\"in emailfield$")
    public void userEntersInEmailfield(String email)  {
        new SignInPage().enterEmailId(email);
    }

    @And("^click on Continue button$")
    public void clickOnContinueButton() {
       new SignInPage().clickOnContinueButtonAfterEmail();
    }

    @And("^enters \"([^\"]*)\" in passwordField\\.$")
    public void entersInPasswordField(String password) {
        new SignInPage().enterPassword(password);
    }
    @And("^click on signin button after password$")
    public void clickOnSigninButtonAfterPassword() {
        new SignInPage().clickOnSignInButtonButton();
    }
    @Then("^verifies the \"([^\"]*)\"$")
    public void verifiesThe(String expected)  {
        new SignInPage().getErrorMessage();
    }



}
