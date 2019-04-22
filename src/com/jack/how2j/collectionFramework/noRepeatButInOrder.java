package com.jack.how2j.collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: 取出π中的数字，重复的只取1个，并按顺序排好
 * @Date: 2019/4/22 20:16
 * @Author: Wyj
 */
public class noRepeatButInOrder {

    public static void main(String[] args) {

        Set<Integer> result = new LinkedHashSet<>();
        String pi = String.valueOf(Math.PI);
        pi = pi.replace(".", "");

        char[] cs = pi.toCharArray();
        for (char c : cs) {
            int num = Integer.parseInt(String.valueOf(c));
            result.add(num);
        }

        System.out.println(result);
    }
}
