package com.jack.how2j.array;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description: 数组反转
 * @Date: 2019/4/11 09:32
 * @Author: Wyj
 */
public class arrayReverse {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] a2 = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("原数组: ");
        for (int item : a) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("反转后：");
//        方法1
//        for (int i = 0; i < a.length; i++) {
//            a2[i] = a[a.length - i - 1];
//        }
//        for (int item : a2) {
//            System.out.print(item+" ");
//        }
        for (int i = 0; i < a.length / 2; i++) {
            int middle = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = middle;
        }
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}
