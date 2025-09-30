package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedirectLinkPage extends BasePage{
    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "redirect")
    WebElement redirect;

    public StatusCodePage selectHereButton() {
        click(redirect);
        return new StatusCodePage(driver);
    }
}
