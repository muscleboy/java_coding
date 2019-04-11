package com.jack.how2j.array;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description:
 * @Date: 2019/4/11 19:30
 * @Author: Wyj
 */
public class sortPratice {
    public static void main(String[] args) {

        int[] a = new int[5];

        System.out.println("原数组: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int item : a
             ) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("选择正排: ");
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int item : a) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("冒泡倒排: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int item : a) {
            System.out.print(item + " ");
        }
    }
}
