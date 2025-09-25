package com.homework.tests;

import com.homework.pages.DropdownPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdown();
    }

    @Test
    public void selectTest(){
        new DropdownPage(driver)
                .selectStyle("Option 1")
                .verifySelect();
    }
}
