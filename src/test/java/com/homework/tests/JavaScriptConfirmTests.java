package com.homework.tests;

import com.homework.pages.HomePage;
import com.homework.pages.JavaScriptAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptConfirmTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlert();
    }

    @Test
    public void confirmButtonTests(){
        new JavaScriptAlertsPage(driver)
                .selectOnConfirmButton("Cancel")
                .verifyConfirmResult("You clicked: Cancel");
    }
}
