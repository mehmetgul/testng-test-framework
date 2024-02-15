package com.example.testsuitefiles.testclasses;

import org.testng.annotations.*;

public class TestClass4 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("##### Before Suite #####");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("##### After Suite #####");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("##### Before Test #####");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("##### After Test #####");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("##### Before Class #####");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("##### After Class #####");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("##### Before Method #####");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("##### After Method #####");
    }

    @Test
    public void testCase10(){
        System.out.println("Test Case 10");
    }
    @Test
    public void testCase11(){
        System.out.println("Test Case 11");
    }
    @Test
    public void testCase12(){
        System.out.println("Test Case 12");
    }
}
