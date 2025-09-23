package com.homework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage {

    public WebDriver driver;
    public static JavascriptExecutor js;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        js=(JavascriptExecutor) driver;
    }
    public void click(WebElement element){
        element.click();
    }

    public void clickWithJs(WebElement element, int x, int y){
        moveWithJs(x,y);
        click(element);
    }

    private void moveWithJs(int x, int y) {
        js.executeScript("window.scrollBy("+ x +","+ y +")");
    }

    public void type(WebElement element, String text){
        if (text!=null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public void typeWithJs(WebElement element, String text, int x, int y){
        moveWithJs(x,y);
        type(element, text);
    }

    protected void switchToNewTab() {
        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    protected boolean shouldHaveText(String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.titleContains(text));
    }
}
