package com.example.testngdependencies;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassPriority {
    @Test(priority = 4)
    public void testCase1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @Test(priority = 2)
    public void testCase3(){
        System.out.println("Test Case 3");
    }

    @Test
    public void testCase4(){
        System.out.println("Test Case 4");
    }

    @Test(priority = 1)
    public void testCase5(){
        System.out.println("Test Case 5");
    }
}
