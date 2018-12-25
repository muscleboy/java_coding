package com.jack.javacourse.study.CoreJava;

public class ThreeThread implements Runnable {
    String name;
    Thread t;
    public ThreeThread(String threadname){
        name = threadname;
        t = new Thread(this, threadname);
        System.out.println("new thread" +": "+ t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5; i>0; i--){
                Thread.sleep(1000);
                System.out.println(name + ": "+ i);
            }
        }catch (InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + "exiting");
    }

    public static void main(String[] args) {
        new ThreeThread("线程-1");
        new ThreeThread("线程-2");
        new ThreeThread("线程-3");
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }
//        System.out.println("exiting");
    }
}
