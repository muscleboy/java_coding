package com.jack.how2j.collectionFramework;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.collectionFramework
 * @Description:
 * @Date: 2019/4/20 18:43
 * @Author: Wyj
 */
public class binaryTreeInsertData {

    public Node leftNode;
    public Node rightNode;
    public Object value;

    public static void main(String[] args) {

        int randoms[] = new int[]{67,7,30,73,10,0,78,81,10,74};
        Node roots = new Node();
        for (int n : randoms) {
            roots.add(n);
        }
    }
}
