package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.JavaScriptAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptAlertsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlert();
    }
    @Test
    public void alertButtonTests(){
        new JavaScriptAlertsPage(driver)
                .selectOnAlertButton("I am a JS Alert")
                .verifyAlertResult("You successfully clicked an alert");
    }

}
