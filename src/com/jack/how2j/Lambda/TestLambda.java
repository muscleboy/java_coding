package com.jack.how2j.Lambda;

import com.jack.how2j.collectionFramework.Heros;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.Lambda
 * @Description: 常规的筛选，过滤
 * @Date: 2019/4/25 10:49
 * @Author: Wyj
 */
public class TestLambda {

    public static void main(String[] args) {

        Random r = new Random();
        List<Heros> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Heros("hero-" + i, r.nextInt(1000), r.nextInt(100)));
        }

        // 筛选之前
        System.out.println(heros);

        List<Heros> filter = new ArrayList<>();
        for (Heros h : heros) {
            if (h.hp > 500 && h.damage > 50) {
                filter.add(h);
            }
        }
        // 筛选之后sgdsdgs
        System.out.println(filter);
    }
}
