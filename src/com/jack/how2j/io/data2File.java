package com.jack.how2j.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.io
 * @Description:
 * @Date: 2019/3/17 17:49
 * @Author: Wyj
 */
public class data2File {
    public static void main(String[] args) {
       try{
           File f = new File("/Users/mac/Python_coding/java/1.txt");
           // 得到 xxx/java
           File dir = f.getParentFile();
           if(! dir.exists()){
               // mkdirs()会创建父目录，当不存在时。
               dir.mkdirs();
           }
           FileOutputStream fos = new FileOutputStream(f);
           byte[] data = {88, 89, 99, 119};
           fos.write(data);
           fos.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
