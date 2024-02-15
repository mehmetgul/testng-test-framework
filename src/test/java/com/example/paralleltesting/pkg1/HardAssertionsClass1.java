package com.example.paralleltesting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsClass1 {

    @Test(groups = "regression")
    public void testEbayAssertion() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        String expectedTitle = "Shop by Category | eBays";
        String actualTitle = driver.getTitle();
        driver.close();
        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching");
        System.out.println("Assertion Successful");
    }

    @Test(groups = "regression")
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
