package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
    public static void main(String[] args) {
        Deque<String> d = new LinkedList<>();
        d.push("jj1");
        d.push("jj2");
        d.push("jj3");
        d.push("jj4");
//        System.out.println(d);

        String s = d.peek();
//        System.out.println(s);
//        System.out.println(d);
        while (d.size() > 0){
            System.out.println(d.pop());
        }
        System.out.println(d);
    }
}
