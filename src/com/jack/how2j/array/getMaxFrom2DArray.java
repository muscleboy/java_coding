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

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
// 输出
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
