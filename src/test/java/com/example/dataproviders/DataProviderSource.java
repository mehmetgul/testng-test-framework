package com.example.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderSource {
    @DataProvider(name="test1")
    public Object[][] createData(){
        return new Object[][]{
                {"Alice",20},
                {"Bob",40},
                {"John",50}
        };
    }

    @DataProvider(name = "testData")
    public Object[][] credentials(){
        return new Object[][]{
                {"a@gmail.com","a123","Mike","Born"},
                {"b@gmail.com","b123","John","Doe"},
                {"c@gmail.com","c123","Jon","X"},
                {"d@gmail.com","d123","Mary","Jane"},
        };
    }
    ReadExcelLibrary readExcelLibrary = new ReadExcelLibrary();
    @DataProvider(name="viaExcelSource")
    public Object[][] getSourceFromExcel(){
        String filePath=System.getProperty("user.dir")+"/src/test/java/com/example/dataproviders/excelfiles/sampledatainsurance.xlsx";
        return readExcelLibrary.getExcelData(filePath,"PolicyData",10);
    }

    @DataProvider(name="foodSales")
    public Object[][] getSourceFromExcel1(){
        String filePath=System.getProperty("user.dir")+"/src/test/java/com/example/dataproviders/excelfiles/sampledatafoodsales.xlsx";
        return readExcelLibrary.getExcelData(filePath,"FoodSales",8);
    }
}
