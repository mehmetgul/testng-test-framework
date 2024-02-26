package com.example.listeners.iannotationtransformer.ex1;

import org.testng.annotations.Test;

public class MyTestTransformer {

    @Test
    @DoNotRunInProd
    public void testNotForProduction(){
        System.out.println("Test1");
    }

    @Test
    public void regularTest(){
        System.out.println("Test2");
    }
}
