package com.homework.pages.selenium;

import com.homework.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ElementalSeleniumPage extends BasePage {
    public ElementalSeleniumPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Elemental Selenium']")
    WebElement logo;


    public ElementalSeleniumPage verifyElementalSeleniumPage(String text) {
        switchToNewTab();
        shouldHaveText(text, 10);

        Assert.assertTrue(driver.getTitle().contains(text));
        Assert.assertTrue(logo.isDisplayed());

        return this;
    }

}
