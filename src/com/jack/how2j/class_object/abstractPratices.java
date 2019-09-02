package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/15 16:09
 * @Author: Wyj
 */
public abstract class abstractPratices {

    public abstract boolean disposable();

    public static void main(String[] args) {

        Weapon w = new Weapon();
        LifePotion lp = new LifePotion();

        w.disposable();
        lp.disposable();

    }

}
