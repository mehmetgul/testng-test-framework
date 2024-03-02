package com.example.dataproviders.json.dataprovider;

import com.example.dataproviders.json.pojo.ex3.Policy;
import com.example.dataproviders.json.pojo.ex4.Policies;
import com.example.dataproviders.json.utility.JSonUtility;
import org.testng.annotations.DataProvider;

public class JSonDataProvider {

    //Example 1
    @DataProvider(name = "viaJsonSource")
    public Object[][] getSourceFromJson() {
        String filePath = System.getProperty("user.dir") + "/src/test/java/com/example/dataproviders/json/testdata/ex1.json";
        JSonUtility jsonUtility = new JSonUtility();
        return jsonUtility.getJsonData(filePath);
    }

    //Example2
    @DataProvider(name = "viaJsonSourceWithPojo")
    public Object[][] getSourceFromJsonWithPojo() {
        String filePath = System.getProperty("user.dir") + "/src/test/java/com/example/dataproviders/json/testdata/ex2.json";
        JSonUtility jsonUtility = new JSonUtility();
        return jsonUtility.getJsonDataWithPojo(filePath);
    }

    //Example 3
    @DataProvider(name = "viaJsonSource3")
    public Object[][] getSourceFromJsonSingleObject() {
        String filePath = System.getProperty("user.dir") + "/src/test/java/com/example/dataproviders/json/testdata/ex3.json";
        JSonUtility jsonUtility = new JSonUtility();
        Policy policyData = jsonUtility.getJsonDataSingleObject(filePath, Policy.class);

        return new Object[][]{{policyData}};
    }

    //Example 4
    @DataProvider(name = "viaJsonSource4")
    public Object[][] getSourceFromJsonWithArray() {
        String filePath = System.getProperty("user.dir") + "/src/test/java/com/example/dataproviders/json/testdata/ex4.json";
        JSonUtility jsonUtility = new JSonUtility();
        Policies policy = jsonUtility.getJsonDataWithArray(filePath, Policies.class);

        return new Object[][]{{policy}};
    }
}
