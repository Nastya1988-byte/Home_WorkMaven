package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorisontalSliderPage extends BasePage {
    public HorisontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[value='0']")
    WebElement input;

    @FindBy(id = "range")
    WebElement range;

    public HorisontalSliderPage moveSliderInHorizontalDirection() {

        new Actions(driver).dragAndDropBy(input, 55, 0).perform();
        return this;
    }


    public HorisontalSliderPage verifySlider(String value) {
        Assert.assertTrue(shouldHaveText(range, value, 3));
        return this;
    }
}
