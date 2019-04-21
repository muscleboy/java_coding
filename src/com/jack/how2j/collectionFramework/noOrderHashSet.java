package com.jack.how2j.collectionFramework;

import java.util.HashSet;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: hashset没有按元素的插入顺序排序
 * @Date: 2019/4/21 17:11
 * @Author: Wyj
 */
public class noOrderHashSet {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(3);
        hs.add(7);

        System.out.println(hs);
    }
}
