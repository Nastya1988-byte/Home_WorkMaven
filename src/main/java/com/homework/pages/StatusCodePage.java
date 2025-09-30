package com.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.Spliterators.iterator;

public class StatusCodePage extends BasePage {
    public StatusCodePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a")
    List<WebElement> links;

    public StatusCodePage checkAllLinks() {
        System.out.println("Total links on the page - " + links.size());
        return this;
    }

    public StatusCodePage checkStatusLinks() {
        String mainUrl = driver.getCurrentUrl();

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Is empty");
                continue;

            }
            verifyLinks(url);

            driver.navigate().to(url);
            String pageText = driver.findElement(By.tagName("body")).getText();
            System.out.println("--> "+ url);
            System.out.println(pageText);
            System.out.println("************************");

            driver.navigate().back();

        }
        return this;
    }

}
