package com.example.listeners.iannotationtransformer.ex2;

import java.util.HashMap;
import java.util.Map;

public class FeatureFlagManager {
    private static Map<String, Boolean> featureFlags = new HashMap<>();
    static {
        featureFlags.put("NewFeature", true);
        featureFlags.put("LegacyFeature", false);
    }

    public static boolean isFeatureEnabled(String featureName){
        return  featureFlags.getOrDefault(featureName,false);
    }
}
