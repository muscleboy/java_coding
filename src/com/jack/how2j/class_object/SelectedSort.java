package com.jack.how2j.class_object;

public class SelectedSort {
    public static void main(String[] args) {
        int a[] = {7,9,3,2,8,0,4,756,453,24,123,645};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k] + " ");
        }
    }
}
