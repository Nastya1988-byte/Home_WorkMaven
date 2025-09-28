package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.HorisontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHorizontalSlider();
    }

    @Test
    public void sliderTest() {
        new HorisontalSliderPage(driver)
                .moveSliderInHorizontalDirection()
                .verifySlider("5");
    }

}
