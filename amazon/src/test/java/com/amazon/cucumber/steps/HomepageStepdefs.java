package com.amazon.cucumber.steps;

import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageStepdefs {
    @Given("^user is on HomePage$")
    public void userIsOnHomePage() {
    }

    @When("^user clicks on signIn link$")
    public void userClicksOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }
    @Then("^verifies the text signin Link$")
    public void verifiesTheTextSigninLink() {
        new SignInPage().getSignInLogo();

    }




}
