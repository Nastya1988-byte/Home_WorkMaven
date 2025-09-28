package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpot;

    public ContextMenuPage clickTest() {
        new Actions(driver).contextClick(hotSpot).perform();
        return this;
    }

    public ContextMenuPage verifyContextMenu(String messege) {
        Assert.assertTrue(
                driver.switchTo().alert().getText().contains(messege));
        driver.switchTo().alert().accept();
        return this;
    }
}
