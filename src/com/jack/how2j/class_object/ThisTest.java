package com.jack.how2j.class_object;

public class ThisTest {
    public static void main(String[] args) {
        Local lo = new Local();
    }
}

class Local{
    public int i = 1;
    Local(int i){
        System.out.println("this.i=" + this.i);
        System.out.println("i=" + i);
    }
    Local(){
        this(6);
    }
}