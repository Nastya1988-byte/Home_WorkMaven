package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//img[@alt='User Avatar'])[2]")
    WebElement userAvatar;

    public HoversPage hoverInformation() {
        pause(1000);
        new Actions(driver).moveToElement(userAvatar).perform();
        pause(1000);
        return this;
    }

    @FindBy(css = "a[href='/users/2']")
    WebElement userProfile;

    public HoversPage moveToNewWindow() {
        new Actions(driver).moveToElement(userProfile).click().perform();
        return this;
    }


    @FindBy(xpath = "//h5[normalize-space()='name: user2']")
    WebElement userName;

    public HoversPage verifyHover() {
        Assert.assertTrue(userName.isDisplayed());
        return this;
    }
}
