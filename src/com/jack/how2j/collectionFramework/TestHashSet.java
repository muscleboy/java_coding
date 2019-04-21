package com.jack.how2j.collectionFramework;

import java.util.HashSet;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/21 17:08
 * @Author: Wyj
 */
public class TestHashSet  {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("hero-1");
        System.out.println(names);
        names.add("hero-1");
        System.out.println(names+" "+names.size());
    }
}
