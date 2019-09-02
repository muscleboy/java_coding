package com.jack.how2j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description: 大文件拆分
 * @Date: 2019/3/17 18:40
 * @Author: Wyj
 */
public class splitFile {
    public static void main(String[] args) throws IOException {

        int eachSize = 1000 * 1024;
        File srcFile = new File("/Users/mac/java/1/EFI2.zip");
        splitFileFun(srcFile, eachSize);
    }

    public static void splitFileFun(File srcFile, int eachSize) {

        int fileNumber;
        int totalSize = 0;
        byte[] fileContent =  new byte[(int) srcFile.length()];

        if (srcFile.length() == 0){
            throw new RuntimeException("文件大小为0");
        }

        // 文件输入流
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            fis.read(fileContent);
        }catch (Exception e){
            e.printStackTrace();
        }

        if (srcFile.length() % 100 == 0){
            fileNumber = (int) (srcFile.length() / eachSize);
        }else {
            fileNumber = (int) ((srcFile.length() / eachSize) + 1);
        }

        for (int i = 0; i < fileNumber; i++) {
            String eachFileName = srcFile.getName() + "-" + i;
            File eachFile = new File(srcFile.getParentFile(), eachFileName);
            byte[] eachContent;

            // 统计文件大小
            totalSize += eachSize;

            if (i != fileNumber - 1){
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, eachSize * (i + 1));
            }else {
                // 最后一个文件大小为 剩下的大小
                eachContent = Arrays.copyOfRange(fileContent, eachSize * i, fileContent.length);
            }

            // 文件输出流
           try{
               FileOutputStream fos = new FileOutputStream(eachFile);
               fos.write(eachContent);
               fos.close();
               System.out.println("输出文件："+eachFileName+", 其大小："+eachSize);
           }catch (Exception e){
               e.printStackTrace();
           }
        }

        System.out.println("totalSize: "+totalSize);
    }
}
