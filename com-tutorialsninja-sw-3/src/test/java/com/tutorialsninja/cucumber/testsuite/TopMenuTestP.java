package com.tutorialsninja.cucumber.testsuite;

import com.ninjatutorials.homepage.TopMenuTest;
import com.ninjatutorials.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTestP extends TestBase {

    TopMenuTest topMenuTest = new TopMenuTest();
//Create the package homepage
//1. create class "TopMenuTest"
//1.1 create method with name "selectMenu" it has one parameter name "menu" of type
//string
//1.2 This method should click on the menu whatever name is passed as parameter.
//Write the following Test:

    public void menu(String menu,String menuOptions){
        topMenuTest.selectMenu(menu);
        topMenuTest.selectMenu(menuOptions);

    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //1.1 Mouse hover on “Desktops” Tab and click
       // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        menu("Computer","Show All Desktops");
        //1.3 Verify the text ‘Desktops’
        topMenuTest.getDeskTopMsg();
    }

@Test
public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”

    topMenuTest.clickOnLaptopsAndNotebook();
    //2.3 Verify the text ‘Laptops & Notebooks’
    topMenuTest.verifyLaptopAndNotebook();

}
@Test
public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
    //3.1 Mouse hover on “Components” Tab and click
    //3.2 call selectMenu method and pass the menu = “Show All Components”
    menu("Components","Show AllComponents");
    topMenuTest.clickOnComponent();
    //3.3 Verify the text ‘Components’
    topMenuTest.verifyComponentMsg();
}

}
