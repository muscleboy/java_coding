package com.jack.how2j.swing;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.how2j.swing
 * @Description: 在上次关闭位置打开
 * @Date: 2019/3/12 18:33
 * @Author: Wyj
 */
public class openInLastLocation {

    public static void main(String[] args) {

        JFrame f = new JFrame("mainframe");
        f.setSize(400, 500);
        Point p = getPointFromLocationFile();
        if(p != null)
            f.setLocation(p.x, p.y);
        else
            f.setLocation(200, 200);
        f.setLayout(null);

        JButton b = new JButton("啪啪");
        b.setBounds(50, 50, 200, 40);
        f.add(b);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        new mainThread(f).start();
    }

    static class Point{
        int x, y;
    }

    public static Point getPointFromLocationFile(){
        File file = new File("pos.txt");
        Point p = null;
        try(
                FileInputStream fis = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fis);
                ){
            int x = dis.readInt();
            int y = dis.readInt();
            p = new Point();
            p.x = x;
            p.y = y;
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e1){
            e1.printStackTrace();
        }
        return p;
    }
}
