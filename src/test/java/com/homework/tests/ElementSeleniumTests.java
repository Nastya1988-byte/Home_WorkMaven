package com.homework.tests;

import com.homework.pages.ABTestingPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementSeleniumTests extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getABTesting();
    }

    @Test
    public void elementSeleniumTests(){
        new ABTestingPage(driver)
                .clickOnElementalSeleniumLink()
                .verifyElementalSeleniumPage("Elemental Selenium");
    }
}
