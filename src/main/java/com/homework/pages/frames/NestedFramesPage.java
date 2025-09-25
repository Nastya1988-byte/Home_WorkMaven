package com.homework.pages.frames;

import com.homework.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class NestedFramesPage extends BasePage {
    private final By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }
    private String bodyText() {
        return driver.findElement(body).getText().trim();
    }

    @FindBy(xpath = "//frame[@name='frame-left']")
    WebElement left;

    @FindBy(css = "frame[name='frame-top']")
    WebElement top;

    @FindBy(css = "frame[name='frame-middle']")
    WebElement middle;

    @FindBy(css = "frame[name='frame-right']")
    WebElement right;

    @FindBy(css = "frame[name='frame-bottom']")
    WebElement bottom;

    public NestedFramesPage returnLeftFrame(String name) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(top);
        driver.switchTo().frame(left);
        Assert.assertTrue(bodyText().contains(name));
        System.out.println(bodyText());
        return this;
    }


    public NestedFramesPage returnMiddleFrame(String name) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(top);
        driver.switchTo().frame(middle);
        Assert.assertTrue(bodyText().contains(name));
        System.out.println(bodyText());
        return this;
    }

    public NestedFramesPage returnRightFrame(String name) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(top);
        driver.switchTo().frame(right);
        Assert.assertTrue(bodyText().contains(name));
        System.out.println(bodyText());
        return this;
    }

    public NestedFramesPage returnBottomFrame(String name) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(bottom);
        Assert.assertTrue(bodyText().contains(name));
        System.out.println(bodyText());
        return this;
    }
}
