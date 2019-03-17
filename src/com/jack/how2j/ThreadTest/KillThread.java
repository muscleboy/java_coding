package com.jack.how2j.ThreadTest;

import com.jack.how2j.ThreadTest.Hero;

public class KillThread implements Runnable {
    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while (!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}

class Hero{
    public String name;
    public float hp;
    public int damage;

    public void attackHero(Hero h){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        h.hp -= damage;
        System.out.format("%s正在攻击%s, %s的血变成了%.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead()){
            System.out.println(h.name+"死了");
        }
    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }
}