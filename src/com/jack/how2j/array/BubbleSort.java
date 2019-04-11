package com.jack.how2j.array;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description: 冒泡排序
 * @Date: 2019/4/11 19:14
 * @Author: Wyj
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        for (int item : a) {
            System.out.print(item + " ");
        }

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int item : a
             ) {
            System.out.print(item + " ");
        }
    }
}
