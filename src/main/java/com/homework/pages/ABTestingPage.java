package com.homework.pages;

import com.homework.pages.selenium.ElementalSeleniumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestingPage extends BasePage {
    public ABTestingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Elemental Selenium']")
    WebElement selenium;

    public ElementalSeleniumPage clickOnElementalSeleniumLink() {
        click(selenium);
        return new ElementalSeleniumPage(driver);
    }
}
