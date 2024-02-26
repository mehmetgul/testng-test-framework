package com.example.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test "+result.getName()+" started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test "+result.getName()+" passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test "+result.getName()+" failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test "+result.getName()+" skipped");
    }

}
