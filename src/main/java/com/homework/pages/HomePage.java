package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/abtest']")
    WebElement abtest;

    public ABTestingPage getABTesting() {
        click(abtest);
        return new ABTestingPage(driver);
    }

    @FindBy(css = "a[href='/add_remove_elements/']")
    WebElement removeElements;

    public AddRemoveElementPage getAddRemoveElements() {
        click(removeElements);
        return new AddRemoveElementPage(driver);
    }

    @FindBy(css = "a[href='/basic_auth']")
    WebElement basic;

    public BasicAuthPage getBasicAuthPage() {
        click(basic);
        return new BasicAuthPage(driver);
    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement javascript_alerts;

    public JavaScriptAlertsPage getJavaScriptAlert() {
        click(javascript_alerts);
        return new JavaScriptAlertsPage(driver);
    }
}
