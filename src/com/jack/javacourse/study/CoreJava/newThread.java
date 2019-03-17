package com.jack.javacourse.study.CoreJava;

public class newThread implements Runnable {
    Thread t;
    newThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: "+ t);
        t.start();
    }
    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        new newThread();
        try{
            for(int i=5; i>0; i--){
                System.out.println("Main Thread: "+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

