package com.nopcommerce.cucumber.steps;

import com.nopcommerce.pages.ComputerPage;
import com.nopcommerce.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;

public class ComputerPageStepdefs {
    @Given("^user is on HomePage$")
    public void userIsOnHomePage() {
    }

    @And("^I mousehoover on computers$")
    public void iMousehooverOnComputers() {
        new ComputerPage().mouseHooverToComouters();
    }

    @And("^Click on Desktop$")
    public void clickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^Select Sort By position Name: Z to A$")
    public void selectSortByPositionNameZToA() {
        new ComputerPage().sortText();
    }


    @And("^I click on Computer Menu\\.$")
    public void iClickOnComputerMenu() {

    }

    @And("^I Click on Desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I Select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String sortPosition) {
        new ComputerPage().selectAtoZ(sortPosition);
    }

    @And("^I click on Add To Cart$")
    public void iClickOnAddToCart() {
        new ComputerPage().addtoCart();
    }

    @And("^I verify the Text \"([^\"]*)\"$")
    public void iVerifyTheText(String text) {
        Assert.assertEquals(text, new ComputerPage().getItemText(), "Text doesn't match");
    }

    @And("^I Select \"([^\"]*)\"$")
    public void iSelect(String processor) {
        new ComputerPage().selectProcesser(processor);
    }

    @And("^I Select \"([^\"]*)\" RAM using Select class\\.$")
    public void iSelectRAMUsingSelectClass(String ram) throws InterruptedException {
        new ComputerPage().selectRam(ram);
    }

    @And("^I Select HDD radio button$")
    public void iSelectHDDRadioButton() {
        new ComputerPage().selectRadiobtn();
    }

    @And("^I Select OS radio Vista Premium$")
    public void iSelectOSRadioVistaPremium() {
        new ComputerPage().checkOnOperatingSystem();
    }

    @And("^I check Two Check boxes Microsoft Office and Total Commander$")
    public void iCheckTwoCheckBoxesMicrosoftOfficeAndTotalCommander() {
        new ComputerPage().selectCheckbox();
    }


    @And("^I click on ADD TO CARD Button\\.$")
    public void iClickOnADDTOCARDButton() {
        new ComputerPage().clickAddBtn();
    }

    @And("^I Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void iVerifyTheMessageOnTopGreenBar(String greenMsg) {
        new ComputerPage().getMsg();

    }

    @And("^I after that close the bar clicking on the cross button\\.$")
    public void iAfterThatCloseTheBarClickingOnTheCrossButton() {
        new ComputerPage().closemsg();
    }

    @Then("^I click on MouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void iClickOnMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new ComputerPage().shoppingCart();
        new ComputerPage().clickGoTo();
    }

    @And("^I Verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String shoppingCartMessage) {
        Assert.assertEquals(shoppingCartMessage, new ComputerPage().shoppingCartMsg(), "Text doesn't match");

    }

    @And("^I change the Qty to \"([^\"]*)\" and Click on Update shopping cart$")
    public void iChangeTheQtyToAndClickOnUpdateShoppingCart(String arg0) {
        new ComputerPage().changeQty();
        new ComputerPage().clickOnUpdate();

    }


    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ComputerPage().clickTerms();
    }

    @And("^I click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
        new ComputerPage().checkout();
    }

    @And("^I verify the Text “Welcome, Please Sign In!”$")
    public void iVerifyTheTextWelcomePleaseSignIn() {
        new ComputerPage().getTitleText();
    }

    @And("^I click on CHECKOUT AS GUEST Tab$")
    public void iClickOnCHECKOUTASGUESTTab() throws InterruptedException {
        new ComputerPage().clickGuestCheckout();
    }


    @And("^I fill the firstname$")
    public void iFillTheFirstname() {
        new ComputerPage().getFname("Ganesha");
    }

    @And("^I fill the lastname$")
    public void iFillTheLastname() {
        new ComputerPage().getlname("Shiv");
    }

    @And("^I fill the emailAddress$")
    public void iFillTheEmailAddress() {
        new ComputerPage().getEmail("ganesha@gmail.com");
    }

    @And("^I select the country dropdown menu as \"([^\"]*)\"$")
    public void iSelectTheCountryDropdownMenuAs(String country) {
        new ComputerPage().getCountry(country);
    }

    @And("^I select the state as \"([^\"]*)\"$")
    public void iSelectTheStateAs(String state) {
        new ComputerPage().getState(state);
    }

    @And("^I enter city name as \"([^\"]*)\"$")
    public void iEnterCityNameAs(String city) {
        new ComputerPage().getCity(city);

    }

    @And("^I enter Address one line\"([^\"]*)\"$")
    public void iEnterAddressOneLine(String streetname) {
        new ComputerPage().getAddress(streetname);
    }

    @And("^I enter zip postal code\"([^\"]*)\"$")
    public void iEnterZipPostalCode(String zipCode) {
        new ComputerPage().getZipcode(zipCode);
    }

    @And("^I enter Phone number\"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phone) {
        new ComputerPage().getPhoneNumber(phone);
    }


    @And("^I click on CONTINUE button after filling all mandatory fields$")
    public void iClickOnCONTINUEButtonAfterFillingAllMandatoryFields() {
        new ComputerPage().clickContinue();
    }

    @And("^I click on Radio Button 'Next Day Air'$")
    public void iClickOnRadioButtonNextDayAir() {
        new ComputerPage().clkradioair();
    }

    @And("^I click on CONTINUE btn$")
    public void iClickOnCONTINUEBtn() throws InterruptedException {
        Thread.sleep(3000);
        new ComputerPage().clkcontinue();
    }

    @And("^Select Radio Button Credit Card$")
    public void selectRadioButtonCreditCard() {
        new ComputerPage().cliktCrediCard();

    }

    @And("^click on continue button after selecting master card$")
    public void clickOnContinueButtonAfterSelectingMasterCard() {
        new ComputerPage().clickCont();
    }

    @And("^Select Master card From Select credit card dropdown\"([^\"]*)\"$")
    public void selectMasterCardFromSelectCreditCardDropdown(String creditcard) {
        new ComputerPage().selectCreditCardOption(creditcard);
    }


    @And("^I enter cardHolder name \"([^\"]*)\"$")
    public void iEnterCardHolderName(String chname)  {
        new ComputerPage().getCardHoldr(chname);
    }

    @And("^I enter My card number as\"([^\"]*)\"$")
    public void iEnterMyCardNumberAs(String cardNumber)  {
        new ComputerPage().getCardNo(cardNumber);
    }

    @And("^I enter expire month \"([^\"]*)\"$")
    public void iEnterExpireMonth(String expMonth) {
        new ComputerPage().getExpMonth(expMonth);
    }

    @And("^I enter expire year as \"([^\"]*)\"$")
    public void iEnterExpireYearAs(String expYear)  {
        new ComputerPage().getExpYear(expYear);
    }

    @And("^I enter cardCode is \"([^\"]*)\"$")
    public void iEnterCardCodeIs(String cardCode)  {
        new ComputerPage().getcardcode(cardCode);
    }

    @And("^click on Paymentinfo save$")
    public void clickOnPaymentinfoSave() {
        new ComputerPage().clkcontn();
    }



    @And("^I  Verify Payment Method is \"([^\"]*)\"$")
    public void iVerifyPaymentMethodIs(String verifyCCText)  {
    new ComputerPage().getcredittxt();
    }



    @And("^I Click on CONFIRM$")
    public void iClickOnCONFIRM() {
        new ComputerPage().clickOnConfirmButton();
    }

    @And("^I click on CONTINUE button after verifying success message$")
    public void iClickOnCONTINUEButtonAfterVerifyingSuccessMessage() {
        new ComputerPage().getSuccessfullorderMsg();
    }



}