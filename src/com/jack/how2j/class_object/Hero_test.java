package com.jack.how2j.class_object;

public class Hero_test {
    String name="GG";
    float hp;
    float armor;
    int moveSpeed;

    //只能访问到属性里的name
    public void setName1(String name){
        name = name;
    }

    public void setName2(String HeroName){
        name = HeroName;
    }

    public void setName3(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Hero_test h = new Hero_test();
        h.setName1("AA");
        System.out.println(h.name);

        h.setName2("BB");
        System.out.println(h.name);

        h.setName3("CC");
        System.out.println(h.name);
    }
}
