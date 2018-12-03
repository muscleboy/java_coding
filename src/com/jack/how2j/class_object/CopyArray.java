package com.jack.how2j.class_object;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int a[] = {2,1,5,6,8,9,0,77};
        int b[] = Arrays.copyOfRange(a,0,7);
        for(int c:b){
            System.out.print(c+" ");
        }
    }
}
