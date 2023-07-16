package com.parabank.cucumber.steps;


import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPge;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStepdefs {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new LoginPage().enterEmailId(username);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password){new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @And("^I saw error message \"([^\"]*)\"$")
    public void iSawErrorMessage(String errorMessage)  {
        Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage,"Text message doesn't match");
    }

    @Then("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new LoginPage().logOut();
    }



    @And("^I saw log out message \"([^\"]*)\"$")
    public void iSawLogOutMessage(String errorMessage )  {
        Assert.assertEquals(errorMessage,new LoginPage().getErrorMessage(),"The text message doesn't match");
    }
}
