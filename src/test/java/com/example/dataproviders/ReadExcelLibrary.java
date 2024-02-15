package com.example.dataproviders;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelLibrary {
    public Object[][] getExcelData(String fileName, String sheetName, int numberOfCols) {
        File file = new File(fileName);

        XSSFWorkbook xssfWorkbook;
        XSSFSheet xssfSheet;
        Object[][] arr;

        try {
            FileInputStream excelFile = new FileInputStream(file);
            xssfWorkbook = new XSSFWorkbook(excelFile);
            xssfSheet = xssfWorkbook.getSheet(sheetName);
            int start = xssfSheet.getFirstRowNum();
            int end = xssfSheet.getLastRowNum();
            arr = new Object[end-start+1][numberOfCols];
            for (int i = start; i <= end; i++) {
                for (int j = 0; j < numberOfCols; j++) {
                    arr[i][j]= xssfSheet.getRow(i).getCell(j);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arr;
    }
}
