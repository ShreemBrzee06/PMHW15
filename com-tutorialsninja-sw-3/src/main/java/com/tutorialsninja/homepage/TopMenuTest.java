package com.tutorialsninja.homepage;

import com.ninjatutorials.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class TopMenuTest extends Utility {

    By menuOption = By.xpath("//ul[@class='nav navbar-nav']/li[1]//a[@class='dropdown-toggle']");
    By selectMenu =By.linkText("Show AllDesktops");

    By deskTopMsg = By.xpath("//div[@id='content']/h2");

    By clickOnLaptopsAndNotebook = By.xpath("//ul[@class='nav navbar-nav']/li[2]//a[@class='dropdown-toggle']");
    By clickOnShowAllLaptop= By.linkText("Show AllLaptops & Notebooks");
    By laptopMsg = By.xpath("//div[@id='content']/h2[1]");
    By clickOnComponent = By.xpath("//ul[@class='nav navbar-nav']/li[3]//a[@class='dropdown-toggle']");
    By clickOnShowAllComponent = By.linkText("Show AllComponents");
    public void selectMenu(String menu){
        Reporter.log("");
        mouseHoverToElementAndClick(menuOption);
        mouseHoverToElementAndClick(selectMenu);

       }



    public void getDeskTopMsg(){
        Reporter.log("Desktop  message"+ deskTopMsg.toString());
        String actualDesktopMSG = getTextFromElement(deskTopMsg);
        String expectedDeskTopMsg = "Desktops";
        System.out.println(actualDesktopMSG);
        Assert.assertEquals(actualDesktopMSG,expectedDeskTopMsg);
    }

    public void clickOnLaptopsAndNotebook(){
        Reporter.log("click on Laptop and Notebook:"+clickOnLaptopsAndNotebook.toString());
        mouseHoverToElementAndClick(clickOnLaptopsAndNotebook);
        Reporter.log("click on Laptop and Notebook:"+clickOnShowAllLaptop.toString());
        mouseHoverToElementAndClick(clickOnShowAllLaptop);

    }

    public void verifyLaptopAndNotebook(){
        Reporter.log("verify Laptop and Notebook: "+laptopMsg.toString());
        String actualLaptopMsg = getTextFromElement(laptopMsg);
        Reporter.log("Verify actual laptop message"+actualLaptopMsg.toString());
        System.out.println(actualLaptopMsg);
        String expectedLandNPg = "Laptops & Notebooks";
        Reporter.log("Verify laptop and notebook message"+actualLaptopMsg);
        Assert.assertEquals(actualLaptopMsg,expectedLandNPg);
    }

    public void clickOnComponent(){
        Reporter.log("click on component"+clickOnComponent.toString());
        mouseHoverToElementAndClick(clickOnComponent);
        Reporter.log("click on Show all components: "+ clickOnShowAllComponent.toString());
        mouseHoverToElementAndClick(clickOnShowAllComponent);
    }

    public void verifyComponentMsg(){
        String actualComponentMsg = driver.findElement(By.xpath("//div[@id='content']/h2[1]")).getText();
        Reporter.log("verify component Message"+actualComponentMsg);
        System.out.println(actualComponentMsg);
        String expectedComponentPg = "Components";
        Reporter.log("Verify Component Message"+ expectedComponentPg.toString());
        Assert.assertEquals(actualComponentMsg,expectedComponentPg);
    }




}

