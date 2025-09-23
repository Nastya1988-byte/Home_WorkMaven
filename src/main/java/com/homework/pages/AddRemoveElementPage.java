package com.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveElementPage extends BasePage {
    public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='addElement()']")
    WebElement add;

    public AddRemoveElementPage clickOnAddButton() {
        click(add);
        return this;
    }


//    @FindBy(css = "button[onclick='deleteElement()']")
//    WebElement delete;

    //    public AddRemoveElementPage verifyDeleteButton() {
//        Assert.assertTrue(delete.isDisplayed());
//        return this;
//    }

    @FindBy(id = "elements")
    WebElement elements;

    public boolean verifyDeleteButton() {
        List<AddRemoveElementPage> elements = new ArrayList<>();
        if (elements.size() != 0) {
            return true;
        }
        return false;
    }

    @FindBy(css = "button[onclick='deleteElement()']")
    WebElement delete;

    public AddRemoveElementPage clickOnDeleteButton() {
        click(delete);
        return this;
    }

    @FindBy(id = "elements")
    WebElement elementsIsEmpty;

    public boolean verifyDeleteElements() {
        List<AddRemoveElementPage> elementsIsEmpty = new ArrayList<>();
        if (elementsIsEmpty.size() == 0) {
            return true;
        }
        return false;
    }
}
