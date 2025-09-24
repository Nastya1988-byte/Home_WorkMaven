package com.homework.pages.frames;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/nested_frames']")
    WebElement nested_frames;

    public NestedFramesPage selectNestedFrames() {
        click(nested_frames);
        return new NestedFramesPage(driver);
    }

    @FindBy(css = "a[href='/iframe']")
    WebElement iFrame;

    public IFramePage selectIFrame() {
        click(iFrame);
        return new IFramePage(driver);
    }
}
