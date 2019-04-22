package com.jack.how2j.collectionFramework;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description: ArrayList和HashSet对重复数据的比较
 * @Date: 2019/4/22 17:27
 * @Author: Wyj
 */
public class comparationForRepeat {

    /**
    * @Description: 重复判断标准：
     *                  首先看hashcode相不相同；
     *                  不同：则为不同的数据
     *                  相同：再比较equals,相同就是相同数据，不同则不是
    * @Param: [args]
    * @return: void
    */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        System.out.println("-------list----------");
        System.out.println("向List中插入数据: 9 9");
        System.out.println("List中有两个9: " + list);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(9);
        hs.add(9);
        System.out.println("-------hashset----------");
        System.out.println("向hashset中插入数据: 9 9");
        System.out.println("hashset中只保留1个9: " + hs);
    }
}
