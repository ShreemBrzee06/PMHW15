package com.tutorialsninja.desktops;


import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.tutorialsninja.driverfactory.ManageBrowser.driver;

public class DesktopsPage extends Utility {
    By clickOnDesktop = By.xpath("//ul[@class='nav navbar-nav']/li[1]//a[@class='dropdown-toggle']");
    By clickOnShowAllDesktops =By.linkText("Show AllDesktops");
    By clickedOnSortButton = By.xpath("//select[@id='input-sort']");

    By clickOnHPProduct = By.linkText("HP LP3065");
    By dateField = By.id("input-option225");
    By quantity =By.id("input-quantity");
    By addToCartButton = By.xpath("//div[@class='form-group']//button[@id='button-cart']");

    By cartTotal = By.id("cart-total");
    By actualSuccessShoppingMsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    By clickOnShoppingCartLinkOnSuccessMsg = By.linkText("shopping cart");
    By afterSuccessShoppingCartMsg = By.xpath("//div[@id='content']//h1");
    By verifyProductNameHP = By.linkText("HP LP3065");
    By verifyDeliveryDate= By.cssSelector(".table-responsive>table>tbody>tr>td+td>small:first-of-type");
    By verifyModelName = By.xpath("//div[@class='table-responsive']//table//tbody//tr[1]//td[3]");
    By totalAmountMSG = By.xpath("//div[@class='table-responsive']//table//tbody//tr[1]//td[6]");

    public void clickOnDesktopAndShowAllDesktops(){
        mouseHoverToElementAndClick(clickOnDesktop);
        mouseHoverToElementAndClick(clickOnShowAllDesktops);
    }

    public void selectSortByPositionAndVerify(){
        // list of the product displayed before sort button
        List<WebElement> beforeSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> beforeSortFilters = new ArrayList<>();
        for (WebElement s : beforeSortFilter) {
            System.out.println(s.getText());
        }
        // list of the product after clicked on sort button
        WebElement sort = driver.findElement(clickedOnSortButton);
        sort.click();

        Select s = new Select(sort);
        s.selectByVisibleText("Name (Z - A)");
        List<WebElement> afterSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> afterSortFilters = new ArrayList<>();
        for (WebElement as : afterSortFilter) {
            System.out.println(as.getText());
        }
        Collections.sort(beforeSortFilters);
        Assert.assertEquals(beforeSortFilters,afterSortFilters);
       // Assert.assertNotEquals(beforeSortFilters, afterSortFilters);

    }

    public void clickOnSortButton(){
        // list of the product displayed before sort button
        List<WebElement> beforeSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> beforeSortFilters = new ArrayList<>();
        for (WebElement s : beforeSortFilter) {
            System.out.println(s.getText());
        }
        // list of the product after clicked on sort button

        WebElement sort = driver.findElement(clickedOnSortButton);
        sort.click();

        Select s = new Select(sort);
        s.selectByVisibleText("Name (A - Z)");
        List<WebElement> afterSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> afterSortFilters = new ArrayList<>();
        for (WebElement as : afterSortFilter) {
            System.out.println(as.getText());
        }
        Collections.sort(beforeSortFilters);
        Assert.assertEquals(beforeSortFilters,afterSortFilters);
    }

    public void selectProduct(){
        Reporter.log("Click on HPProduct"+ clickOnHPProduct.toString());
        clickOnElement(clickOnHPProduct);
    }
    public void verifyHPProductMsg(){
        selectProduct();
        String actualVerifyHPProductText = driver.getTitle();
        Reporter.log("verifyActualHPProduct Text"+actualVerifyHPProductText.toString());
        System.out.println(driver.getTitle());
        String expectedVerifyHPProductText = "HP LP3065";
        Reporter.log("verify expectedHPProduct Text"+ expectedVerifyHPProductText.toString());
        Assert.assertEquals(actualVerifyHPProductText,expectedVerifyHPProductText);
    }
    public void dateSelectionField(){
        clearTextFromField(dateField);
        sendTextToElement(dateField,"2022-11-30");
        Reporter.log("date field section"+ dateField.toString());
    }

    public void addQuantity(){
        clearTextFromField(quantity);
        sendTextToElement(quantity,"1");
        Reporter.log("addQuantity"+quantity.toString());
    }

    public void addToCartButton(){
    clickOnElement(addToCartButton);
    Reporter.log("add to cart button"+addToCartButton.toString());
    }

    public void cartTotal(){
        clickOnElement(cartTotal);
        Reporter.log("click on cart total"+ cartTotal.toString());
    }

    public void verifyTheSuccessShoppingCartMsg(){
        String actualSuccessShoppingMSG = getTextFromElement(actualSuccessShoppingMsg);
        Reporter.log("Verifying actual success shopping msg" + actualSuccessShoppingMsg.toString());
        String expectedSuccessShoppingMsg = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Reporter.log("Verifying expected success message" + expectedSuccessShoppingMsg);
        Assert.assertEquals(actualSuccessShoppingMSG, expectedSuccessShoppingMsg);
    }

    public void clickOnShoppingCartLinkOnSuccessMsg(){
        clickOnElement(clickOnShoppingCartLinkOnSuccessMsg);
    }

    public void verifyAfterSuccessShoppingCartMsg(){
        String actualAfterSuccessShoppingCartMSG = getTextFromElement(afterSuccessShoppingCartMsg);
        System.out.println(actualAfterSuccessShoppingCartMSG);
        String expectedAfterSuccessShoppingCartMSG = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(actualAfterSuccessShoppingCartMSG, expectedAfterSuccessShoppingCartMSG);
    }


    public void verifyProductNameHP(){
        String actualVerifyProductNameHPP = getTextFromElement(verifyProductNameHP);
        Reporter.log("actual verify product name"+ actualVerifyProductNameHPP.toString());
        String expectedVerifyProductNameHPP = "HP LP3065";
        Reporter.log("expected verify product name HPP"+ expectedVerifyProductNameHPP.toString());
        Assert.assertEquals(actualVerifyProductNameHPP,expectedVerifyProductNameHPP);
    }
    public void verifyDeliveryDate(){
        String actualDeliveryDateMsg =getTextFromElement(verifyDeliveryDate);
        Reporter.log("actual delivery date msg"+ actualDeliveryDateMsg.toString());
        String expectedDeliveryDateMsg ="Delivery Date:2022-11-30";
        Reporter.log("expected delivery date msg"+ expectedDeliveryDateMsg.toString());
        Assert.assertEquals(actualDeliveryDateMsg,expectedDeliveryDateMsg);
    }
    public void verifyModelName(){
        String actualModelNameMsg = getTextFromElement(verifyModelName);
        Reporter.log("actualModel Message"+actualModelNameMsg.toString());
        String expectedModelNameMsg = "Product 21";
        Reporter.log("expected model name msg"+ expectedModelNameMsg.toString());
        Assert.assertEquals(actualModelNameMsg,expectedModelNameMsg);
    }

    public void verifyTotalAmountMSG(){
        String actualTotalAmountMSG = getTextFromElement(totalAmountMSG);
        Reporter.log("actual Total amount msg"+actualTotalAmountMSG.toString());
        String expectedTotalAmountMsg = "$122.00";
        Reporter.log("expected total amount msg"+expectedTotalAmountMsg);
        Assert.assertEquals(actualTotalAmountMSG,expectedTotalAmountMsg);
    }



}
