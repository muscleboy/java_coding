package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/13 19:20
 * @Author: Wyj
 */
public interface AD {
    public void physicAttack();

    default public void revive(){
        System.out.println("英雄复活");
    }

}
