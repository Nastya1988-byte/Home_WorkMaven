package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getHoversPage();
    }

    @Test
    public void hoversTest(){
        new HoversPage(driver)
                .hoverInformation()
                .verifyHover()
                .moveToNewWindow();
    }

}
