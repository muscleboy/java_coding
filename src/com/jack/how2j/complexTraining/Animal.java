package com.jack.how2j.complexTraining;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j
 * @Description:
 * @Date: 2019/4/15 17:16
 * @Author: Wyj
 */
public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("用"+legs+"走路");
    }

    public abstract void eat();

}
