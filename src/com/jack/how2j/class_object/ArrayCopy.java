package com.jack.how2j.class_object;

public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = {1,4,53,75,967,9};
        int b[] = new int[a.length];
//        int c[];
        System.arraycopy(a,0,b,0,a.length);
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
