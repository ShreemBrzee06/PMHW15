package com.cvlibrary.cucumber.steps;

import com.cvlibrary.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class ResultStepdefs {
    @And("^user able to see the \"([^\"]*)\"$")
    public void userAbleToSeeThe(String result)  {
        new ResultPage().resultText(result);
    }
}
