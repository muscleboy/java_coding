package com.jack.how2j.swing;

//import static com.jack.how2j.swing.openInLastLocation;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.swing
 * @Description:
 * @Date: 2019/3/12 18:39
 * @Author: Wyj
 */
public class mainThread extends Thread{

    private JFrame f;
    File file = new File("pos.txt");

    mainThread(JFrame f){
        this.f = f;
    }

    @Override
    public void run() {
        while (true){
            int x = f.getX();
            int y = f.getY();
            try(
                    FileOutputStream fos = new FileOutputStream(file);
                    DataOutputStream dos = new DataOutputStream(fos);
                    ){
                dos.writeInt(x);
                dos.writeInt(y);
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
