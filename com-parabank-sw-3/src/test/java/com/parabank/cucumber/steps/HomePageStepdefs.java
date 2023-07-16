package com.parabank.cucumber.steps;

import com.parabank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageStepdefs {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {

    }



    @Given("^I click on the Register link$")
    public void iClickOnTheRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }


}
