package com.example.listeners.paralleltesting.pkg1;

import com.example.listeners.Driver;
import com.example.listeners.MyTestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class HardAssertionsClass1 {
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("Before Test started");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("After Test executed");
        Driver.closeDriver();
    }

    @Test(groups = "regression")
    public void testEbayAssertion() {
        try {
            Driver.getDriver().get("https://www.ebay.com/");
            WebElement searchButton = Driver.getDriver().findElement(By.xpath("//input[@id='gh-btn']"));
            searchButton.click();
            String expectedTitle = "Shop by Category | eBays";
            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "Titles are not matching");
            System.out.println("Assertion Successful");
        } catch (AssertionError e) {
            System.out.println("Inside Catch");
            throw new AssertionError();
        }
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
