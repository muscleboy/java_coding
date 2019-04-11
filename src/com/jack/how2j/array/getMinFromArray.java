package com.jack.how2j;


/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j
 * @Description:
 * @Date: 2019/4/11 09:12
 * @Author: Wyj
 */
public class getMinFromArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        int min;
        a[0] = (int)(Math.random() * 100);
        a[1] = (int)(Math.random() * 100);
        a[2] = (int)(Math.random() * 100);
        a[3] = (int)(Math.random() * 100);
        a[4] = (int)(Math.random() * 100);
        a[5] = (int)(Math.random() * 100);
        a[6] = (int)(Math.random() * 100);
        a[7] = (int)(Math.random() * 100);
        a[8] = (int)(Math.random() * 100);
        a[9] = (int)(Math.random() * 100);

        min = a[0];
        for(int i = 0; i < a.length; i ++){
            if(a[i] < min){
                min = a[i];
            }
        }
        for(int item : a){
            System.out.println(item);
        }
        System.out.println("===="+ min);
    }
}
