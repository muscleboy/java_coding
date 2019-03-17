package com.jack.javacourse.study.CoreJava;

class NewThread extends Thread{
    NewThread(){
        super("Demo thread");
        System.out.println("Child thread: "+ this);
        start();
    }
    public void run(){
        try {
            for(int i=5; i>0; i--){
                System.out.println("Child thread: "+ i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ThreadForExtend{
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=5; i>0; i--){
                System.out.println("Main thread: "+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}


