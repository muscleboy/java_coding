package com.jack.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.socket
 * @Description:
 * @Date: 2019/9/2 08:28
 * @Author: Wyj
 */
public class SocketClient {

    public static void main(String[] args) throws IOException {

        // 连接到服务端
        Socket s = new Socket("127.0.0.1", 7000);
        // 数据输入，输出流
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        System.out.println("请输入边长: ");
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        while (flag){

            // 将输入的值输出到输出流dos, 传到服务器
            dos.writeDouble(input.nextDouble());
            // 从服务器获取结果
            double area = dis.readDouble();
            System.out.println("从服务器获取的面积：" + area);
            flag = false;
        }

        s.close();
    }

}
