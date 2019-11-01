package com.example.demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class listzhuanarray {

    public static void main(String[] args) {
        List<String> list=new ArrayList();
   String[] array=new String[list.size()];
        list.add("2");
        list.add("3");
        System.out.println(list);
        Object[] strings = list.toArray();
        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }

    }
}
