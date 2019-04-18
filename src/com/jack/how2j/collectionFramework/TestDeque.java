package com.jack.how2j.collectionFramework;

import java.util.LinkedList;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/18 20:36
 * @Author: Wyj
 */
public class TestDeque {

    public static void main(String[] args) {

        LinkedList<hero> deque = new LinkedList<>();

        deque.addLast(new hero("hero1"));
        deque.addLast(new hero("hero2"));
        deque.addLast(new hero("hero3"));

        System.out.println(deque);

        deque.addFirst(new hero("hexoX"));
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
        System.out.println(deque);

        // 取出元素，会导致元素被删除
        System.out.println(deque.removeFirst());
        System.out.println(deque);
    }

}
