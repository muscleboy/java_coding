package com.jack.how2j.class_object;

/*
* @author Weiyj
* @version jdk11
* */

interface Healer{
    public void heal();
}

interface addArmor{
    public void addArmor();
}

public class Support extends Hero implements Healer{
    public void heal(){
        System.out.println("闪现奶你");
    }
    public void addArmor(){
        System.out.println("开护甲");
    }

    public static void main(String[] args) {
        Support naima = new Support();
        Support naiba = new Support();
        naima.heal();
        naiba.addArmor();
    }
}
