package com.jack.how2j.collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: HashSet, LinkedHashSet, TreeSet的对比
     * HashSet: 无序
     * LinkedHashSet: 按插入顺序排序
     * TreeSet: 小到大排序
 * @Date: 2019/4/22 20:07
 * @Author: Wyj
 */
public class hashsetAndLinkedHashSetAndTreeSet {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(1534);
        hs.add(166);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(26456);
        lhs.add(2534);
        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(364534534);
        ts.add(334634);
        System.out.println(ts);
    }
}
