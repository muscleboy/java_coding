package com.jack.how2j.io;

import java.io.File;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/17 11:58
 * @Author: Wyj
 */
public class RecTravelSubDirectory {

    static long maxSize = 0;
    static long minSize = Integer.MAX_VALUE;
    static File maxFile = null;
    static File minFile = null;

    public static void listFiles(File f){
        if(f.isFile()){
            if(f.length() > maxSize){
                maxSize = f.length();
                maxFile = f;
            }
            if(f.length() != 0 && f.length() < minSize){
                minSize = f.length();
                minFile = f;
            }
        }
        if(f.isDirectory()){
            File[] fs = f.listFiles();
            if(null != fs){
                for(File e : fs){
                    listFiles(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("/Users/mac/python_coding");
        listFiles(f);
        System.out.println("bigest: "+maxFile.getAbsoluteFile()+" bytes: "+maxFile.length());
        System.out.println("smallest: "+minFile.getAbsoluteFile()+" bytes: "+minFile.length());
    }

}
