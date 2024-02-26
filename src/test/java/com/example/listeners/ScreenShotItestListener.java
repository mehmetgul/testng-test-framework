package com.example.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class ScreenShotItestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult testResult) {
        if (ITestResult.FAILURE == testResult.getStatus()) {

            // Ensure the driver is cast to TakesScreenshot
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

            // Capture the screenshot and store it as a File object
            File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String screenshotPath =
                    "target/screenshots/" + testResult.getName() + "_"
                            + new Date().getTime() + ".png";
            try {
                // Ensure directory exists
                Path screenshotDir = Paths.get(screenshotPath).getParent();
                // This will create any missing parent directories
                if (!Files.exists(screenshotDir)) {
                    Files.createDirectories(screenshotDir);
                }

                // Copy the screenshot file to the defined path
                FileHandler.copy(screenshotFile, new File(screenshotPath));
                System.out.println("Screenshot saved: " + screenshotPath);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Failed to capture screenshot.");
            }
        }
    }
}
