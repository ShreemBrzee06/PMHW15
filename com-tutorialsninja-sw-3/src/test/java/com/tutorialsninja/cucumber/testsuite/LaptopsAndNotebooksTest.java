package com.tutorialsninja.cucumber.testsuite;

import com.tutorialsninja.laptopsandnotebooks.LaptopsAndNoteBooksPage;
import com.tutorialsninja.utility.Utility;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends Utility {

LaptopsAndNoteBooksPage laptopsAndNoteBooksPage = new LaptopsAndNoteBooksPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        //1.2 Click on “Show All Laptops & Notebooks”
        laptopsAndNoteBooksPage.clickOnLanAndShowAllNotebook();
        //1.3 Select Sort By "Price (High > Low)"
        laptopsAndNoteBooksPage.selectSortByPrice();
        //1.4 Verify the Product price will arrange in High to Low order.
        laptopsAndNoteBooksPage.verifyProductPrice();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
        //  2.1 Mouse hover on Laptops & Notebooks Tab and click
        // 2.2 Click on “Show All Laptops & Notebooks”
        //  2.3 Select Sort By "Price (High > Low)"
        verifyProductsPriceDisplayHighToLowSuccessfully();
        //2.4 Select Product “MacBook”
        laptopsAndNoteBooksPage.selectProduct();
        //2.5 Verify the text “MacBook”
        laptopsAndNoteBooksPage.verifyTextMacBook();
        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNoteBooksPage.addToCartButton();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        laptopsAndNoteBooksPage.successMsgForMacAddedInCart();
        //2.14 Verify the Total £737.45
        laptopsAndNoteBooksPage.verifyTheTotal();
        //2.15 Click on “Checkout” button
        laptopsAndNoteBooksPage.clickOnCheckOut();
        //2.16 Verify the text “Checkout”
        laptopsAndNoteBooksPage.verifyTheTextCheckOut();
        //2.17 Verify the Text “New Customer”
       // laptopsAndNoteBooksPage.verifyTheTextNewCustomer();
        //2.18 Click on “Guest Checkout” radio button
        laptopsAndNoteBooksPage.clickOnGuestCheckOut();
        //2.19 Click on “Continue” tab
        laptopsAndNoteBooksPage.afterGuestCheckOutClickOnContinueButton();
        //2.20 Fill the mandatory fields
        laptopsAndNoteBooksPage.mandatoryFields();
        //2.21 Click on “Continue” Button
        laptopsAndNoteBooksPage.afterFillingMandatoryFieldClickOnContinueButton();
        //2.22 Add Comments About your order into text area
        laptopsAndNoteBooksPage.addCommentsAboutYourOrderIntoTextArea();
        //2.23 Check the Terms & Conditions check box
        laptopsAndNoteBooksPage.checkTheTermsAndConditions();
        //2.24 Click on “Continue” button
        laptopsAndNoteBooksPage.afterCheckAndTermsConditionClickOnContinueButton();
        //2.25 Verify the message “Warning: Payment method required!”
        laptopsAndNoteBooksPage.verifyWarningTheMessage();

    }

}
