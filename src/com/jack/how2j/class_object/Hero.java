package com.jack.how2j.class_object;


public class Hero{

    private String name;
    float hp;
    float armor;
    int moveSpeed;
    public static final int killNum = 12;

    private static void battleWin(){
        System.out.println("battle win!");
    }

    class BattleScore{

        int kill;
        int die;
        int assit;

        public void legendary(){

            if (kill >= 8){
                System.out.println(name + " 超神了");
            }else {
                System.out.println(name + "没超神");
            }
        }
    }

    static class EnemyCrystal{

        int hp = 4000;
        public void checkIfVictory(){

            if (hp == 0){
                Hero.battleWin();
            }

        }

    }

    public static void main(String[] args) {
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.hp = 0;
        crystal.checkIfVictory();
    }

}































