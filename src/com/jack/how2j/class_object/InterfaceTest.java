package com.jack.how2j.class_object;

interface IA{
    int a = 1;
    void showa();
}

interface IB extends IA{
    int b = 2;
    void showb();
}

interface IC extends IB{
    int c = 3;
    void showc();
}

public class InterfaceTest implements IA {
    public void showa(){
        System.out.println("aaa");
    }
    public void showb(){
        System.out.println("bbb");
    }
    public void showc(){
        System.out.println("ccc");
    }

    public static void main(String[] args) {
        InterfaceTest it = new InterfaceTest();
        it.showa();
        it.showb();
        it.showc();
    }
}
