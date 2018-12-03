package com.jack.how2j.class_object;

/**
 * @author Weiyj
 * @version jdk11
 * */

abstract class Animal {
    protected int legs;
    protected void Animal(){
        int legs;
    }
    abstract void eat();
    public void walk(int legs){
        System.out.println("walk with " + legs + " legs");
    }

}

public class Spider extends Animal{
    public void eat(){
        System.out.println("吃");
    }

    public static void main(String[] args) {
        Spider s = new Spider();
        s.eat();
//        s.walk();
        s.walk(3);
//        s.legs;
    }

}
