package com.sud.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonApp {

    public static void main (String[] args){
        Person p = new Person("Sai3465", 25);
        Person p1 = new Person("sai1456", 50);

        List<Person> lps = new ArrayList<>();
        lps.add(p);
        lps.add(p1);

        double  i = lps.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println(i);

        List<String> k = lps.stream().map(Person::getName).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(k);


        List<Person>  l = lps.stream().filter(per -> validate(per)).collect(Collectors.toList());
        System.out.println(l.get(0).getName());


        List<String> j = new ArrayList<>();
        j.add("Banana");
        j.add("Apple");
        j.add(null);
        j.add("pineapple");
        j.add(null);

       List<String> o = j.stream().map(d -> {
           if (d == null)
               d = "NA";
           return d.toUpperCase();
       }).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(o);


        List<Integer> li = Arrays.asList(1,2,3,9,5,4,8);

        List<Integer>  m =  li.stream().map(i1 ->  {
            i1= i1*i1*i1;
            return i1;
        }).filter(k1 -> k1<50).collect(Collectors.toList());

        System.out.println(m);

        String mju = "sdfwstreter";

       Map mjg =  Arrays.stream(mju.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(mjg);
    }

    public static boolean validate(Person person){

        if (person.getAge() > 20 && person.getName().startsWith("S"))
            return true;
        else
            return false;
    }
}
