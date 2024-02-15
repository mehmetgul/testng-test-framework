package com.example.dataproviders;

import org.testng.annotations.Test;

public class DataProviderTestClass {



    @Test(dataProviderClass = DataProviderSource.class,
            dataProvider = "test1")
    public void myTest(String name, int age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @Test(dataProviderClass = DataProviderSource.class, dataProvider = "test1")
    public void myTestObject(Object[] value){
        String name= value[0].toString();
        int age = (int) value[1];
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @Test(dataProviderClass = DataProviderSource.class, dataProvider = "testData")
    public void verifyCredentials(String email, String password, String name, String lastName){
        System.out.println("email = " + email);
        System.out.println("password = " + password);
        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("++++++++++++++++++++++++++++++++");
    }

    @Test(dataProviderClass = DataProviderSource.class, dataProvider = "testData")
    public void verifyCredentials1(String[] values){
        System.out.println("email = " + values[0]);
        System.out.println("password = " + values[1]);
        System.out.println("name = " + values[2]);
        System.out.println("lastName = " + values[3]);
        System.out.println("++++++++++++++++++++++++++++++++");
    }

    @Test(dataProviderClass = DataProviderSource.class, dataProvider = "testData")
    public void verifyCredentials2(String... values){
        System.out.println("email = " + values[0]);
        System.out.println("password = " + values[1]);
        System.out.println("name = " + values[2]);
        System.out.println("lastName = " + values[3]);
        System.out.println("++++++++++++++++++++++++++++++++");
    }


    @Test(dataProviderClass = DataProviderSource.class, dataProvider = "viaExcelSource")
    public void getDataFromExcelFile(Object[] values){
        System.out.println("values.length = " + values.length);
        System.out.println("values[0] = " + values[0]);
        System.out.println("values[1] = " + values[1]);
        System.out.println("values[2] = " + values[2]);
        System.out.println("+++++++++++++++++++++++++++");
    }

    @Test(dataProviderClass = DataProviderSource.class, dataProvider = "foodSales")
    public void getDataOfFoodSales(Object[] values){
        String orderDate = values[0].toString();
        String region = values[1].toString();
        String city= values[2].toString();
        String category = values[3].toString();
        String product = values[4].toString();
        Double quantity = Double.valueOf(values[5].toString());
        Double unitPrice = Double.valueOf(values[6].toString());
        System.out.println("-----------------------------------");
        System.out.println("Your order date is: "+orderDate);
        System.out.println("region = " + region);
        System.out.println("city = " + city);
        System.out.println("category = " + category);
        System.out.println("product = " + product);
        System.out.println("quantity = " + quantity);
        System.out.println("unitPrice = " + unitPrice);
        System.out.println("-----------------------------");
        System.out.println("Your Total Price = " + quantity*unitPrice);
    }
}
