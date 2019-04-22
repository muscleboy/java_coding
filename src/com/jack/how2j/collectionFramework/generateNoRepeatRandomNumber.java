package com.jack.how2j.collectionFramework;

import java.util.HashSet;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/22 17:35
 * @Author: Wyj
 */
public class generateNoRepeatRandomNumber {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 100; i++) {
//            先判断hs的大小
            if (hs.size() < 50) {
                hs.add((int) (Math.random() * 10000));
            }
        }
        System.out.println("得到50的不重复的随机数");
        System.out.println(hs);
    }
}
