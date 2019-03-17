package com.jack.how2j.ThreadTest;

import com.jack.how2j.ThreadTest.Hero;

public class TestThread{
    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 400;
        gareen.damage = 20;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 500;
        teemo.damage = 30;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 500;
        leesin.damage = 32;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 650;
        bh.damage = 43;

        KillThread kt1 = new KillThread(gareen, teemo);
        new Thread(kt1).start();
        KillThread kt2 = new KillThread(leesin, bh);
        new Thread(kt2).start();
    }
}
