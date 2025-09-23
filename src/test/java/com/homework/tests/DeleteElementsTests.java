package com.homework.tests;

import com.homework.pages.AddRemoveElementPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteElementsTests extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver)
                .getAddRemoveElements()
                .clickOnAddButton();
    }
    @Test
    public void deleteElementTests(){
        new AddRemoveElementPage(driver)
                .clickOnDeleteButton()
                .verifyDeleteElements();
    }
}
