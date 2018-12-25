package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<String> p = new PriorityQueue<>();
        p.offer("aa");
        p.offer("dd");
        p.offer("jj");
        p.offer("jj");
        while (true){
            String temp = p.element();
            if(temp == null){
                break;
            }
            System.out.println(temp);
        }
    }
}
