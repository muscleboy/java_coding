package com.jack.how2j.class_object;

class SuperCla{
    int a = 1, b = 4;
    void show(){
        System.out.println("super result=" + (a+b));
    }
}

class SubCla extends SuperCla{
    int a = 10;
    void show(){
        int c = a*b;
        System.out.println("Sub result=" + c);
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        SuperCla sp = new SuperCla();
        SubCla sb = new SubCla();
        sp.show();
        System.out.println("In super class:a=" + sp.a);
        sb.show();
        System.out.println("In sub class:a=" + sb.a);
    }
}
