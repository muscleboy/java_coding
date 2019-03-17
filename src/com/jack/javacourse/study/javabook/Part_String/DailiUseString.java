package com.jack.javacourse.study.javabook.Part_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DailiUseString {
    public static void main(String[] args) {
        // AI聊天
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            String s = sc.next();
//            String a, b;
//            a = s.replace('？',' ');
//            b = a.replace('吗',' ');
//            System.out.println(b);
//        }
        // 按字典序列排序
//        String l[] = {"java", "python", "mysql", "git", "bootstrap", "ssm", "mac"};
//        for(int i=0; i<l.length-1; i++){
//            for(int j=i+1; j<l.length; j++){
//                if(l[i].compareTo(l[j]) > 0){
//                    String t = l[i];
//                    l[i] = l[j];
//                    l[j] = t;
//                }
//            }
//        }
//        for(String s:l){
//            System.out.println(s);
//        }
        // 字符串反转
//        String s = "I Lova java and python";
//        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb.reverse());

        // regex for phonenumbers
//        Pattern p = null;
//        Matcher m = null;
//        boolean b = false;
//        // ^[1] 表示1开头
//        p = Pattern.compile("^[1][6789]\\d{9}");
//        String nums[] = {"13222222222","18378335969","14796234473"};
//        for(String s:nums){
//            m = p.matcher(s);
//            b = m.matches();
//            System.out.println("是否手机号码: "+ b);
//        }
        String s = "123fsdaf4";
        String a = "1236534yhdf";
        if(s.equals(a)){
            System.out.println("equals");
        }
        if(s == "123"){
            System.out.println("==");
        }
    }
}
