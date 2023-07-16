package com.tutorialsninja.cucumber.testsuite;

import com.ninjatutorials.myaccounts.MyAccountsPage;
import com.ninjatutorials.testbase.TestBase;
import org.testng.annotations.Test;

public class MyAccountsPageTest extends TestBase {
    MyAccountsPage myAccountsPage = new MyAccountsPage();
@Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        myAccountsPage.selectMyAccountOption("Register");
        //1.3 Verify the text “Register Account”.
        myAccountsPage.verifyTheTextRegisterAccount();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        myAccountsPage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        myAccountsPage.verifyReturningCustomerMsg();
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
    //3.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        myAccountsPage.selectMyAccountOption("Register");
        //3.3 Enter First Name
        myAccountsPage.enterFirstName("Ganesha");
        //3.4 Enter Last Name
        myAccountsPage.enterLastName("Shiv");
        //3.5 Enter Email
        myAccountsPage.enterEmailField("ganesha2@gmail.com");
        //3.6 Enter Telephone
        myAccountsPage.enterTelephone("1234658412");
        //3.7 Enter Password
        myAccountsPage.enterPassword("test_12345");
        //3.8 Enter Password Confirm
        myAccountsPage.enterConfirmPassword("test_12345");
        //3.9 Select Subscribe Yes radio button
        myAccountsPage.selectSubscribeBtn();
        //3.10 Click on Privacy Policy check box
        myAccountsPage.clickOnPrivacyPolicyCheckBox();
        //3.11 Click on Continue button
        myAccountsPage.clickOnContinueBtn();
        //3.12 Verify the message “Your Account Has Been Created!”
        //myAccountsPage.verifyAccountHasCreatedMsg();
        //3.13 Click on Continue button
        myAccountsPage.clickOnContinueBtnAfterAccountCreation();
        //3.14 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLinkAfterAccountCreation();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        myAccountsPage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        myAccountsPage.verifyTheAccountLogOutMsg();
        //3.17 Click on Continue button
        myAccountsPage.clickOnContinueBtnAfterAccountLogOut();

    }
@Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        myAccountsPage.selectMyAccountOption("Login");
        //4.3 Enter Email address
        myAccountsPage.enterEmailField("ganesha15@gmail.com");
        //4.5 Enter Password
        myAccountsPage.enterPassword("test_12345");
        //4.6 Click on Login button
        myAccountsPage.clickOnLoginBtn();
        //4.7 Verify text “My Account”
        myAccountsPage.verifyTextMyAccount();
        //4.8 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLinkAfterAccountCreation();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        myAccountsPage.selectMyAccountOption("Logout");
        //4.10 Verify the text “Account Logout”
        myAccountsPage.verifyTheAccountLogOutMsg();
        //4.11 Click on Continue button
        myAccountsPage.clickOnLastContinueButton();

    }
}
