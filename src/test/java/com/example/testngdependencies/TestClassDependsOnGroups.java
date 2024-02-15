package com.example.testngdependencies;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassDependsOnGroups {

    @Test(groups = "smoke",dependsOnGroups = "api")
    public void testCase1(){
        System.out.println("Test Case 1");
    }

    @Test(groups = "regression")
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @Test(groups = {"ui","smoke"})
    public void testCase3(){
        System.out.println("Test Case 3");
    }

    @Test(groups = {"regression","database"})
    public void testCase4(){
        System.out.println("Test Case 4");
    }

    @Test(groups = "database")
    public void testCase5(){
        System.out.println("Test Case 5");
    }

    @Test(groups = "api")
    public void testCase6(){
        System.out.println("Test Case 6");
    }
}
