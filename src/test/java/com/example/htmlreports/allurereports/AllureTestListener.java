package com.example.htmlreports.allurereports;

import com.example.Driver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class AllureTestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = Driver.getDriver();
        System.out.println("Screenshot taken");
        byte[] screenshotsBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Failed Test Screenshot", new ByteArrayInputStream(screenshotsBytes));
    }
}
