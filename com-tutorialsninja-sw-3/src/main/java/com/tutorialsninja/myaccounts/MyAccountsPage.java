package com.tutorialsninja.myaccounts;

import com.ninjatutorials.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class MyAccountsPage extends Utility {
    By clickOnMyAccount = By.linkText("My Account");
    By clickOnRegisterLink = By.linkText("Register");
    By verifyRegisterMsg = By.xpath("//div[@id='content']/h1");
    By clickOnLoginLink = By.linkText("Login");
    By returningCustomer = By.xpath("//div[@class='row']//div[2]//div[1]//h2");

    By clickOnLogOutLink = By.linkText("Logout");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By selectSubscribeYesButton = By.xpath("//div[2]//label[1]//input[@name='newsletter']");
    By clickOnMyAccountLinkAfterAccountCreation = By.linkText("My Account");
    By verifyAccountLogOutMsg = By.xpath("//div[@id='content']//h1");

    By clickOnContinueButtonAfterLogOutBtn = By.linkText("Continue");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");


    By clickOnLoginButton = By.xpath("//input[@value='Login']");
    By clickOnLastContinueButton = By.xpath("//div[@class='pull-right']//a[@class='btn btn-primary']");

    public void selectMyAccountOptions(String option) {

        if (option.equals("Register")) {
            mouseHoverToElementAndClick(clickOnRegisterLink);
            //System.out.println("i m in if loop");
        } else if (option.equals("Login")) {
            mouseHoverToElementAndClick(clickOnLoginLink);
            //System.out.println(" im in else if loop ");
        } else if (option.equals("Logout")) {
            clickOnElement(clickOnLogOutLink);

        }
    }
    //1.1 Click on My Account Link.
     public void clickOnMyAccountLink() {
        Reporter.log("click on my account link"+ clickOnMyAccount.toString());
        mouseHoverToElementAndClick(clickOnMyAccount);
    }

    public void verifyTheTextRegisterAccount() {

        String actualRegisterMsg = getTextFromElement(verifyRegisterMsg);
        System.out.println(actualRegisterMsg);
        String expectedMsg = "Register Account";
        Assert.assertEquals(actualRegisterMsg, expectedMsg);
    }


     //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
    //“Login”
    public void selectMyAccountOption(String option) {
        Reporter.log("select my account"+option.toString());
        selectMyAccountOptions(option);
    }

    //2.3 Verify the text “Returning Customer”.

    public void verifyReturningCustomerMsg() {

        String actualReturningCustomerMsg = getTextFromElement(returningCustomer);
        System.out.println(actualReturningCustomerMsg);
        String expectedReturningCustomerMsg = "Returning Customer";
        Assert.assertEquals(actualReturningCustomerMsg, expectedReturningCustomerMsg);
    }

    //3.1 Click on My Account Link.
    public void clickOnRegister() {
        Reporter.log("click on register" + clickOnMyAccount.toString());
        clickOnElement(clickOnMyAccount);
    }


    //3.3 Enter First Name
    public void enterFirstName(String firstname) {
        Reporter.log("enter first name"+ firstname.toString());
        sendTextToElement(firstName, firstname);
    }

    //3.4 Enter Last Name
    public void enterLastName(String lastname) {
        Reporter.log("enter last name"+ lastname.toString());
        sendTextToElement(lastName, lastname);
    }

    //3.5 Enter Email
    public void enterEmailField(String emailField) {
        Reporter.log("enter email field"+ emailField.toString());
        sendTextToElement(email, emailField);
    }

    //3.6 Enter Telephone
    public void enterTelephone(String phoneNumber) {
        Reporter.log("enter telephone number"+phoneNumber.toString());
        sendTextToElement(telephone, phoneNumber);
    }

    //3.7 Enter Password


    public void enterPassword(String passWord) {
        Reporter.log("enter password"+ passWord.toString());
        sendTextToElement(password, passWord);
    }

    //3.8 Enter Password Confirm
    public void enterConfirmPassword(String passwordConfirm) {
        Reporter.log("enter confirm password"+ passwordConfirm.toString());
        sendTextToElement(confirmPassword, passwordConfirm);
    }


    //3.9 Select Subscribe Yes radio button
    public void selectSubscribeBtn() {
        Reporter.log("select subsrcribe button"+selectSubscribeYesButton.toString());
        clickOnElement(selectSubscribeYesButton);
    }

    //3.10 Click on Privacy Policy check box
    By clickOnPrivacyPolicyCheckBox= By.xpath("//input[@name='agree']");
    public void clickOnPrivacyPolicyCheckBox() {
        Reporter.log("click on privacy policy check box"+clickOnPrivacyPolicyCheckBox.toString());
        mouseHoverToElementAndClick(clickOnPrivacyPolicyCheckBox);
    }

    //3.11 Click on Continue button
    By clickOnContinueButtonAfterPolicyCheckBox = By.xpath("//input[@value='Continue']");
    public void clickOnContinueBtn() {
        Reporter.log("click on continue after policy checkbox"+ clickOnContinueButtonAfterPolicyCheckBox.toString());
        mouseHoverToElementAndClick(clickOnContinueButtonAfterPolicyCheckBox);
    }

    //3.12 Verify the message “Your Account Has Been Created!”
    public void verifyAccountHasCreatedMsg() {
        String actualVerifyAccountMsg = driver.findElement(By.xpath("div#content>h1")).getText();
        System.out.println(actualVerifyAccountMsg);
        String expectedVerifyAccountMsg = "Your Account Has Been Created!";
        Assert.assertEquals(actualVerifyAccountMsg, expectedVerifyAccountMsg);
    }

    //3.13 Click on Continue button
    By clickOnContinueButtonAfterAccountCreation = By.linkText("Continue");
    public void clickOnContinueBtnAfterAccountCreation() {
        Reporter.log("click on continue button account creation"+clickOnContinueButtonAfterAccountCreation.toString());
        clickOnElement(clickOnContinueButtonAfterAccountCreation);
    }

    //3.14 Click on My Account Link.

    public void clickOnMyAccountLinkAfterAccountCreation(){
        Reporter.log("click on my account link after account creation"+ clickOnMyAccountLinkAfterAccountCreation.toString());
     clickOnElement(clickOnMyAccountLinkAfterAccountCreation);}


    //3.16 Verify the text “Account Logout”
    public void verifyTheAccountLogOutMsg() {
        String  actualVerifyAccountMsg = getTextFromElement(verifyAccountLogOutMsg);
        String expectedVerifyAccountMsg = "Account Logout";
        Assert.assertEquals( actualVerifyAccountMsg, expectedVerifyAccountMsg);
    }

    //3.17 Click on Continue button
    public void clickOnContinueBtnAfterAccountLogOut() {
        Reporter.log("click on continue button after account log out" + clickOnContinueButtonAfterLogOutBtn.toString());
        clickOnElement(clickOnContinueButtonAfterLogOutBtn);
    }



    //4.6 Click on Login button
    public void clickOnLoginBtn(){
        Reporter.log("click on login button" +clickOnLoginButton.toString());
    clickOnElement(clickOnLoginButton);}


    //4.7 Verify text “My Account”
    public void verifyTextMyAccount() {
        String actualMyAcctMsg = driver.findElement(By.xpath("//*[@id=\"content\"]//h2[1]")).getText();
        System.out.println(actualMyAcctMsg);
        String expectedAcctMsg = "My Account";
        Assert.assertEquals(actualMyAcctMsg, expectedAcctMsg);
    }


       //4.11 Click on Continue button


    public void clickOnLastContinueButton(){
        Reporter.log("Click on last continue button" + clickOnLastContinueButton);
        clickOnElement(clickOnLastContinueButton);
    }

}
