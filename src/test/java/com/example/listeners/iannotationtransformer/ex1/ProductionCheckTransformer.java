package com.example.listeners.iannotationtransformer.ex1;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ProductionCheckTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod != null && shouldBeDisabled(testMethod)) {
            annotation.setEnabled(false);
        }
    }

    private boolean shouldBeDisabled(Method testMethod) {
        String environment = System.getProperty("env");
        System.out.println("environment = " + environment);
        return "prod".equals(environment) && testMethod.isAnnotationPresent(DoNotRunInProd.class);
    }


}
