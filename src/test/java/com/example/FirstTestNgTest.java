package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNgTest {

    @Test(description = "Click search button and print the page title",
            groups = "regression")
    public void myFirstTest() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
