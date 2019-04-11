package com.jack.how2j.array;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description: 数组合并
 * @Date: 2019/4/11 20:23
 * @Author: Wyj
 */
public class combine2Arrays {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] a1 = new int[4];
        int[] a2 = new int[a.length + a1.length];

        System.out.println("数组a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int item : a
             ) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("数组a1: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (int) (Math.random() * 100);
        }
        for (int item : a1
        ) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("复制到数组a2: ");
        System.arraycopy(a, 0, a2, 0, a.length);
        System.arraycopy(a1, 0, a2, a1.length, a1.length);

        for (int item : a2
             ) {
            System.out.print(item + " ");
        }
    }
}
