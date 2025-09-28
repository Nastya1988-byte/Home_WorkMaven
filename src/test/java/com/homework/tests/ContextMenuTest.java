package com.homework.tests;

import com.homework.pages.ContextMenuPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getContextMenu();
    }

    @Test
    public void rightClick(){
        new ContextMenuPage(driver)
                .clickTest()
                .verifyContextMenu("You selected a context menu");
    }

}
