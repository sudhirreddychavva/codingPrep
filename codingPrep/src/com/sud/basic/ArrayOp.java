package com.sud.basic;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayOp {

    public static void main (String[] args){
        int[] postIndex = new int[]{10 - 1};

        ArrayList ar = new ArrayList();

        //postIndex[0]--;

        for (int i=10; i< 20;i++){
            ar.add(i);
        }


        Map mp = (Map<Integer,Integer>) ar.stream().collect(Collectors.toMap(i -> i,i -> ar.indexOf(i)));
        System.out.println(mp);


        Double a = 0.0;

        if(a != 0.0){
            System.out.println("true");
        }else  {
            System.out.println(Double.valueOf("0"));
            System.out.println("false");
        }

    }
}
