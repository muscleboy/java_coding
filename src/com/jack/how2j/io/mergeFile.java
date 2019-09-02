package com.jack.how2j.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/4/15 20:43
 * @Author: Wyj
 */
public class mergeFile {

    public static void main(String[] args) {

        mergeFileFun("/Users/mac/java/1/", "EFI2.zip");
    }

    public static void mergeFileFun(String folder, String fileName){

        try {
            // 基本文件输出流
            File destFile = new File(folder, fileName);
            FileOutputStream fos = new FileOutputStream(destFile);
            int index = 0;

            while (true){
                // index++ 骚操作
                File eachFile = new File(folder, fileName+"-" + index++);
                // 当循环到不存在的文件，跳出循环
                if (!eachFile.exists()){
                    break;
                }

                // 基本文件输入流
                FileInputStream fis = new FileInputStream(eachFile);
                byte[] eachContent = new byte[(int) eachFile.length()];
                fis.read(eachContent);
                fis.close();

                fos.write(eachContent);
                fos.flush();
                System.out.printf("把文件%s写入目标文件%n",eachFile);
            }

            fos.close();
            System.out.println("最后目标文件大小："+destFile.length());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }

}
