package com.example.testnggroups;

import org.testng.annotations.*;

public class TestClass1 {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("##### Before Method #####");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("##### After Method #####");
    }

    @Test(groups = {"smoke","regression"},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase1(){
        System.out.println("Test Case 1");
    }
    @Test(groups = {"smoke"},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase2(){
        System.out.println("Test Case 2");
    }
    @Test(groups = {"regression"},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase3(){
        System.out.println("Test Case 3");
    }

    @Test(groups = {"regression","API"},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase4(){
        System.out.println("Test Case 4");
    }
    @Test(groups = {"regression","database "},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase5(){
        System.out.println("Test Case 3");
    }
}
