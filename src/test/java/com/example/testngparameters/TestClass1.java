package com.example.testngparameters;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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

    @Parameters("username")
    @Test(groups = {"regression","API"},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase4(String username){
        System.out.println("username = " + username);
        System.out.println("Test Case 4");
    }

    @Parameters({"username","password"})
    @Test(groups = {"regression","database"},
            description = "Verify login functionality with correct credentials"
    )
    public void testCase5(String username, String password){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("Test Case 3");
    }
}
