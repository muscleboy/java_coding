package com.jack.javacourse.study.java_lab.Part8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class mergeFileContent {
    public static void main(String[] args) throws IOException {
        File f1 = new File("1.txt");
        File f2 = new File("2.txt");
        File f3 = new File("3.txt");
        FileInputStream fi1 = new FileInputStream(f1);
        FileInputStream fi2 = new FileInputStream(f2);
        FileOutputStream fo = new FileOutputStream(f3);
//        正常显示
        for(int i=0;i<f1.length();i++){
            fo.write(fi1.read());
        }
        for(int i=0;i<f2.length();i++){
            fo.write(fi2.read());
        }
        List<FileInputStream> l = new ArrayList<>();
        l.add(fi1);
        l.add(fi2);
        for(InputStream e:l){
//            结尾乱码
//            for(int i=0;i<=f1.length();i++){
//                fo.write(e.read());
//            }
//            全部乱码
//            while ((e.read()) != -1){
//                fo.write(e.read());
//            }
        }
        System.out.println("done!");
        fi1.close();
        fi2.close();
        fo.close();
    }
}
