package com.cvlibrary.cucumber.steps;

import com.cvlibrary.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepdefs {
    @Given("^user is on home page$")
    public void userIsOnHomePage() {

    }

    @When("^user enters job title in \"([^\"]*)\"$")
    public void userEntersJobTitleIn(String jobTitle)  {
       new HomePage().enterJobTitle(jobTitle);
    }

    @And("^user enter location in \"([^\"]*)\"$")
    public void userEnterLocationIn(String location)  {
        new HomePage().enterLocation(location);
    }

    @And("^user select distance in\"([^\"]*)\"$")
    public void userSelectDistanceIn(String distance)  {
        new HomePage().selectDistance(distance);
    }

    @And("^user click on moreSearchOptionsLink$")
    public void userClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^user enter minimum salary in \"([^\"]*)\"$")
    public void userEnterMinimumSalaryIn(String miniSalary)  {
        new HomePage().enterMinSalary(miniSalary);
    }

    @And("^user enter maximum salary in \"([^\"]*)\"$")
    public void userEnterMaximumSalaryIn(String maxiSalary)  {
        new HomePage().enterMaxSalary(maxiSalary);
    }

    @And("^user select salary type in \"([^\"]*)\"$")
    public void userSelectSalaryTypeIn(String salType)  {
        new HomePage().selectSalaryType(salType);
    }

    @And("^user select jobType \"([^\"]*)\"$")
    public void userSelectJobType(String jobsType)  {
        new HomePage().selectJobType(jobsType);
    }

    @Then("^user click on 'Find Jobs' button$")
    public void userClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }


}
