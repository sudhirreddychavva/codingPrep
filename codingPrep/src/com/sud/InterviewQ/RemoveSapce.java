package com.sud.InterviewQ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveSapce {

    public static void main (String[] args){
        String s = "hello  hi how are you";
        String k = Arrays.stream(s.split(" ")).collect(Collectors.joining(""));

        System.out.println(k);

        String a = "";
        for (int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);

            if (!Character.isWhitespace(c)){
                a += c;
            }
        }

        System.out.println(a);

    }

}
