package com.example.listeners.iannotationtransformer.ex1;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoNotRunInProd {
    //Burasi bos kalabilir. Buna Marker annotation deniyor
}
