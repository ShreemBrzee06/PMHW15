package com.homeoffice.cucumber.steps;

import com.homeoffice.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ResultMessageStepdefs {
    @Then("^it shows the result message as \"([^\"]*)\"$")
    public void itShowsTheResultMessageAs(String resultMessage)  {
       Assert.assertEquals(resultMessage,new ResultPage().getResultMSG(),"Message doesn't match");
    }

    @Then("^user should get result message as \"([^\"]*)\"$")
    public void userShouldGetResultMessageAs(String resultText) {
        Assert.assertEquals(new ResultPage().getResultMessage(),resultText,"Text doesn't match");
    }
}
