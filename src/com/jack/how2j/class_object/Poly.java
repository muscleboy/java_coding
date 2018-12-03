package com.jack.how2j.class_object;

class Q{
    void callme(){
        System.out.println("inside Q");
    }
}

class W extends Q{
    void callme(){
        System.out.println("inside W");
    }
}

public class Poly {
    public static void main(String[] args) {
        Q q = new Q();
        W w = new W();
        Q e = new W();
        q.callme();
        w.callme();
        e.callme();
    }
}
