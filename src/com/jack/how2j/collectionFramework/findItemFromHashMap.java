package com.jack.how2j.collectionFramework;


import java.util.HashMap;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 在长度为200W 的HashMap查找元素, 花费的时间
 * @Date: 2019/4/22 21:14
 * @Author: Wyj
 */
public class findItemFromHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        int times = 10;
        int total = 2000 * 1000;
        // 初始化
        for (int i = 1; i <= total; i++) {
            hm.put(i, "hero-" + i);
        }

        // 查找
        for (int i = 0; i < times; i++) {
            long start = System.currentTimeMillis();
            hm.get("hero-2000000");
            long end = System.currentTimeMillis();
            System.out.printf("第%d次查找，花了%d毫秒%n", i, end - start);
        }
    }
}
