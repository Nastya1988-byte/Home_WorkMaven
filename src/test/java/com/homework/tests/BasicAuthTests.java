package com.homework.tests;

import com.homework.pages.BasicAuthPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAuthTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBasicAuthPage();
    }

    @Test
    public void typeRegistretionToAlertTest() {
        new BasicAuthPage(driver)
                .typeInUserName("Buch")
                .typeInPassword("An#123456");
    }
}
