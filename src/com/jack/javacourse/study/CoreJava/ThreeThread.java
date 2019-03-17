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
        ThreeThread t1 =  new ThreeThread("线程-1");
        ThreeThread t2 =  new ThreeThread("线程-2");
        ThreeThread t3 =  new ThreeThread("线程-3");
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }
//        System.out.println("exiting");
        System.out.println("Alive: "+t1.t.isAlive());
        System.out.println("Alive: "+t2.t.isAlive());
        System.out.println("Alive: "+t3.t.isAlive());
        t1.t.setPriority(9);
        try{
            System.out.println("Waiting thread Interrupted");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Alive: "+t1.t.isAlive());
        System.out.println("Alive: "+t2.t.isAlive());
        System.out.println("Alive: "+t3.t.isAlive());
    }
}
