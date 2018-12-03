package com.jack.how2j.class_object;

import java.util.Random;

public class Array_reversed {
    public static void main(String[] args) {
        int a[] = new int[5];
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(100);
            }
        System.out.println("原数组：");
        for(int b=0;b<a.length;b++)
            System.out.print(a[b]+" ");

        System.out.println();
        System.out.println("反转: ");
        for(int j=0;j<(a.length-1)/2;j++){
            int temp = a[j];
            a[j] = a[a.length-1-j];
            a[a.length-1-j] = temp;
        }

        for(int k=0;k<a.length;k++){
            System.out.print(a[k] + " ");
        }
    }
}
