package com.homework.tests;

import com.homework.pages.AddRemoveElementPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddElementsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAddRemoveElements();
    }

    @Test
    public void addElementTest(){
        new AddRemoveElementPage(driver)
                .clickOnAddButton()
                .verifyDeleteButton();
    }
}
