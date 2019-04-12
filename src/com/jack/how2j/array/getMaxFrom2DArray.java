package com.jack.how2j.array;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description: 取得二维数组最大值
 * @Date: 2019/4/11 20:36
 * @Author: Wyj
 */
public class getMaxFrom2DArray {
    public static void main(String[] args) {

        int[][] a = new int[5][5];
        int max = -1;
        int target_i = -1;
        int target_j = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
// 输出

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 1; j < a.length - 1; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//        }
        for (int[] row : a) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                if (a[i][j] > max){
                    max = a[i][j];
                    target_i = i;
                    target_j = j;
                }
            }
        }

        System.out.println(max+"下标: "+"["+target_i+"]"+"["+target_j+"]");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 1; j < a.length; j++) {
//                System.out.print(a[]);
//            }
//        }
    }
}
