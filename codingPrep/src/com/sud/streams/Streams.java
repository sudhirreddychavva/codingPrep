package com.sud.streams;

import java.net.StandardSocketOptions;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class Streams {


    public static void main (String[] args){

        String s = "My, name. is Sudhir";

        String[] dem = {","," ","."};

        String k = Arrays.stream(s.split(", | \\. |  ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));

        System.out.println(k);


        List<List<String>> l = Arrays.asList(
                Arrays.asList("Kohili", "A.kumar","jp Kumar"),
                Arrays.asList("Dhoni", "B.kumar","CSK Jadeja")
        );

       List<String> names = l.stream().flatMap(l1 -> l1.stream()).filter(sk -> sk.contains("kumar")).collect(Collectors.toList());
       System.out.println(names);


       String n = "dsfwwwasdwfr";

       Character f  = n.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1 ).map(Map.Entry::getKey).findFirst().orElse(null);

       System.out.println(f);


       List<Character>  ch =  n.chars().mapToObj(c -> (char) c).collect(Collectors.toList()).stream().distinct().collect(Collectors.toList());

       System.out.println(ch);

        List<Integer> numbers = Arrays.asList(1, 2, 3,3, 4, 5);

        List lkjhg= numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(lkjhg);

        int sum = numbers.stream().reduce(0, Integer::sum);
        Map<Boolean,List<Integer>> ikp = numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(sum);
        System.out.println(ikp);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<String> lko = list1.stream().filter(list2::contains).collect(Collectors.toList()).stream().map(d -> d+"*").collect(Collectors.toList());
        System.out.println(lko);

        Map<String, Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",30);
        map.put("C",20);

        Map<String,Integer> p = map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1,
                LinkedHashMap::new));
        System.out.println(p);




    }

}
