package com.jack.how2j.collectionFramework;

import java.util.HashMap;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/20 20:00
 * @Author: Wyj
 */
public class TestHashMap {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("company-1", "网易");
        hashMap.put("company-2", "小米");
        hashMap.put("company-3", "美团");

        System.out.println(hashMap);
    }
}
