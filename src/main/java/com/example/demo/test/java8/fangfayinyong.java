package com.example.demo.test.java8;

import java.nio.channels.SocketChannel;

/**
 * @param
 * @author yangchaojie
 * @return
 */
public class fangfayinyong {


    public static void main(String[] args) {
        test test2 = fangfayinyong::test2;

        test2.run();
    }

    public static void test2(){
        System.out.println("哈喽");
    }
}




@FunctionalInterface
interface test {
    public void run();
}


