package com.jack.how2j.array;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description: 选择排序
 * @Date: 2019/4/11 09:59
 * @Author: Wyj
 */
public class selectSorted {
    public static void main(String[] args) {
        int[] a = new int[5];
        int temp;

        System.out.println("原数组：");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int item : a) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("选择排序后：");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[j] < a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}
