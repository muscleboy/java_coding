package com.jack.javacourse.study.javabook.Part7_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("a.txt");
            int b;
            while ((b=fis.read())!=-1){
                System.out.println(b);
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(fis != null){
                    fis.close();
                }
            }catch (IOException e){

            }
        }
    }
}
