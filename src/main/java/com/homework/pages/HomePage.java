package com.homework.pages;

import com.homework.pages.frames.FramesPage;
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

    @FindBy(css = "a[href='/frames']")
    WebElement frames;

    public FramesPage getFrames() {
        click(frames);
        return new FramesPage(driver);
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropdown;

    public DropdownPage getDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    @FindBy(css = "a[href='/windows']")
    WebElement windows;

    public MultipleWindowsPage getMultipleWindows() {
        click(windows);
        return new MultipleWindowsPage(driver);
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement horizontalSlider;

    public HorisontalSliderPage getHorizontalSlider() {
        click(horizontalSlider);
        return new HorisontalSliderPage(driver);
    }

    @FindBy(css = "a[href='/hovers']")
    WebElement hovers;

    public HoversPage getHoversPage() {
        click(hovers);
        return new HoversPage(driver);
    }

    @FindBy(css = "a[href='/context_menu']")
    WebElement contextMenu;

    public ContextMenuPage getContextMenu() {
        click(contextMenu);
        return new ContextMenuPage(driver);
    }

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement daragDrop;

    public DragAndDropPage getDragDropPage() {
        click(daragDrop);
        return new DragAndDropPage(driver);
    }

    @FindBy(css = "a[href='/broken_images']")
    WebElement brokenImages;

    public BrokenImagesPage getBrokenImages() {
        click(brokenImages);
        return new BrokenImagesPage(driver);
    }

    @FindBy(css = "a[href='/redirector']")
    WebElement redirector;

    public RedirectLinkPage getRedirectLink() {
        click(redirector);
        return new RedirectLinkPage(driver);
    }
}
