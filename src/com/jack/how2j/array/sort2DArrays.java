package com.jack.how2j.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description: 二维数组排序
 * @Date: 2019/4/12 19:44
 * @Author: Wyj
 */
public class sort2DArrays {
    public static void main(String[] args) {

        int[][] a = new int[5][8];
        int[] b = new int[a.length * a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new Random().nextInt(100);
            }
        }

        for (int[] item : a) {
            System.out.println(Arrays.toString(item));
        }

//        二维数组选择排序

        for (int i = 0; i < a.length; i++) { //5
            for (int j = 0; j < a[i].length; j++) { // 8
                for (int k = 0; k < a[i].length - 1; k++) {
                    if (a[i][k] > a[i][j]){
                        int temp = a[i][k];
                        a[i][k] = a[i][j];
                        a[i][j] = temp;
                    }
                }
            }
        }

//        二维数组冒泡排序

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                for (int k = 0; k < a[i].length- 1; k++) {
//                    if (a[i][k] < a[i][k + 1]){
//                        int temp = a[i][k];
//                        a[i][k] = a[i][k + 1];
//                        a[i][k + 1] = temp;
//                    }
//                }
//            }
//        }

        System.out.println();

        for (int[] item : a) {
            System.out.println(Arrays.toString(item));
        }

////        二维数组 --> 一维数组
//        for (int i = 0; i < a.length; i++) {
//            System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
//        }
//
//        Arrays.sort(b);
////        一维数组 --> 二维数组
//        for (int i = 0; i < a.length; i++) {
//            System.arraycopy(b, i * a[i].length, a[i], 0, a[i].length);
//        }
//        for (int[] item : a) {
//            System.out.println(Arrays.toString(item));
//        }
    }
}
