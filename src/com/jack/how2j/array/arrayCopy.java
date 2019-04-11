package com.jack.how2j.array;

import java.util.Arrays;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.array
 * @Description:
 * @Date: 2019/4/11 20:15
 * @Author: Wyj
 */
public class arrayCopy {
    public static void main(String[] args) {

        int[] a = new int[5];
        Arrays.fill(a, 5);

        int[] a1 = new int[5];

        System.arraycopy(a, 0, a1, 0, a.length);

        for (int item : a1
             ) {
            System.out.print(item + " ");
        }
    }
}
