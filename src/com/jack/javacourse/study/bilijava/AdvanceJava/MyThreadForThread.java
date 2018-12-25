package com.jack.javacourse.study.bilijava.AdvanceJava;

public class MyThreadForThread extends Thread {

    public MyThreadForThread(){

    }

    public MyThreadForThread(String name){
        super(name);
    }

    public void run(){
        for(int i=0; i<100; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+", "+i);
        }
    }
}
