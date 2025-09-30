package com.homework.tests;

import com.homework.pages.BrokenImagesPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBrokenImages();
    }

    @Test
    public void checkBrokenImagesTest(){
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}
