package com.jack.how2j.class_object;

interface AD{
    public void physicAttack();
}

interface  AP{
    void magicAttack();
}

public class Hero implements AD,AP{

    String name;
    int hp;
    double armor;

    public void physicAttack(){
        System.out.println("物理攻击");
    }
    public void magicAttack(){
        System.out.println("魔法攻击");
    }

    public static void main(String[] args) {
        Hero p = new Hero();
        Hero m = new Hero();

        p.physicAttack();
        m.magicAttack();
    }

}
