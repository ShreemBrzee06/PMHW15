package com.parabank.cucumber.steps;

import com.parabank.pages.HomePage;
import com.parabank.pages.RegisterPge;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class RegisterStepdefs {


    @And("^I entered First name as \"([^\"]*)\"$")
    public void iEnteredFirstNameAs(String firstName)  {
        new RegisterPge().enterFirstName(firstName);
    }

    @And("^I entered Last name as \"([^\"]*)\"$")
    public void iEnteredLastNameAs(String lastName)  {
        new RegisterPge().enterLastName(lastName);
    }

    @And("^I Entered Address \"([^\"]*)\"$")
    public void iEnteredAddress(String address)  {
        new RegisterPge().enterAddressStreet(address);
    }

    @And("^I entered City as\"([^\"]*)\"$")
    public void iEnteredCityAs(String cityName ) {
        new RegisterPge().enterCity(cityName);
    }

    @And("^I entered State as \"([^\"]*)\"$")
    public void iEnteredStateAs(String stateName)  {
        new RegisterPge().enterState(stateName);
    }

    @And("^I entered Zip Code as \"([^\"]*)\"$")
    public void iEnteredZipCodeAs(String zipCode)  {
        new RegisterPge().enterZipCode(zipCode);
    }

    @And("^I entered Phone as \"([^\"]*)\"$")
    public void iEnteredPhoneAs(String phoneNumber)  {
        new RegisterPge().enterPhone(phoneNumber);
    }

    @And("^I entered SSN as \"([^\"]*)\"$")
    public void iEnteredSSNAs(String ssn)  {
        new RegisterPge().enterSsn(ssn);
    }

    @And("^I entered username as \"([^\"]*)\"$")
    public void iEnteredUsernameAs(String uname)  {
        new RegisterPge().enterUserName(uname);
    }

    @And("^I entered password as \"([^\"]*)\"$")
    public void iEnteredPasswordAs(String pswd)  {
        new RegisterPge().enterPassword(pswd);
    }

    @And("^I enteted confirm password as\"([^\"]*)\"$")
    public void iEntetedConfirmPasswordAs(String confirmPW)  {
        new RegisterPge().enterConfirmPassword(confirmPW);
    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPge().registerButton();
    }


    @And("^I should be able to see the text message displayed as \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheTextMessageDisplayedAs(String result)  {
       Assert.assertEquals(result,new RegisterPge().getWelcomeMessage(),"The message doesn't match");
    }
}
