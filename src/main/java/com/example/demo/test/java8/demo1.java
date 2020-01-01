package com.example.demo.test.java8;

/**接口的默认方法
 * @param
 * @author yangchaojie
 * @return
 */
public class demo1 {

    interface  cal{
        default public  int calculate(int a ,int b){
            return  a +b;
        }
    }

    public static void main(String[] args) {
        cal cal = new cal(){};
        System.out.println(cal.calculate(2,3));
        cal c1 = new cal(){
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };

        System.out.println(   c1.calculate(3,2));
    }
}
