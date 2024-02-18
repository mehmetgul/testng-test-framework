package com.example.pomdesignpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchProductPageWithFactory {
    private WebDriver driver;

    public SearchProductPageWithFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='gh-search-input']")
    WebElement searchBox;
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[4]")
    WebElement searchButton;
    @FindBy(xpath = "(//div[contains(@class,'column-right')]//button)[2]")
    WebElement addToCart;
    @FindBy(xpath = "//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[3]/div/div[1]/a")
    WebElement goToCart;
    @FindBy(xpath = "//h2[@id='cart-order-summary']")
    WebElement orderSummary;

    public void searchBox(String searchText) {
        searchBox.sendKeys(searchText);
    }
    public void searchButton() {
        searchButton.click();
    }
    public void addToCart() {
        addToCart.click();
    }
    public void goToCart() {
        goToCart.click();
    }
    public String getOrderSummary() {
        return orderSummary.getText();
    }

    ///////////////////////////////////////////////////////////////////
    public void clickAnElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement clickElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        clickElement.click();
    }

    public void searchText(WebElement element, String searchText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement sendText = wait.until(ExpectedConditions.visibilityOf(element));
        sendText.sendKeys(searchText);
    }

    public String verifyText(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement getText = wait.until(ExpectedConditions.visibilityOf(element));
        return getText.getText();
    }

    public void searProduct(String text) {
        searchText(searchBox, text);
        clickAnElement(searchButton);
        clickAnElement(addToCart);
        clickAnElement(goToCart);
    }

    public String getProductTitle() {
        return verifyText(orderSummary);
    }
}
