package com.jack.how2j.class_object;

import static java.util.Arrays.sort;

public class Array_sort{
    public static void main(String[] args) {
        int a[] = {10,7,9,2,4,5,1,3,6,8};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
