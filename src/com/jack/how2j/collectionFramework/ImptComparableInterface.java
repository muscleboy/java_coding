package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 事先在实体类里实现了Comparable接口之后，Collections可直接进行排序
 * @Date: 2019/4/24 19:49
 * @Author: Wyj
 */
public class ImptComparableInterface {

    public static void main(String[] args) {

        Random r = new Random();
        List<Heros> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Heros("hero-" + i, r.nextInt(100), r.nextInt(100)));
        }

        // 排序之前
        System.out.println(list);

        Collections.sort(list);
        // 排序之后
        System.out.println(list);
    }
}
