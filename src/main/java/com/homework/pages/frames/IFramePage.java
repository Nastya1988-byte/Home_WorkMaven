package com.homework.pages.frames;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class IFramePage extends BasePage {
    public IFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement>iframe;

    public IFramePage returnListOfFrames() {
        System.out.println("The total number iframes are " + iframe.size());
        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length")
                .toString());
        System.out.println("The total number of iframes are " + numberOfFrames);
        return this;
    }


    public IFramePage switchToIFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(xpath = "//p[normalize-space()='Your content goes here.']")
    WebElement contentText;
    public IFramePage verifyIframeByText(String text) {
        Assert.assertTrue(contentText.getText().contains(text));
        driver.switchTo().parentFrame();
        return this;
    }
}
