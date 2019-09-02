package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/13 19:03
 * @Author: Wyj
 */
public class ADHero extends Hero implements AD {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win ");
    }



    public static void main(String[] args) {
//        Hero.battleWin();
//        ADHero.battleWin();
    }

}
