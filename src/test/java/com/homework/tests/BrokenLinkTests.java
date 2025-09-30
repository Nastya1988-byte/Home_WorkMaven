package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.RedirectLinkPage;
import com.homework.pages.StatusCodePage;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinkTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getRedirectLink();
        new RedirectLinkPage(driver).selectHereButton();
    }

    @Test
    public void checkAllLinksTest(){
        new StatusCodePage(driver).checkAllLinks();
    }
    @Test
    public void statusCodesTest(){
        new StatusCodePage(driver).checkStatusLinks();
    }
}
