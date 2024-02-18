package com.example.pomdesignpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductElements {
    private WebDriver driver;

    public SearchProductElements(WebDriver driver) {
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
}
