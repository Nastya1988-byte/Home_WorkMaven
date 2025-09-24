package com.homework.pages.frames;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "frameset[name='frameset-middle']")
    List<WebElement> frame;

    public NestedFramesPage returnListOfFrames() {

        System.out.println("The total number frames are " + frame.size());

        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length")
                .toString());
        System.out.println("The total number of frames are " + numberOfFrames);
        return this;
    }

    public NestedFramesPage switchToIframeByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "content")
    WebElement content;

    public NestedFramesPage verifyIframeByText(String text) {
        Assert.assertTrue(shouldHaveText(content, text, 1));
        return this;
    }



}
