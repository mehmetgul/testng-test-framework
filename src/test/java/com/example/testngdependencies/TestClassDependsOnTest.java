package com.example.testngdependencies;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassDependsOnTest {


    @Test(dependsOnMethods = {"testCase4"})
    public void testCase1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @Test(dependsOnMethods = "testCa.*")
    public void testCase3(){
        System.out.println("Test Case 3");
    }

    @Test
    public void testCase4(){
        System.out.println("Test Case 4");
    }

    @Test
    public void testCase5(){
        System.out.println("Test Case 5");
    }
}
