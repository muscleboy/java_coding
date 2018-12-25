package com.jack.javacourse.study.bilijava.AdvanceJava;

public class MyThreadForRunnable implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+"，"+ i+"次循环");
        }
    }
}
