package com.jack.javacourse.study.bilijava.AdvanceJava;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        MyThreadForRunnable my = new MyThreadForRunnable();
//        Thread t1 = new Thread(my, "线程1");
//        Thread t2 = new Thread(my, "线程2");
//        t1.start();
//        t2.start();

        //线程 新建状态
//        MyThreadForThread t1 = new MyThreadForThread("线程1");
//        MyThreadForThread t2 = new MyThreadForThread("线程2");
//        MyThreadForThread t3 = new MyThreadForThread("线程3");
//        MyThreadForThread t4 = new MyThreadForThread("线程4");
//
//        //线程优先级 1 ---> 10, 默认5
//        t1.setPriority(1);
//        t2.setPriority(6);
//        t3.setPriority(9);
//
//        //线程 可运行状态
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//
////        Thread.sleep(5000);
////        Boolean b3 = t3.isAlive();
////        System.out.println(b3);
//        //线程休眠 -> Thread.sleep();
//        //而不是对象.sleep()
//        t1.join(1000);
//        System.out.println("执行主线程==============================");

        MyThreadInterupted mti = new MyThreadInterupted();


    }
}
