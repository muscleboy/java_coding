package com.jack.how2j.class_object;

public class FingMax {
    public static void main(String[] args) {
        int a[] = {1,423,645,856,967,547,7};
        for(int i:a){
            for(int j=0;j<a.length-1;j++){
                //大 ---> 小
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
            System.out.print(a[0]);
    }
}
