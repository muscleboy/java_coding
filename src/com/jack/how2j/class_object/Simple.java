package com.jack.how2j.class_object;

class A{
    int i;
    void showi(){
        System.out.println("i: " + i);
    }
}
class B extends A{
    int k;
    void show(){
        System.out.println("k: " + k);
        showi();
    }
    void sum(){
        System.out.println("i+k: " + (i+k));
    }
}

public class Simple {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        subOb.i = 10;
        System.out.println("Contents in 父类: ");
        subOb.showi();
        subOb.i = 7;
        subOb.k = 9;
        System.out.println("Contents in 子类: ");
        subOb.show();
        System.out.println("Sum of i and k in 子类");
        subOb.sum();
    }
}
