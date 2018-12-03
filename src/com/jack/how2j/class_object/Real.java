package com.jack.how2j.class_object;

abstract class Abs{
    abstract void show();
    abstract void show(int i);
}

public class Real extends Abs{
    int x;
    void show(){
        System.out.println("x: " + x);
    }
    void show(int i){
        x = i;
        System.out.println("x: " + x);
    }

    public static void main(String[] args) {
        Real r = new Real();
        r.show();
        r.show(10);
    }
}
