package com.example.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsClass {

    @Test
    public void testEbayAssertion() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        String expectedTitle = "Shop by Category | eBays";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching");
        System.out.println("Assertion Successful");
    }

    @Test
    public void assertionTest() {
        int a = 5;
        int b = 5;
        String name = "Jack";
        String anotherName = "Jack";

        Assert.assertTrue(a == 5);
        Assert.assertTrue(name.equals(anotherName));
        Assert.assertFalse(!name.equals(anotherName));
    }
}
