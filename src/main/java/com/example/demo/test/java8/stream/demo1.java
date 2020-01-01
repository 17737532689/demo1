package com.example.demo.test.java8.stream;


import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class demo1 {

    public static void main(String[] args) {
        Stream<String> integerStream = Stream.of("1", "2", "3", "4");

      //  Integer[] integers = integerStream.toArray(Integer[]::new);
      //  System.out.println(integers[1]);

       /* String s = integerStream.collect(Collectors.joining()).toString();
        System.out.println("String"+s);*/
      /*  List<String> collect1 = integerStream.collect(Collectors.toList());
        System.out.println("list"+collect1);*/
       /* Set<String> collect = integerStream.collect(Collectors.toSet());
        System.out.println("set"+collect);*/

     /*  ArrayList<String> collect2 = integerStream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println("集合"+collect2);*/
      HashSet<String> collect3 = integerStream.collect(Collectors.toCollection(HashSet::new));
        System.out.println("哈希"+collect3);
    }
}
