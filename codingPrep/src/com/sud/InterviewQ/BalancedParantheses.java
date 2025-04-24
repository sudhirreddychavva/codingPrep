package com.sud.InterviewQ;

import java.util.Arrays;
import java.util.Stack;

public class BalancedParantheses {

    public static void main (String[] args){

        String par = "[{](}([)";



        char[] carray = par.toCharArray();
        boolean flag = checkParantheses(carray);
        System.out.println(flag);

    }

    private static boolean checkParantheses (char[] carray){
        Stack s = new Stack();
        for (int i = 0 ; i < carray.length ; i++) {
            if (carray[i] == '[' || carray[i] == '(' || carray[i] == '{') {
                s.push(carray[i]);
            } else {

                if (s.isEmpty()) {
                    return false;
                } else {
                    char c = (char) s.pop();
                    if (!((carray[i] == ']' && c == '[' )||(carray[i] == '}' && c == '{' ) || (carray[i] == ')' && c == '(' ))) {
                        return false;
                    }
                }
            }
        }

        if (s.isEmpty())
            return true;
        return false;
    }

}
