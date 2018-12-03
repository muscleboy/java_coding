package com.jack.javacourse.study.javabook;

public class InnerClass {
    private int k=20;
    public static void f1(){
        System.out.println("外部类");
    }
    public static class Inner{
        public void f(){
            System.out.println("内部类");
        }
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        Inner i = new Inner();

        ic.f1();
        i.f();
    }
}
