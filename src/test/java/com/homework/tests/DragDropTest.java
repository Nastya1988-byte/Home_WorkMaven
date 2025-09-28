package com.homework.tests;

import com.homework.pages.DragAndDropPage;
import com.homework.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDragDropPage();
    }

    @Test
    public void actionDragDropTest(){
        new DragAndDropPage(driver)
                .moveElementB()
                .verifyDragDrop("B");
    }
}
