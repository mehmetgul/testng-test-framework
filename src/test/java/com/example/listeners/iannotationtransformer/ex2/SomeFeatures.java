package com.example.listeners.iannotationtransformer.ex2;

import org.testng.annotations.Test;

public class SomeFeatures {

    @Test
    @FeatureTest(featureName= "NewFeature")
    public void testNewFeature(){
        System.out.println("This is new feature");
    }

    @Test
    @FeatureTest(featureName= "LegacyFeature")
    public void testLegacyFeatures(){
        System.out.println("This is Legacy feature");
    }
}
