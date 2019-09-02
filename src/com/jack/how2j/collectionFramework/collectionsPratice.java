package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 初始化一个List, 长度是10，值是0-9。
 *               然后不断的shuffle，直到前3位出现3 1 4
 *               shuffle 1000,000 次，统计出现的概率
 * @Date: 2019/4/22 16:55
 * @Author: Wyj
 */
public class collectionsPratice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        int times = 0;
        for (int i = 0; i < 1000 * 1000; i++) {
            Collections.shuffle(list);
//            System.out.println(list.get(0) + " "+list.get(1)+" "+list.get(2));
            if (list.get(0) == 3 && list.get(1) == 1 && list.get(3) == 4) {
                times ++;
            }
        }

        // 1000d
        double rate = times / (1000d * 1000);
        System.out.println(rate);
    }
}
