package com.homework.pages;

import org.openqa.selenium.WebDriver;

public class BasicAuthPage extends BasePage{
    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    public BasicAuthPage typeInUserName(String userName) {
        if (userName==null) {
            driver.switchTo().alert().sendKeys(userName);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    public BasicAuthPage typeInPassword(String password) {
        if (password==null) {
            driver.switchTo().alert().sendKeys(password);
            driver.switchTo().alert().accept();
        }
        return this;
    }

}
