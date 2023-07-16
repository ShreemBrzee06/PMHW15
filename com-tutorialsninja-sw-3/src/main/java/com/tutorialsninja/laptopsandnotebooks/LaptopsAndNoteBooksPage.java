package com.tutorialsninja.laptopsandnotebooks;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNoteBooksPage extends Utility {
    By clickOnLaptopAndNotebookPage = By.xpath("//ul[@class='nav navbar-nav']/li[2]//a[@class='dropdown-toggle']");
    By clickOnShowAllLaptopsAndNoteBook = By.linkText("Show AllLaptops & Notebooks");
    By sortByPrice = By.id("input-sort");

    By selectByProduct = By.linkText("MacBook");

    public void clickOnLanAndShowAllNotebook() {
        mouseHoverToElementAndClick(clickOnLaptopAndNotebookPage);
        mouseHoverToElementAndClick(clickOnShowAllLaptopsAndNoteBook);
    }

    public void clickOnSort() {
        //list of the product display before sort
        List<WebElement> beforeSortingPrice = driver.findElements(By.xpath("//div[@class='caption']/p[2]"));
        List<String> priceBeforeSort = new ArrayList<>();
        for (WebElement s : beforeSortingPrice) {
            String p[] = (s.getText().split("\n"));
            String op = p[0];
            String ex = p[1];
            //  System.out.println("______________________________");
            System.out.println(op);
            // System.out.println("-------------------------------");
            // System.out.println(ex);
        }

    }

    public void selectSortByPrice() {
        WebElement sort = driver.findElement(sortByPrice);
        sort.click();
        Select s = new Select(sort);
        s.selectByVisibleText("Price (High > Low)");
    }

    public void verifyProductPrice() {
        List<WebElement> beforeSortingPrice = driver.findElements(By.xpath("//div[@class='caption']/p[2]"));
        List<String> priceBeforeSort = new ArrayList<>();
        for (WebElement s : beforeSortingPrice) {
            String p[] = (s.getText().split("\n"));
            String op = p[0];
            String ex = p[1];
            //  System.out.println("______________________________");
            System.out.println(op);
            // System.out.println("-------------------------------");
            // System.out.println(ex);

            List<WebElement> afterSortingPrice = driver.findElements(By.xpath("//div[@class='caption']/p[2]"));
            List<String> priceAfterSort = new ArrayList<>();
            for (WebElement v : afterSortingPrice) {
                String x[] = (v.getText().split("\n"));
                String op1 = x[0];
                String ex1 = x[1];
                // System.out.println("I am showing High to low price list");
                System.out.println(op1);
                // System.out.println(ex);
            }

            Collections.sort(priceBeforeSort);
            Assert.assertEquals(beforeSortingPrice, afterSortingPrice);

        }


    }





    //2.4 Select Product “MacBook”

    public void selectProduct(){
        clickOnElement(selectByProduct);
    }

    //2.5 Verify the text “MacBook”

    By macBookMsg = By.xpath("//*[@id=\"content\"]/div/div[2]/h1");
    By clickOnCartButton= By.id("button-cart");
    By verifyTotalShoppingCartLink = By.linkText("shopping cart");
    By totalAmountMsg = By.xpath("//div[@class= 'table-responsive']//table[1]/tbody[1]/tr[1]/td[6]");

By successMsgForAddingMacToCart = By.xpath("//div[@id='product-product']//div[@class='alert alert-success alert-dismissible']");
By clickOnCheckButton= By.linkText("Checkout");
By verifyCheckOutMsg = By.xpath("//div[@id= 'content']//h1");
By clickOnGuestCheckOut = By.xpath("//input[@value='guest']");
By afterGuestCheckOutClickOnContinueButton = By.id("button-account");

    public void verifyTextMacBook(){
        String actualMacBookMsg = getTextFromElement(macBookMsg);
        System.out.println(actualMacBookMsg);
        String expectedMacBookMsg = "MacBook";
        Assert.assertEquals(expectedMacBookMsg, actualMacBookMsg);
    }

    //2.6 Click on ‘Add To Cart’ button
    public void addToCartButton(){

        clickOnElement(clickOnCartButton);
    }

    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    public void successMsgForMacAddedInCart(){
        String actualSuccessMsg = getTextFromElement(successMsgForAddingMacToCart);
        System.out.println(actualSuccessMsg);
        String expectedSuccessMSG = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualSuccessMsg, expectedSuccessMSG);
    }

    //2.14 Verify the Total $602.00

    public void verifyTheTotal() {
       clickOnElement(verifyTotalShoppingCartLink);
        String actualTotalMSG = getTextFromElement(totalAmountMsg);
        System.out.println(actualTotalMSG);
        String expectedTotalMSG = "$602.00";
        Assert.assertEquals(actualTotalMSG, expectedTotalMSG);
    }

    //2.15 Click on “Checkout” button

    public void clickOnCheckOut() {
        clickOnElement(clickOnCheckButton);
    }
    //2.16 Verify the text “Checkout”

    public void verifyTheTextCheckOut() {
        String actualCheckOutMSG = getTextFromElement(verifyCheckOutMsg);
        System.out.println(actualCheckOutMSG);
        String expectedCheckOutMsg = "Checkout";
        Assert.assertEquals(actualCheckOutMSG, expectedCheckOutMsg );
    }

    //2.17 Verify the Text “New Customer”
 By newCustomerMsg = By.xpath("//div[@class='panel-body']//div[1]//div[1]//h2");
    public void verifyTheTextNewCustomer(){
    String actualNewCustomerMsg = getTextFromElement(newCustomerMsg);
    System.out.println(actualNewCustomerMsg);
    String expectedNewCustomerMsg = "New Customer";
    Assert.assertEquals(actualNewCustomerMsg, expectedNewCustomerMsg);
    }

    //2.18 Click on “Guest Checkout” radio button

    public void clickOnGuestCheckOut() {
        clickOnElement(clickOnGuestCheckOut);
    }

    //2.19 Click on “Continue” tab
    public void afterGuestCheckOutClickOnContinueButton() {
        clickOnElement(afterGuestCheckOutClickOnContinueButton);
    }

    //2.20 Fill the mandatory fields

    public void mandatoryFields() {
        sendTextToElement(By.id("input-payment-firstname"), "Ganesha");
        sendTextToElement(By.id("input-payment-lastname"), "Shiva");
        sendTextToElement(By.id("input-payment-address-1"), "Test Street");
        sendTextToElement(By.id("input-payment-email"), "test@gmail.com");
        sendTextToElement(By.id("input-payment-telephone"), "1234567");
        sendTextToElement(By.id("input-payment-city"), "Test City");
        sendTextToElement(By.id("input-payment-postcode"), "Test Postcode");
        WebElement sort1 = driver.findElement(By.id("input-payment-country"));
        sort1.click();
        Select select = new Select(sort1);
        select.selectByVisibleText("United States");
        WebElement sort2 = driver.findElement(By.id("input-payment-zone"));
        sort2.click();
        Select select1 = new Select(sort2);
        select1.selectByVisibleText("Indiana");
    }

    //2.21 Click on “Continue” Button
 By afterFillingMandatoryFieldClickOnContinueButton = By.xpath("//input[@id='button-guest']");
    public void afterFillingMandatoryFieldClickOnContinueButton() {
        clickOnElement(afterFillingMandatoryFieldClickOnContinueButton);
    }

    //2.22 Add Comments About your order into text area
    By addCommentAboutYourOrderIntoTextArea = By.xpath("//textarea[@name='comment']");
    public void addCommentsAboutYourOrderIntoTextArea() {
        sendTextToElement(addCommentAboutYourOrderIntoTextArea, "Hi, I am in comment box");
    }
    //2.23 Check the Terms & Conditions check box
 By checkTheTermsAndConditions = By.xpath("//input[@type='checkbox']");
    public void checkTheTermsAndConditions() {
        clickOnElement(checkTheTermsAndConditions);
    }
    //2.24 Click on “Continue” button

    public void afterCheckAndTermsConditionClickOnContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")).click();
    }
    //2.25 Verify the message “Warning: Payment method required!”

    public void verifyWarningTheMessage(){
        String actualWarningMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
        System.out.println(actualWarningMsg);
        String expectedWarningMsg = "Warning: Payment method required!\n" +
                "×";
        Assert.assertEquals( actualWarningMsg,expectedWarningMsg );
}

}



