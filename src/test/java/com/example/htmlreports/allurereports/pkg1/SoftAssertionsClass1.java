package com.example.htmlreports.allurereports.pkg1;

import com.example.Driver;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Feature("Ebay Search Assertion feature")
public class SoftAssertionsClass1 {

    @Test(groups = "regression")
    @Description("Testing soft assertion for search functionality")
    @Story("Assertion testing for EBAY")
    public void testEbaySoftAssertion() {
        try {
            Driver.getDriver().get("https://www.ebay.com/");
            SoftAssert softAssert = new SoftAssert();

            WebElement searchButton = Driver.getDriver().findElement(By.xpath("//input[@id='gh-btn']"));
            Allure.step("Click directly search button");
            searchButton.click();
            String expectedTitle = "Shop by Category | eBay";
            Allure.step("Get title");
            String actualTitle = Driver.getDriver().getTitle();
            Allure.step("Verify title matches");
            softAssert.assertEquals(actualTitle, expectedTitle, "Assertion Failed!!!!");
            System.out.println("Assertion Successful");
            //At the end of the assertions, we need to use below assertAll() method.
            Allure.step("Verification successful");
            softAssert.assertAll();
        } catch (Exception e) {
            Driver.closeDriver();
            e.printStackTrace();
        }
    }


}
