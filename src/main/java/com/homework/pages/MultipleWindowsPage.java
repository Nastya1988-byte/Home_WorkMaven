package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement clickHere;

    public MultipleWindowsPage switchNewTab(int index) {
        click(clickHere);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy(css = "div[class='example'] h3")
    WebElement newWindow;

    public MultipleWindowsPage verifyNewTabTitle(String text) {
        Assert.assertTrue(newWindow.getText().contains(text));
        return this;
    }
}
