package com.jack.javacourse.study.CoreJava;


import java.util.Random;

public class StringTest {
    public static void main(String[] args) {
        String s = "a";
        Random r = new Random();
        for(int i=0; i<10; i++){
            int g = r.nextInt(10);
            s += g;
        }
        System.out.println(s);
    }
}
