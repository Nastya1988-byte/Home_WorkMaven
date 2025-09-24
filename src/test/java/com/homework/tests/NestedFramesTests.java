package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.frames.FramesPage;
import com.homework.pages.frames.NestedFramesPage;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFrames();
        new FramesPage(driver).selectNestedFrames();
    }


    @Test
    public void frameTest() {
        new NestedFramesPage(driver)
                .returnListOfFrames()
                .switchToIframeByIndex(0)
                .verifyIframeByText("");
    }

}
