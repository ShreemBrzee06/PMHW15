package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.StartPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepdefs {


    @When("^User click on Start Button$")
    public void userClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @Given("^User should be on HomePage and Clicked on cookies$")
    public void userShouldBeOnHomePageAndClickedOnCookies() {
        new StartPage().clickOnCookies();
    }
}
