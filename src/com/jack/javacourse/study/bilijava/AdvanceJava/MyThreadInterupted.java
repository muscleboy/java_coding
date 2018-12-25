package com.jack.javacourse.study.bilijava.AdvanceJava;

import static java.lang.Thread.currentThread;

public class MyThreadInterupted {
    public void run(){
        while (true){
            System.out.println("线程执行");
            boolean isInteruped = currentThread().isInterrupted();
            if(isInteruped){
                System.out.println("线程设置为中断");
                break;
            }
        }
    }
}
