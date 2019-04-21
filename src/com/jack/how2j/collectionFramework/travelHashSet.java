package com.jack.how2j.collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: hashset的遍历(迭代器，for循环)
 * @Date: 2019/4/21 17:15
 * @Author: Wyj
 */
public class travelHashSet {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(534);
        hs.add(11);
        hs.add(33);
        hs.add(44);

        for (Integer item : hs) {
            System.out.println(item);
        }

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
