package com.example.htmlreports.allurereports.pkg1;

import com.example.Driver;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.qameta.allure.SeverityLevel.CRITICAL;

@Feature("Ebay Search Assertion feature")
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
    @Story("Assertion testing for EBAY")
    @Severity(CRITICAL)
    @Owner("Mehmet")
    @Link(name = "Website", url = "https://dev.example.com/")
    @Issue("AUTH-124")
    @TmsLink("TMS-457")
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
    @Story("Assertion testing")
    @Description("This is for testing the hard assertion")
    @Severity(CRITICAL)
    @Owner("Mehmet")
    @Link(name = "Website", url = "https://dev.example.com/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
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
