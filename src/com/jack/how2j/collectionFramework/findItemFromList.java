package com.jack.how2j.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 在长度为200W 的ArrayList查找元素
 * @Date: 2019/4/22 20:57
 * @Author: Wyj
 */
public class findItemFromList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        int times = 10;
        int total = 1000 * 2000;
        for (int i = 1; i <= total; i++) {
            list.add("hero-" + i);
        }
        Collections.shuffle(list);

        for (int i = 0; i < times; i++) {
            long start = System.currentTimeMillis();
            for (int j = 1; j < total; j++) {
                if (list.get(j).equals("hero-2000000")) {
                    long end = System.currentTimeMillis();
                    System.out.println("找到了hero-2000000");
                    System.out.printf("第%d次查找，花了%d毫秒%n", i, end - start);
                }
            }
        }
    }
}
