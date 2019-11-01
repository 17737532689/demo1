package com.example.demo.test;

import com.example.demo.entity.Color;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class enumdemo {

    public static void main(String[] args) {
        String name = Color.getName(1);

        System.out.println("名字"+name);
    }
}
