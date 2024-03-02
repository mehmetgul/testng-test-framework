package com.example.dataproviders.json.utility;

import com.example.dataproviders.json.pojo.ex2.PolicyData;
import com.example.dataproviders.json.pojo.ex3.Policy;
import com.example.dataproviders.json.pojo.ex4.Policies;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSonUtility {
    //Example 1
    public Object[][] getJsonData(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            //List of objects
            List<Object> dataList = objectMapper.readValue(new File(filePath), new TypeReference<>() {
            });

            Object[][] dataArray = new Object[dataList.size()][1];
            for (int i = 0; i < dataList.size(); i++) {
                dataArray[i][0] = dataList.get(i);
            }
            return dataArray;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Example 2
    public Object[][] getJsonDataWithPojo(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            //List of PolicyData
            List<PolicyData> policyList = objectMapper.readValue(new File(filePath), new TypeReference<>() {
            });

            Object[][] dataArray = new Object[policyList.size()][1];
            for (int i = 0; i < policyList.size(); i++) {
                dataArray[i][0] = policyList.get(i);
            }
            return dataArray;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Example 3
    public Policy getJsonDataSingleObject(String filePath, Class<Policy> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Example 4
    public Policies getJsonDataWithArray(String filePath, Class<Policies> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(filePath), clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
