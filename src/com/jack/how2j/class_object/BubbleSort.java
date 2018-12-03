package com.jack.how2j.class_object;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {4,6,2,12,7,9,0,13,645,23,423,9789,987};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int j=0;j<a.length;j++){
            for(int i=0;i<a.length-1-j;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for(int b : a){
            System.out.print(b + " ");
        }
    }
}
