package com.example.testsuitefiles.testclasses;

import org.testng.annotations.*;

public class TestClass2 {

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
    public void testCase4(){
        System.out.println("Test Case 4");
    }
    @Test
    public void testCase5(){
        System.out.println("Test Case 5");
    }
    @Test
    public void testCase6(){
        System.out.println("Test Case 6");
    }
}
