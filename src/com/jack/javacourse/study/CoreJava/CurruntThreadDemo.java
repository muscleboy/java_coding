package com.jack.javacourse.study.CoreJava;

public class CurruntThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("当前线程: "+t);
        t.setName("my thread");
        System.out.println("改名之后: "+t);
        try{
            for(int i=0; i<5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
