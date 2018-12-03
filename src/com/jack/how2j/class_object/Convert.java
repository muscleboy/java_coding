package com.jack.how2j.class_object;

class CA{
    String s = "class CA";
}

class CB extends CA{
    String s = "class CB";
}

public class Convert {
    public static void main(String[] args) {
        CB bb,b = new CB();
        CA a,aa;
        a = (CA)b;    //用子类表示父类，显式转换
        aa = b;       //隐式转换
        System.out.println(a.s);
        System.out.println(aa.s);
        bb = (CB)a;  //父类转换为子类，显式转换(只能)
        System.out.println(bb.s);
    }


}
