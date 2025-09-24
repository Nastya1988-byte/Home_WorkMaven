package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.frames.FramesPage;
import com.homework.pages.frames.IFramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getFrames();
        new FramesPage(driver).selectIFrame();
    }

    @Test
    public void iFramesTests(){
        new IFramePage(driver)
                .returnListOfFrames()
                .switchToIFrameByIndex(0)
                .verifyIframeByText("Your content goes here.");
    }
}
