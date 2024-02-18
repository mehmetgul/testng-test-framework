package com.example.pomdesignpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchProductPage {
    private WebDriver driver;

    public SearchProductPage(WebDriver driver){
        this.driver = driver;
    }
    private final By searchBox =By.xpath("//input[@id='gh-search-input']");
    private final By searchButton =By.xpath("(//*[name()='svg'][@role='img'])[4]");
    private final By addToCart =By.xpath("(//div[contains(@class,'column-right')]//button)[2]");
    private final By goToCart =By.xpath("//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[3]/div/div[1]/a");
    private final By orderSummary =By.xpath("//h2[@id='cart-order-summary']");

    public void searchBox(String searchText){
        WebElement search = driver.findElement(searchBox);
        search.sendKeys(searchText);
    }

    public void searchButton(){
        WebElement button = driver.findElement(searchButton);
        button.click();
    }
    public void addToCart(){
        WebElement button = driver.findElement(addToCart);
        button.click();
    }
    public void goToCart(){
        WebElement button = driver.findElement(goToCart);
        button.click();
    }
    public String getOrderSummary(){
        return driver.findElement(orderSummary).getText();
    }

    ///////////////////////////////////////////////////////////////////
    public void clickAnElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement clickElement = wait.until(ExpectedConditions.elementToBeClickable(by));
        clickElement.click();
    }
    public void searchText(By by, String searchText){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement sendText = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        sendText.sendKeys(searchText);
    }
    public String verifyText(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement getText = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return getText.getText();
    }

    public void searProduct(String text) {
        searchText(searchBox,text);
        clickAnElement(searchButton);
        clickAnElement(addToCart);
        clickAnElement(goToCart);
    }
    public String getProductTitle(){
        return verifyText(orderSummary);
    }
}
