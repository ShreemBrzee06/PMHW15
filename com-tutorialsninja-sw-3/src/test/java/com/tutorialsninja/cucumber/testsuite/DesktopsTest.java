package com.tutorialsninja.cucumber.testsuite;

import com.ninjatutorials.desktops.DesktopsPage;
import com.ninjatutorials.testbase.TestBase;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {

    DesktopsPage desktopsPage = new DesktopsPage();
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder()
    {   //1.1 Mouse hover on Desktops Tab.and click
        //1.2 Click on “Show All Desktops”
        desktopsPage.clickOnDesktopAndShowAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        //1.4 Verify the Product will arrange in Descending order.
        desktopsPage.selectSortByPositionAndVerify();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        //2.1 Mouse hover on Desktops Tab. and click
        //2.2 Click on “Show All Desktops”
        desktopsPage.clickOnDesktopAndShowAllDesktops();
        //2.3 Select Sort By position "Name: A to Z"
        desktopsPage.clickOnSortButton();
        //2.4 Select product “HP LP3065”
        desktopsPage.selectProduct();
        //2.5 Verify the Text "HP LP3065"
        desktopsPage.verifyHPProductMsg();
        //2.6 Select Delivery Date "2022-11-30"
        desktopsPage.dateSelectionField();
        //2.7.Enter Qty "1” using Select class.
        desktopsPage.addQuantity();
        //2.8 Click on “Add to Cart” button
        desktopsPage.addToCartButton();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        desktopsPage.verifyTheSuccessShoppingCartMsg();
        //2.10 Click on link “shopping cart” display into success message
        desktopsPage.clickOnShoppingCartLinkOnSuccessMsg();
        //2.11 Verify the text "Shopping Cart"
        desktopsPage.verifyAfterSuccessShoppingCartMsg();
        //2.12Verify the Product name "HP LP3065"
        desktopsPage.verifyProductNameHP();
        //2.13 Verify the Delivery Date "2022-11-30"
        desktopsPage.verifyDeliveryDate();
        //2.14 Verify the Model "Product21"
        desktopsPage.verifyModelName();
        //2.15 Verify the Total "$122.00"
        desktopsPage.verifyTotalAmountMSG();



    }
}
