package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JavaScriptAlertsPage extends BasePage {
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement alertButton;

    public JavaScriptAlertsPage selectOnAlertButton(String messege) {
        click(alertButton);
        if (messege != null) {
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public JavaScriptAlertsPage verifyAlertResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement confirmButton;

    public JavaScriptAlertsPage selectOnConfirmButton(String result) {
        click(confirmButton);
        if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    public JavaScriptAlertsPage verifyConfirmResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement promptButton;

    public JavaScriptAlertsPage selectOnPromptButton(String message) {
        click(promptButton);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        } else if (message == null) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    public JavaScriptAlertsPage verifyPromptResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
}
