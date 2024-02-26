package com.example.listeners.iannotationtransformer.ex2;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class FeatureFlagTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if(testMethod != null && testMethod.isAnnotationPresent(FeatureTest.class)){
            FeatureTest featureTest = testMethod.getAnnotation(FeatureTest.class);
            String featureName = featureTest.featureName();
            System.out.println("featureName = " + featureName);
            boolean isEnabled = FeatureFlagManager.isFeatureEnabled(featureName);
            System.out.println("isEnabled = " + isEnabled);
            annotation.setEnabled(isEnabled);
        }
    }

}
