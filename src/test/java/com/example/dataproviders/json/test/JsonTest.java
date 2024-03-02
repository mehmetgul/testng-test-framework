package com.example.dataproviders.json.test;

import com.example.dataproviders.json.dataprovider.JSonDataProvider;
import com.example.dataproviders.json.pojo.ex2.PolicyData;
import com.example.dataproviders.json.pojo.ex3.Policy;
import com.example.dataproviders.json.pojo.ex4.Claim;
import com.example.dataproviders.json.pojo.ex4.Policies;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class JsonTest {

    //Example 1
    @Test(dataProvider = "viaJsonSource", dataProviderClass = JSonDataProvider.class)
    public void myTest(Object policyData) {
        System.out.println("policyData = " + policyData);
        System.out.println(((Map<?, ?>) policyData).get("policyNumber"));

        Assert.assertNotNull(((Map) policyData).get("policyNumber"), "Policy number should not be null");

        Map<String, Object> policyMap = (Map<String, Object>) policyData;
        String policyNumber = (String) policyMap.get("policyNumber");
        String policyHolder = (String) policyMap.get("policyHolder");
        Double premium = (Double) policyMap.get("premium");
        String expiryDate = (String) policyMap.get("expiryDate");

        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder: " + policyHolder);
        System.out.println("Policy premium: " + premium);
        System.out.println("Policy expiryDate: " + expiryDate);
    }

    //Example 2
    @Test(dataProvider = "viaJsonSourceWithPojo", dataProviderClass = JSonDataProvider.class)
    public void testPolicyData(PolicyData policy) {
        Assert.assertNotNull(policy.getPolicyNumber(), "Policy number should not be null");

        // Now you can easily access all properties of policy
        System.out.println("Testing policy: " + policy.getPolicyNumber());
        System.out.println("policy.getPolicyHolder() = " + policy.getPolicyHolder());
        System.out.println("policy.getExpiryDate() = " + policy.getExpiryDate());
        System.out.println("policy.getPremium() = " + policy.getPremium());
        // Add more assertions and test logic as needed
    }

    //Example 3
    @Test(dataProvider = "viaJsonSource3", dataProviderClass = JSonDataProvider.class)
    public void testPolicyData(Policy policyData) {
        // Now, policyData is a single instance populated from the JSON object.
        System.out.println("Policy Holder Name: " + policyData.getPolicyHolder().getName());
        System.out.println("policyData.getPolicyHolder().getAddress().getStreet() = " + policyData.getPolicyHolder().getAddress().getStreet());
        // Perform your test assertions or operations here
    }

    //Example 4
    @Test(dataProvider = "viaJsonSource4",dataProviderClass = JSonDataProvider.class)
    public void testPolicyClaims(Policies policy) {
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        for (Claim claim : policy.getClaims()) {
            System.out.println("Claim Number: " + claim.getClaimNumber() + ", Amount: " + claim.getAmount());
            // Perform your test assertions or operations here, such as verifying claim amounts or types
        }
    }
}
