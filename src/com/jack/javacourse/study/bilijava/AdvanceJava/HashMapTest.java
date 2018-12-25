package com.jack.javacourse.study.bilijava.AdvanceJava;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();
        for(int i=0; i< 10; i++){
            hm.put(i, "第"+i+"行");
        }
        System.out.println(hm);
        Set<Integer> keys = hm.keySet();
        for(Integer key:keys){
            System.out.println(key);
        }
    }
}
