package com.jack.how2j.class_object;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.class_object
 * @Description:
 * @Date: 2019/4/13 17:45
 * @Author: Wyj
 */
public class enumPratice {

    public static void main(String[] args) {
        for (HeroType item : HeroType.values()) {
            switch (item){
                case TANK:
                    System.out.println("坦克");
                    break;
                case WIZARD:
                    System.out.println("法师");
                    break;
                case ASSASSIN:
                    System.out.println("辅助");
                    break;
                case WARRIOR:
                    System.out.println("近战");
                case RANGED:
                    System.out.println("远程");
                    break;
                case PUSH:
                    System.out.println("推进");
                    break;
                case FARMING:
                    System.out.println("打野");
                    break;
            }
        }
    }

}


enum HeroType{
    TANK,
    WIZARD,
    ASSASSIN,
    WARRIOR,
    RANGED,
    PUSH,
    FARMING
}