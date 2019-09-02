package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/15 16:11
 * @Author: Wyj
 */
public class Weapon extends abstractPratices {
    @Override
    public boolean disposable() {

        System.out.println("武器使用后不会消失！");

        return false;
    }

}
