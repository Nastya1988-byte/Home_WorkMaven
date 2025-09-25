package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getMultipleWindows();
    }

    @Test
    public void newTabTests() {
        new MultipleWindowsPage(driver)
                .switchNewTab(1)
                .verifyNewTabTitle("New Window");

    }
}
