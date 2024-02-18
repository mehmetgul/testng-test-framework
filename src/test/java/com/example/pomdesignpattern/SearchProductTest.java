package com.example.pomdesignpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest {
    WebDriver driver;
    @Test
    public void searchIphone() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        driver.findElement(By.xpath("//input[@id='gh-search-input']"))
                .sendKeys("Iphone");
        driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[4]"))
                .click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[contains(@class,'column-right')]//button)[2]"))
                .click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[3]/div/div[1]/a"))
                .click();

        driver.close();
    }

    @Test
    public void searchIphone1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='gh-search-input']"));
        searchBox.sendKeys("Iphone");

        WebElement searchButton = driver.findElement(By.xpath("(//*[name()='svg'][@role='img'])[4]"));
        searchButton.click();
        Thread.sleep(3000);

        WebElement addToCart= driver.findElement(By.xpath("(//div[contains(@class,'column-right')]//button)[2]"));
        addToCart.click();
        Thread.sleep(6000);

        WebElement goToCart = driver.findElement(By.xpath("//*[@id=\"attach-modal-drawer-overlay-backdrop\"]/div/div[3]/div/div[1]/a"));
        goToCart.click();

        driver.close();
    }

    /**
     * Page Object Design Pattern started
     */
    @Test
    public void searchIphone2() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.searchBox("Iphone");
        searchProductPage.searchButton();
        searchProductPage.addToCart();
        Thread.sleep(3000);
        searchProductPage.goToCart();
        String actualResult= searchProductPage.getOrderSummary();
        String expectedResult= "Order Summary";
        Assert.assertEquals(actualResult,expectedResult,"Assertion Fail");

        driver.close();
    }

    @Test
    public void searchIphone3() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        searchProductPage.searProduct("Iphone");
        String actualResult= searchProductPage.getProductTitle();
        String expectedResult= "Order Summary";
        Assert.assertEquals(actualResult,expectedResult,"Assertion Fail");

        driver.close();
    }
}
