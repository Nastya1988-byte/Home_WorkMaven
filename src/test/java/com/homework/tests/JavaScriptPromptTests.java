package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.JavaScriptAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptPromptTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlert();
    }
    @Test
    public void promptButtonTests(){
        new JavaScriptAlertsPage(driver)
                .selectOnPromptButton("This is my Home work!")
                .verifyPromptResult("You entered: This is my Home work!");
    }
}
