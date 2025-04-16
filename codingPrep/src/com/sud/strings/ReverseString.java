package com.sud.strings;

import javax.xml.transform.stream.StreamSource;

public class ReverseString {

    public static void main(String[] args){
        System.out.println(reverseStringUsingRecursion("HEllo"));
    }

    public static String reverseStringUsingRecursion (String s){
        if (s == null || s.length() <= 1)
            return s;

        return reverseStringUsingRecursion(s.substring(1))+s.charAt(0);
    }

}
