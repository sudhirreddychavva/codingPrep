package com.sud.strings;

import java.lang.reflect.Field;

public class MutatingStringUsingReflection {

    public static void main (String[] args) throws NoSuchFieldException, IllegalAccessException {

        String s = "sudhir";

        String s1 = new String("sudhir");

        Field f = String.class.getDeclaredField("value");

        f.setAccessible(true);
        f.set(s,"Saranya".toCharArray());

        System.out.println(s1);


    }
}
