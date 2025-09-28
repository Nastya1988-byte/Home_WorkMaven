package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-b")
    WebElement columnB;

    @FindBy(id = "column-a")
    WebElement columnA;

    public DragAndDropPage moveElementB() {
        pause(1000);
        new Actions(driver).dragAndDrop(columnB,columnA).perform();
        return this;
    }

    public DragAndDropPage verifyDragDrop(String header) {
//        Assert.assertTrue(columnA.getText().contains(header));
        Assert.assertTrue(shouldHaveText(columnA, header, 5));
        return this;
    }
}
