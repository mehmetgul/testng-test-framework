package com.example.paralleltesting.pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsClass2 {
    @Test(groups = "regression")
    public void testEbaySoftAssertion() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        SoftAssert softAssert = new SoftAssert();

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        String expectedTitle = "Shop by Category | eBay";
        String actualTitle = driver.getTitle();
        softAssert.assertEquals(actualTitle, expectedTitle, "Assertion Failed!!!!");
        System.out.println("Assertion Successful");
        driver.close();
        //At the end of the assertions, we need to use below assertAll() method.
        softAssert.assertAll();
    }


}
