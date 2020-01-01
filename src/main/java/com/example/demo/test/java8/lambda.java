package com.example.demo.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class lambda {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("22", "1", "333");

       /* list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(list);*/

      /* list.sort((String s1,String s2)->{
           return s1.length()-s2.length();
       });
        System.out.println(list);*/
        list.sort((String s1,String s2)-> s1.length()-s2.length()
        );
        System.out.println(list);
    }
}
