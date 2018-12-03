package com.jack.javacourse.study.java_lab;

public class FastestPlayer {
    public static void main(String[] args) {
        String name[] = {"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma",
                "John","James","Jane","Emily","Danie","Neda","Aaron","Kate"};
        int time[] = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
        int max = time[0];
        int index = 0;
        for(int i=0;i<time.length-1;i++){
            //每一次和当前最大值比较
            if(time[i]>max){
                max = time[i];
                index = i;
            }
        }
        System.out.printf("name: "+name[index]+", max: "+ max+"分钟");
    }
}
