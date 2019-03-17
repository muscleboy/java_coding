package com.jack.javacourse.study.java_lab.Part8;

import java.io.*;

public class mergeFileContent3 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("1.txt");
//        File f2 = new File("2.txt");
//        File f3 = new File("3.txt");
//        int length = (int)f1.length();
//        char b[] = new char[length/10];
//        FileReader fr1 = new FileReader(f1);
//        FileReader fr2 = new FileReader(f2);
//        FileWriter fw = new FileWriter(f3);
//        int counts=0,times=0;
//        while (( counts=fr1.read()) != -1){
//            fr1.read(b);
//            fw.write(b);
//            times ++;
//        }
        String dirname = "src";
        File fi = new File(dirname);
        for(File e:fi.listFiles()){
            System.out.println(e);
        }
    }
}
