package com.homework.pages.frames;

import com.homework.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class NestedFramesPage extends BasePage {
    private final
    By body = By.tagName("body");

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

    @FindBy(css = "frameset[name='frameset-middle']")
    WebElement frameset;

    @FindBy(css = "frame[name='frame-middle']")
    WebElement middle;

    @FindBy(css = "frame[name='frame-right']")
    WebElement right;

    @FindBy(css = "frame[name='frame-bottom']")
    WebElement bottom;

    public NestedFramesPage returnLeftFrame(String name) {
        moveToFrame(top,left, name);
        return this;
    }

    public NestedFramesPage returnMiddleFrame(String name) {
        moveToFrame(top, middle, name);
        return this;
    }

    public NestedFramesPage returnRightFrame(String name) {
        moveToFrame(top, right, name);
        return this;
    }

    public NestedFramesPage returnBottomFrame(String name) {
        moveToFrame(null, bottom, name);
        return this;
    }

    public String moveToFrame(WebElement parentElement, WebElement element, String text) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(parentElement);
        driver.switchTo().frame(element);
        Assert.assertTrue(bodyText().contains(text));
        System.out.println(bodyText());
        return bodyText();
    }
}
